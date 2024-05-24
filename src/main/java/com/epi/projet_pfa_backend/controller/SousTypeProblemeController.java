package com.epi.projet_pfa_backend.controller;

import com.epi.projet_pfa_backend.Service.SousTypeProblemeService;
import com.epi.projet_pfa_backend.modele.SousTypeProbleme;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/SousTypeProbleme")
@AllArgsConstructor
public class SousTypeProblemeController {

    private final SousTypeProblemeService sousTypeProblemeService;

    @PostMapping("/createSousTypeProbleme")
    public SousTypeProbleme createSousTypeProbleme(@RequestBody SousTypeProbleme sousTypeProbleme) {
        return sousTypeProblemeService.createSousTypeProbleme(sousTypeProbleme);
    }

    @GetMapping("/getAllSousTypeProbleme")
    public List<SousTypeProbleme> readSousTypeProbleme() {
        return sousTypeProblemeService.readSousTypeProbleme();
    }

    @PutMapping("/updateSousTypeProbleme/{id}")
    public SousTypeProbleme updateSousTypeProbleme(@PathVariable Long id, @RequestBody SousTypeProbleme sousTypeProbleme) {
        return sousTypeProblemeService.updateSousTypeProbleme(id, sousTypeProbleme);
    }

    @DeleteMapping("/deleteSousTypeProbleme/{id}")
    public String deleteSousTypeProbleme(@PathVariable Long id) {
        return sousTypeProblemeService.DeleteSousTypeProbleme(id);
    }


    @GetMapping("/getSousTypeProblemeById/{id}")
    public SousTypeProbleme getSousTypeProblemeById(@PathVariable Long id){
        return sousTypeProblemeService.getSousTypeProblemeById(id);
    }
}
