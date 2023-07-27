package com.milanbdjuric.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy  // - not initialized because it`s not needed currently
public class MoogSynth implements Synth {

    public MoogSynth(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getSineWave() {
        return "BEEEEEEP! BEEEEEEEP!";
    }
}
