package com.example.demo.controller;

import com.example.demo.entity.Synth;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/synths")
public class SynthController {

    private List<Synth> theSynths;

    @PostConstruct
    private void loadData(){

        Synth synth1 = new Synth("Moog", "Sirin",12345);
        Synth synth2 = new Synth("Dreadbox", "Typhon",54321);
        Synth synth3 = new Synth("Roland", "J-6", 10293);

        theSynths = new ArrayList<>();

        theSynths.add(synth1);
        theSynths.add(synth2);
        theSynths.add(synth3);
    }

    @GetMapping("/list")
    public String listSynths(Model theModel){

        theModel.addAttribute("synths", theSynths);

        return "list-synths";
    }
}
