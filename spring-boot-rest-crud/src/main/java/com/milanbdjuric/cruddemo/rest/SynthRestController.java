package com.milanbdjuric.cruddemo.rest;

import com.milanbdjuric.cruddemo.entity.Synth;
import com.milanbdjuric.cruddemo.service.SynthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SynthRestController {

    private SynthService synthService;

    @Autowired
    public SynthRestController(SynthService theSynthService){

        synthService = theSynthService;
    }

    @GetMapping("/synths")
    public List<Synth> findAll(){

        return synthService.findAll();
    }


}
