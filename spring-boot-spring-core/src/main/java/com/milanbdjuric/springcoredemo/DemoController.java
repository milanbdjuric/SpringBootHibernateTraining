package com.milanbdjuric.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Synth mySynth;

    @Autowired // optional if u have only 1 constructor
    public DemoController(Synth theSynth) {
        mySynth = theSynth;
    }

    @GetMapping("/synthsound")
    public String getSynthSound(){
        return mySynth.getSineWave();
    }

}
