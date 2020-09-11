package com.Api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {
    @GetMapping("/")
    public String testMethod(){
        return "working ... !!";
    }
}
