package com.milanbdjuric.cruddemo.dao;

import com.milanbdjuric.cruddemo.entity.Synth;

import java.util.List;

public interface SynthDAO {

    List<Synth> findAll();

    Synth findById(int theId);

    Synth save(Synth theSynth);

    void deleteById(int theId);



}
