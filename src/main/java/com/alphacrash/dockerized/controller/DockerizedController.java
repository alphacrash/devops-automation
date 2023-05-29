package com.alphacrash.dockerized.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerizedController {

    @GetMapping("/message")
    public String getMessage() {
        return "Hello, from Docker!";
    }
}
