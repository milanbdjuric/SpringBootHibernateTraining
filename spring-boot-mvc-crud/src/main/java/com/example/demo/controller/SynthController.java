package com.example.demo.controller;

import com.example.demo.entity.Synth;
import com.example.demo.service.SynthService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/synths")
public class SynthController {

    private SynthService synthService;

    public SynthController(SynthService theSynthService){
        synthService = theSynthService;
    }



    @GetMapping("/list")
    public String listSynths(Model theModel){

        List<Synth> theSynths = synthService.findAll();

        theModel.addAttribute("synths", theSynths);

        return "synths/list-synths";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){

        Synth theSynth = new Synth();

        theModel.addAttribute("synth", theSynth);

        return "synths/synth-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("synthId") int theId, Model theModel){

        Synth theSynth = synthService.findById(theId);

        theModel.addAttribute("synth", theSynth);

        return "synths/synth-form";

    }

    @PostMapping("/save")
    public String saveSynth(@ModelAttribute("synth") Synth theSynth){

        synthService.save(theSynth);

        return "redirect:/synths/list";

    }


}
