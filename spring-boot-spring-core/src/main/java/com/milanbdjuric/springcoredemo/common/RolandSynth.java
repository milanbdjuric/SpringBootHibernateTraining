package com.milanbdjuric.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // we can only mark 1 primary class annotation, but @Qualifier comes 1st
public class RolandSynth implements Synth{
    @Override
    public String getSineWave() {
        return "BOOOOOP! BOOOOOP!";
    }
}
