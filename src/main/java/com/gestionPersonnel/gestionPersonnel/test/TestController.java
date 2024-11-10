package com.gestionPersonnel.gestionPersonnel.test;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {

    private final TestDAO testDAO;

    @GetMapping("/message")
    public String message() {
        return testDAO.message();
    }
}
