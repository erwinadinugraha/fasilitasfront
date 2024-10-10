/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.go.pajak.fasilitashibah.util;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Locale;

/**
 *
 * @author TIK
 */
@Component
public class CommonUtil {

//    @Value("${app.year.start}")
//    private String year;
    
    public String maskingNpwp(String npwp15) {
        String npwpFormated = npwp15.substring(0, 2) + "." + npwp15.substring(2, 5) + "." + npwp15.substring(5, 8) + "." + npwp15.substring(8, 9) + "-" + npwp15.substring(9, 12) + "." + npwp15.substring(12, 15);
        return npwpFormated;
    }
    
    public ArrayList<String> generateYearsByList(String listTahun) {
        ArrayList result = new ArrayList();
        String[] parts = listTahun.split("/");
        for (String part : parts) {
            result.add(part);
        }
        return result;
    }

    public JsonObject objectToJson(Object obj) {
        ObjectMapper mapper = new ObjectMapper();
        String json = "";
        try {
            json = mapper.writeValueAsString(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
        JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
        return jsonObject;
    }
    
    public String currencyFormat(String jmlstr, String currcode) {
        double value;
        if (jmlstr.equals("") || jmlstr.equals(null)) {
            value = Double.parseDouble("0");
        } else {
            value = Double.parseDouble(jmlstr);
        }

        StringBuilder sb = new StringBuilder();
        if ("360".equals(currcode)) {
            Formatter formatter = new Formatter(sb, Locale.GERMAN);
            formatter.format("%(,.0f", value);
        } else {
            Formatter formatter = new Formatter(sb, Locale.US);
            formatter.format("%(,.2f", value);
        }
        return sb.toString();
    }
}
