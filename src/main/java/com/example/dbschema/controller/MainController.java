package com.example.dbschema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about"; // Você pode criar esta página depois
    }

    @GetMapping("/help")
    public String help() {
        return "help"; // Você pode criar esta página depois
    }
}