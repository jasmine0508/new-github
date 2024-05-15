package com.demo.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demo() {
        return "Hello world from Demo App";
    }
    
    @GetMapping("/demo1")
    public String Demo1() {
        String Ste = "One";
        return "Hello world from Demo App";
    }
}
