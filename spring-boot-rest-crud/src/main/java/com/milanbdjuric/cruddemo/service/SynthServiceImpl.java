package com.milanbdjuric.cruddemo.service;

import com.milanbdjuric.cruddemo.dao.SynthDAO;
import com.milanbdjuric.cruddemo.entity.Synth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SynthServiceImpl implements SynthService{

    private SynthDAO synthDAO;
    @Autowired
    public SynthServiceImpl(SynthDAO theSynthDAO){
        synthDAO = theSynthDAO;
    }

    @Override
    public List<Synth> findAll() {
        return synthDAO.findAll();
    }

    @Override
    public Synth findById(int theId) {
        return synthDAO.findById(theId);
    }

    @Transactional
    @Override
    public Synth save(Synth theSynth) {
        return synthDAO.save(theSynth);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        synthDAO.deleteById(theId);

    }
}
