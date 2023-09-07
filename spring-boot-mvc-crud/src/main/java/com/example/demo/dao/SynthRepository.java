package com.example.demo.dao;

import com.example.demo.entity.Synth;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SynthRepository extends JpaRepository<Synth, Integer> {

    public List<Synth> findAllByOrderByManufacturerNameAsc();

}
