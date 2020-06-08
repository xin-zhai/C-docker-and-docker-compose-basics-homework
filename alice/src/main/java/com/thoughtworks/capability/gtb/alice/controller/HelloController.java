package com.thoughtworks.capability.gtb.alice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("http://bob:8080/hello",String.class);
        return result;
    }
}
