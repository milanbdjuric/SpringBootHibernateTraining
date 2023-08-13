package com.milanbdjuric.cruddemo.dao;

import com.milanbdjuric.cruddemo.entity.Synth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SynthRepository extends JpaRepository<Synth, Integer> {
}
