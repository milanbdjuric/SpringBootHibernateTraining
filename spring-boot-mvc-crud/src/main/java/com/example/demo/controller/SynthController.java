package com.example.demo.controller;

import com.example.demo.entity.Synth;
import com.example.demo.service.SynthService;
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

    private SynthService synthService;

    public SynthController(SynthService theSynthService){
        synthService = theSynthService;
    }



    @GetMapping("/list")
    public String listSynths(Model theModel){

        List<Synth> theSynths = synthService.findAll();

        theModel.addAttribute("synths", theSynths);

        return "list-synths";
    }
}
