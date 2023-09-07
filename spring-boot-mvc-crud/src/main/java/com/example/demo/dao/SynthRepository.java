package com.example.demo.dao;

import com.example.demo.entity.Synth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SynthRepository extends JpaRepository<Synth, Integer> {
}
