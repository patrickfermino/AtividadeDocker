package com.exemplo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/ola")
    public String olaMundo() {
        return "Olá, Mundo!";
    }
}
