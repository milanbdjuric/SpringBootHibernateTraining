package com.milanbdjuric.cruddemo.service;

import com.milanbdjuric.cruddemo.entity.Synth;

import java.util.List;

public interface SynthService {

    List<Synth> findAll();

    Synth findById(int theId);

    Synth save(Synth theSynth);

    void deleteById(int theId);
}
