package com.milanbdjuric.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class KorgSynth implements Synth{

    public KorgSynth(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getSineWave() {
        return "BIIIIIP! BIIIIIIP!";
    }
}
