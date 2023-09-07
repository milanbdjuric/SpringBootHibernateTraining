package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Synth;

public interface SynthService {

    List<Synth> findAll();

    Synth findById(int theId);

    void save(Synth theSynth);

    void deleteById(int theId);


}
