package com.elderbyte.paassample;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    static int counter = 0;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot! Invoked " + ++counter + " times!";
    }
}