package com.milanbdjuric.springbootrestsecurity.dao;

import com.milanbdjuric.springbootrestsecurity.entity.Synth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SynthRepository extends JpaRepository<Synth, Integer> {
}
