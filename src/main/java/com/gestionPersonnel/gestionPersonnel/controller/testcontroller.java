package com.gestionPersonnel.gestionPersonnel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testcontroller {

    @GetMapping("/message")
    public String getMessage(){
        return "Welcome! We're thrilled to have you here!";
    }
}
