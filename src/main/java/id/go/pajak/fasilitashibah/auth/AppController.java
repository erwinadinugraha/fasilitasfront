/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.go.pajak.fasilitashibah.auth;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class AppController {


    @GetMapping(value = "/duar")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("index");
        HttpSession session = request.getSession();
        if (session.getAttribute("auth") != null) {
            return new ModelAndView(new RedirectView("/dashboard", true, false));
        } else {
            return new ModelAndView(new RedirectView("/auth/login", true, false));
        }
    }

    @GetMapping("/dashboard")
    @ResponseBody
    public String dashboard() {
        System.out.println("dashboard");
        return "ini adalah dashboard";
    }


}
