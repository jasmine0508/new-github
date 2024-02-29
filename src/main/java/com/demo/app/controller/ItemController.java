package com.demo.app.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {


    @GetMapping("/item")
    public String item() {
        return "hello item";
    }
}
