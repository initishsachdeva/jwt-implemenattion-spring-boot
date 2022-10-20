package com.jwt.jwtimplementationspringboot.restcontrollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @RequestMapping(value={"", "/", "/home"})
    public String welcome(){
        String text = "Welcome to the home page. ";
        text+= "This page cannot be accessed by unauthenticated users";
        return text;
    }
}
