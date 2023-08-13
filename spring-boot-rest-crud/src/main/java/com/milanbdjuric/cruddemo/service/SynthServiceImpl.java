package com.milanbdjuric.cruddemo.service;

import com.milanbdjuric.cruddemo.dao.SynthRepository;
import com.milanbdjuric.cruddemo.entity.Synth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        return synthRepository.findAll();
    }

    @Override
    public Synth findById(int theId) {

        Optional<Synth> result = synthRepository.findById(theId);
        Synth theSynth = null;

        if (result.isPresent()) {
            theSynth = result.get();
        } else {
            throw new RuntimeException("Did not find synth ID - " + theId);
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
