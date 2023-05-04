package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class train {
    @GetMapping("/mytrain")
    public String getData(){
        return "Please book your tickets from makemytrip";
    }
}
