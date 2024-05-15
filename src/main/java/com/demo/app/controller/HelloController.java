package com.demo.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String demo() {
        return "Hello world from HelloController App";
    }

    @GetMapping("/hello1")
    public String HellowTest() {
        String Hello="Code";
        return "Hello world from HelloController App";
    }
}

