package com.example.keycloak.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(path = "/test")
    public Map test(Model model) {
    	    Map param = new HashMap();
      	param.put("CODE", "0000");
        param.put("MESSAGE", "TEST");
        return param;
    }
}