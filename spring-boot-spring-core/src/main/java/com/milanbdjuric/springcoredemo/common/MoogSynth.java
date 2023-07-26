package com.milanbdjuric.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class MoogSynth implements Synth {

    @Override
    public String getSineWave() {
        return "BEEEEEEP! BEEEEEEEP!";
    }
}
