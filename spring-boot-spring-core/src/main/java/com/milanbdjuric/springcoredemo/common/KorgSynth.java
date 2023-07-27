package com.milanbdjuric.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class KorgSynth implements Synth{
    @Override
    public String getSineWave() {
        return "BIIIIIP! BIIIIIIP!";
    }
}
