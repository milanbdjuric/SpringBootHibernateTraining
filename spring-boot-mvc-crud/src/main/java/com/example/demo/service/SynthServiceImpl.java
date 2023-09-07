package com.example.demo.service;

import com.example.demo.dao.SynthRepository;
import com.example.demo.entity.Synth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SynthServiceImpl implements SynthService{

    private SynthRepository synthRepository;

    @Autowired
    public SynthServiceImpl(SynthRepository theSynthRepository){
        synthRepository = theSynthRepository;
    }

    @Override
    public List<Synth> findAll() {
        return synthRepository.findAllByOrderByManufacturerNameAsc();
    }

    @Override
    public Synth findById(int theId) {
        Optional<Synth> result = synthRepository.findById(theId);

        Synth theSynth = null;

        if (result.isPresent()){
            theSynth = result.get();
        }
        else {
            throw new RuntimeException("Did not find synth id - " + theId);
        }

        return theSynth;
    }

    @Override
    public void save(Synth theSynth) {
        synthRepository.save(theSynth);
    }

    @Override
    public void deleteById(int theId) {
        synthRepository.deleteById(theId);
    }
}
