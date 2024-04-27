package com.logginginterceptor.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/getExample")
    public String getExample(){

        return "Hello, this is an example api. Check your console to see if Logging Interceptor is working...";
    }
}
