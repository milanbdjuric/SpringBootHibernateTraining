package com.milanbdjuric.cruddemo.dao;

import com.milanbdjuric.cruddemo.entity.Synth;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class SynthDAOImpl implements SynthDAO{

    private EntityManager entityManager;

    @Autowired
    public SynthDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public List<Synth> findAll() {

        TypedQuery<Synth> theQuery = entityManager.createQuery("from Synth", Synth.class);

        List<Synth> synths = theQuery.getResultList();

        return synths;
    }

    @Override
    public Synth findById(int theId) {

        Synth theSynth = entityManager.find(Synth.class, theId);

        return theSynth;
    }

    @Override
    public Synth save(Synth theSynth) {

        Synth dbSynth = entityManager.merge(theSynth);

        return dbSynth;
    }

    @Override
    public void deleteById(int theId) {

        Synth theSynth = entityManager.find(Synth.class, theId);

        entityManager.remove(theSynth);

    }
}
