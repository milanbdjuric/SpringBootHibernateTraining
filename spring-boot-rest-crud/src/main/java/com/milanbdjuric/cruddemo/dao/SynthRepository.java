package com.milanbdjuric.cruddemo.dao;

import com.milanbdjuric.cruddemo.entity.Synth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="synthesizers")
public interface SynthRepository extends JpaRepository<Synth, Integer> {

}
