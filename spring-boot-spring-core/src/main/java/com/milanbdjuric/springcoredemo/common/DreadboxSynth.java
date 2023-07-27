package com.milanbdjuric.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class DreadboxSynth implements Synth{
    @Override
    public String getSineWave() {
        return "BAAAAAP! BAAAAAP!";
    }
}
