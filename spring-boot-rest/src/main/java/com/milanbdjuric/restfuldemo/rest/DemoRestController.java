package com.milanbdjuric.restfuldemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRestController {

    @GetMapping("/yo")
    public String sayYo(){
        return "Yo! Yo!";
    }
}
