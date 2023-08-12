package com.milanbdjuric.cruddemo.service;

import com.milanbdjuric.cruddemo.dao.SynthDAO;
import com.milanbdjuric.cruddemo.entity.Synth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
