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
}
