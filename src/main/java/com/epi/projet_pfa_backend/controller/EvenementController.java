package com.epi.projet_pfa_backend.controller;

import com.epi.projet_pfa_backend.Service.EvenementService;
import com.epi.projet_pfa_backend.modele.Evenement;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Evenement")
@AllArgsConstructor
public class EvenementController {
  private EvenementService evenementService;

    @PostMapping("/createEvenement")
    public Evenement createEvenement(@RequestBody Evenement evenement ){
        return evenementService.createEvenement(evenement);
    }
    @GetMapping("/getAllEvenement")
    public List<Evenement> readEvenement(){
        return evenementService.readEvenement();
    }

    @PutMapping("/updateEvenement/{id}")
    public Evenement updateEvenement(@PathVariable Long id,@RequestBody Evenement evenement){
        return evenementService.updateEvenement(id,evenement);
    }
    @DeleteMapping("/DeleteEvenement/{id}")
    public String DeleteEvenement(@PathVariable Long id){
        return evenementService.DeleteEvenement(id);
    }

    @GetMapping("/getEvenementById/{id}")
    public Evenement getEvenementById(@PathVariable Long id){
        return evenementService.getEvenementById(id);
    }
}
