package com.milanbdjuric.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary                                          // we can only mark 1 primary class annotation, but @Qualifier comes 1st; without @QUalifier - this would be implemented
public class RolandSynth implements Synth{

    public RolandSynth(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanupStuff: " + getClass().getSimpleName());
    }





    @Override
    public String getSineWave() {
        return "BOOOOOP! BOOOOOP!";
    }
}
