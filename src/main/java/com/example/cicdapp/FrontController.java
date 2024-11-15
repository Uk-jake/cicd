package com.example.cicdapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FrontController {

    @RequestMapping("/")
    public Map<String, Object> index(){
        Map<String, Object> model = new HashMap<>();

        model.put("result", "success");

        return model;
    }
}
