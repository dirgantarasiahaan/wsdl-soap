package com.soap.wsdl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.soap.wsdl.wsdl.Output;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
public class GetLinkController {

    @Autowired
    GetLinkClient client;

    @PostMapping("/getRemitance")
    public ResponseEntity<?> getVerint2(@RequestBody Map<String,String> body) throws IOException {
        String remitanceNo = body.get("remitanceNoInput");
        String result;
        Output response = client.getUrl(remitanceNo);

        result = response.getRemittanceNo().trim();
        System.out.println("output : " +  result );

        Response res = new Response();
        res.setRemitanceNoOutput(result);

        return ResponseEntity.ok(res);
    }
}
