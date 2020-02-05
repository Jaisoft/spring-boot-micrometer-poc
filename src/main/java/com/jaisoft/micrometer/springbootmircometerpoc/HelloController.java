package com.jaisoft.micrometer.springbootmircometerpoc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from test micrometer and prometheus";
    }

}
