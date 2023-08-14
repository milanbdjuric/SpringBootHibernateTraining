package com.milanbdjuric.springbootrestsecurity.service;

import com.milanbdjuric.springbootrestsecurity.dao.SynthRepository;
import com.milanbdjuric.springbootrestsecurity.entity.Synth;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SynthServiceImpl implements SynthService{

    private  SynthRepository synthRepository;

    public SynthServiceImpl(SynthRepository theSynthRepository){
        synthRepository = theSynthRepository;
    }

    @Override
    public List<Synth> findAll() {
        return synthRepository.findAll();
    }

    @Override
    public Synth findById(int theId) {
        Optional<Synth> result = synthRepository.findById(theId);
        Synth theSynth = null;
        if(result.isPresent()){
            theSynth = result.get();
        }
        else {
            throw new RuntimeException("Did not find the synth id - " + theId);
        }

        return theSynth;
    }

    @Override
    public Synth save(Synth theSynth) {
        return synthRepository.save(theSynth);
    }

    @Override
    public void deleteById(int theId) {
        synthRepository.deleteById(theId);

    }
}
