package com.milanbdjuric.springbootrestsecurity.rest;

import com.milanbdjuric.springbootrestsecurity.entity.Synth;
import com.milanbdjuric.springbootrestsecurity.service.SynthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SynthRestController {

    private SynthService synthService;

    @Autowired
    public SynthRestController(SynthService theSynthService){
        synthService = theSynthService;
    }

    @GetMapping("/employees")
    public List<Synth> findAll(){
        return synthService.findAll();
    }

    @GetMapping("/synths/{synthId}")
    public Synth getSynth(@PathVariable int synthId){

        Synth theSynth = synthService.findById(synthId);

        if(theSynth == null){
            throw new RuntimeException("Synth id not found - " + synthId);
        }
        return theSynth;
    }

    @PostMapping("/synths")
    public Synth addSynth(@RequestBody Synth theSynth){
        theSynth.setId(0);
        Synth dbSynth = synthService.save(theSynth);
        return dbSynth;
    }

    @PutMapping("/synths")
    public Synth updateSynth(@RequestBody Synth theSynth){

        Synth dbSynth = synthService.save(theSynth);

        return dbSynth;
    }

    @DeleteMapping("/synths/{synthId}")
    public String deleteSynth(@PathVariable int synthId){

        Synth tempSynth = synthService.findById(synthId);

        if (tempSynth == null){
            throw new RuntimeException("Synth id not found - " + synthId);
        }

        synthService.deleteById(synthId);

        return "Deleted synth id - " + synthId;



    }


}
