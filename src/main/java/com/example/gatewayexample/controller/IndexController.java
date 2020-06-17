package com.example.gatewayexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {

    @GetMapping("/health1")
    @ResponseBody
    public String health1() {
        return "health1:success";
    }

    @GetMapping("/health2")
    @ResponseBody
    public String health2() {
        return "health2:success";
    }
}
