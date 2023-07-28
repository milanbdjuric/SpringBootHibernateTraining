package com.milanbdjuric.springcoredemo.config;

import com.milanbdjuric.springcoredemo.common.SequentialSynth;
import com.milanbdjuric.springcoredemo.common.Synth;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SynthConfig {

    @Bean("polySynth")
    public Synth sequentialSynth(){
        return new SequentialSynth();
    }


}
