package com.milanbdjuric.springcoredemo.common;

public class SequentialSynth implements Synth{

    public SequentialSynth(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }


    @Override
    public String getSineWave() {
        return "BUUUUP! BUUUP!";
    }
}
