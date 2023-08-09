package com.milanbdjuric.restfuldemo.rest;

import com.milanbdjuric.restfuldemo.entity.Synth;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SynthRESTController {

    private List<Synth> theSynths;

    @PostConstruct
    public void loadData(){

        theSynths = new ArrayList<>();

        theSynths.add(new Synth("Moog", "Sirin"));
        theSynths.add(new Synth("Roland", "J-6"));
        theSynths.add(new Synth("Dreadbox", "Typhon"));


    }

    @GetMapping("/synths")
    public List<Synth> getSynths(){

        return theSynths;
    }
}
