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
//  private Synth anotherSynth;

    @Autowired                                                    // constructor injection - optional if u have only 1 constructor
    public DemoController(@Qualifier("korgSynth") Synth theSynth)
      /*    @Qualifier("korgSynth") Synth theAnotherSynth)*/   {
        mySynth = theSynth;
        //   anotherSynth = theAnotherSynth;

        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @GetMapping("/synthsound")
    public String getSynthSound(){
        return mySynth.getSineWave();
    }
/*
    @GetMapping("/check")
    public String check(){
        return "Comparing beans: mySynth == anotherSynth, " + (mySynth == anotherSynth);
        // if it`s Singleton - it`ll be true; if it`s Prototype then it`ll be false
    }

*/

}
