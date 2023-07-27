package com.milanbdjuric.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class DreadboxSynth implements Synth{

    public DreadboxSynth(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getSineWave() {
        return "BAAAAAP! BAAAAAP!";
    }
}
