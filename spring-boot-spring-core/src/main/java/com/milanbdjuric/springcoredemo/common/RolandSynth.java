package com.milanbdjuric.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class RolandSynth implements Synth{
    @Override
    public String getSineWave() {
        return "BOOOOOP! BOOOOOP!";
    }
}
