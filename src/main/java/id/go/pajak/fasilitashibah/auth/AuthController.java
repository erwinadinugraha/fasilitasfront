package id.go.pajak.fasilitashibah.auth;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import id.go.pajak.fasilitashibah.config.AuthProperties;
import id.go.pajak.fasilitashibah.domain.dto.UserAuth;
import id.go.pajak.fasilitashibah.domain.dto.UserData;
import id.go.pajak.fasilitashibah.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.common.exceptions.InvalidTokenException;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/auth")
public class AuthController {
    @Value("${app.role}")
    private String role;
    private final AuthService authService;
    private final AuthProperties authProperties;
    private final CommonUtil common;

    @Autowired
    public AuthController(AuthService authService, AuthProperties authProperties, CommonUtil common) {
        this.authService = authService;
        this.authProperties = authProperties;
        this.common = common;
    }

    @GetMapping(value = "/login")
    public ModelAndView login() {
        return new ModelAndView(new RedirectView(authProperties.getAuthEndpoint() + "?client_id=" + authProperties.getClientId()
                + "&response_type=code&redirect_uri=" + authProperties.getRedirectUri(), true, false));

    }

    @RequestMapping(value = "/cek", method = RequestMethod.GET)
    public ModelAndView cek(@RequestParam(required = false) String code, RedirectAttributes redirectAttributes,
                            HttpSession sessionObj, HttpServletResponse response) throws IOException {
        if (!code.isEmpty()) {
            // tukarkan code dengan access_token
            // bawa access_token untuk akses halaman yang dipagari dengan oauth
            UserAuth user = authService.getToken(code);
            if (user != null) {
                sessionObj.isNew();
                sessionObj.setAttribute("auth", user);
                if (null != user.getAccess_token()) {
                    return new ModelAndView(new RedirectView("/dashboard", true, false));
                } else {
                    return new ModelAndView(new RedirectView("/auth/login", true, false));
                }
            } else {
                return new ModelAndView(new RedirectView("/auth/login", true, false));
            }
        } else {
            return new ModelAndView(new RedirectView("/auth/login", true, false));
        }
    }

    @GetMapping(value = "/logout")
    public ModelAndView logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        if (session.getAttribute("auth") != null) {
            UserAuth user = (UserAuth) session.getAttribute("auth");
            session.invalidate();
            if (null != user) {
                return new ModelAndView(new RedirectView(
                        authProperties.getLogoutUri() + "?token=" + user.getAccess_token() + "&redirect=" + authProperties.getApphost(), true, false));
            } else {
                return new ModelAndView(new RedirectView("/auth/login", true, false));
            }
        } else {
            return new ModelAndView(new RedirectView("/auth/login", true, false));
        }
    }

    public String checkAuth(HttpServletRequest request) {
        String urlRedirect;
        HttpSession session = request.getSession();
        if (session.getAttribute("auth") != null) {
            UserAuth authModel = (UserAuth) session.getAttribute("auth");
            OAuth2Authentication authentication = null;
            try {
                authentication = authService.loadAuthentication(authModel.getAccess_token());


                System.out.println("authentication: " + SecurityContextHolder.getContext().getAuthentication().getPrincipal());
            } catch (AuthenticationException | InvalidTokenException e) {
                urlRedirect = "/auth/login";
                return urlRedirect;
            }

            List<GrantedAuthority> authorities = new ArrayList<>(authentication.getAuthorities());
            if (authorities.contains(new SimpleGrantedAuthority(role))) {
                String npwp = (String) authentication.getPrincipal();
                if (npwp != null && npwp.length() == 15) {
                    if (session.getAttribute("userdata") == null || session.getAttribute("userdata").equals("")) {
                        // TODO: Perubahan NPWP 16 (NIK)
                        Gson gson = new Gson();
                        JsonObject jsonObject = common.objectToJson(authentication.getDetails());
                        UserData userData = gson.fromJson(jsonObject, UserData.class);
                        //SET SESSION
                        userData.setNpwp16((userData.getNpwp16() == null || userData.getNpwp16().equals("")) ? "-" : userData.getNpwp16());
                        userData.setNitku((userData.getNitku() == null || userData.getNitku().equals("")) ? "-" : userData.getNitku());
                        session.setAttribute("userdata", userData);
                    }
                    UserData sessionWp = (UserData) session.getAttribute("userdata");
                    if (sessionWp.getKdjnswp().equals("1") || sessionWp.getKdjnswp().equals("2")) {
                        urlRedirect = null;
                    } else {
                        session.invalidate();
                        urlRedirect = "/err/403";
                    }
                } else {
                    session.invalidate();
                    urlRedirect = authProperties.getSso();
                }
            } else {
                urlRedirect = "/err/403";
            }
        } else {
            urlRedirect = "/auth/login";
        }

        return urlRedirect;
    }
}
