package com.example.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping(value = {"/","/elibrary","/elibraty/home"})
    public String displayHomePage(){
        return "home/index";
    }
}
