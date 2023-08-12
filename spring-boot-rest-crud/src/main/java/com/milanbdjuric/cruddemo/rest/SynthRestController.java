package com.milanbdjuric.cruddemo.rest;

import com.milanbdjuric.cruddemo.dao.SynthDAO;
import com.milanbdjuric.cruddemo.entity.Synth;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SynthRestController {

    private SynthDAO synthDAO;

    public SynthRestController(SynthDAO theSynthDAO){
        synthDAO = theSynthDAO;
    }

    @GetMapping("/synths")
    public List<Synth> findAll(){
        return synthDAO.findAll();
    }


}
