package com.milanbdjuric.springboothibernatetraining.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @GetMapping("/")
    public String hey(){
        return "HEY!";
    }
    @GetMapping("/yo")
    public String yo(){
        return "YO!";
    }

    @Value("${synth.name}")
    private String synthName;

    @Value("${manufacturer.name}")
    private String manufacturerName;

    @GetMapping("/synthinfo")
    public String getSynthInfo(){
        return "Synth: " + synthName + ", Manufacturer: "
                 + manufacturerName;
    }
}
