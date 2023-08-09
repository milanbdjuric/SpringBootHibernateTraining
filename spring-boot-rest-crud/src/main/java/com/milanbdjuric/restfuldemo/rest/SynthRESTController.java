package com.milanbdjuric.restfuldemo.rest;

import com.milanbdjuric.restfuldemo.entity.Synth;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SynthRESTController {

    private List<Synth> theSynths;

    @PostConstruct
    public void loadData(){

        theSynths = new ArrayList<>();

        theSynths.add(new Synth("Moog", "Sirin"));
        theSynths.add(new Synth("Roland", "J-6"));
        theSynths.add(new Synth("Dreadbox", "Typhon"));


    }

    @GetMapping("/synths")
    public List<Synth> getSynths(){

        return theSynths;
    }

    @GetMapping("/synths/{synthId}")
    public Synth getSynth(@PathVariable int synthId){

        if((synthId >= theSynths.size() || (synthId < 0))){
            throw new SynthNotFoundException("Synth ID not found - " + synthId);
        }
        return theSynths.get(synthId);
    }

    @ExceptionHandler
    public ResponseEntity<SynthErrorResponse> handleException(SynthNotFoundException exception){

        SynthErrorResponse error = new SynthErrorResponse();

        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exception.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<SynthErrorResponse> handleException(Exception exception) {

        SynthErrorResponse error = new SynthErrorResponse();

        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exception.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);

    }

}
