package com.milanbdjuric.springcoredemo.rest;

import com.milanbdjuric.springcoredemo.common.Synth;
import jakarta.servlet.http.PushBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Synth mySynth;

    @Autowired                                                             // constructor injection - optional if u have only 1 constructor
    public DemoController(@Qualifier("korgSynth") Synth theSynth) {        // - @Qualifier has higher priority than @Primary!!
        mySynth = theSynth;
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
/*
    @Autowired   // setter injection
    public void setMySynth(Synth theSynth){
        mySynth = theSynth;
    }

*/
    @GetMapping("/synthsound")
    public String getSynthSound(){
        return mySynth.getSineWave();
    }

}
