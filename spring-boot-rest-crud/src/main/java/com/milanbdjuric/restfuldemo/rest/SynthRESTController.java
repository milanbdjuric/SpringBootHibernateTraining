package com.milanbdjuric.restfuldemo.rest;

import com.milanbdjuric.restfuldemo.entity.Synth;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SynthRESTController {

    @GetMapping("/synths")
    public List<Synth> getSynths(){

        List<Synth> theSynths = new ArrayList<>();

        theSynths.add(new Synth("Moog", "Sirin"));
        theSynths.add(new Synth("Roland", "J-6"));
        theSynths.add(new Synth("Dreadbox", "Typhon"));

        return theSynths;
    }
}
