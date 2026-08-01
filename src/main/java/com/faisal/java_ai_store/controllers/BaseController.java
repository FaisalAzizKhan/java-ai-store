package com.faisal.java_ai_store.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BaseController {
    
    @GetMapping("/")
    public String base() {
        return "Server is running 🚀";
    }
    
}
