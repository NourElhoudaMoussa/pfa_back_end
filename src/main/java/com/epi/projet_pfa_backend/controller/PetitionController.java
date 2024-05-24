package com.epi.projet_pfa_backend.controller;

import com.epi.projet_pfa_backend.Service.PetitionService;
import com.epi.projet_pfa_backend.modele.Petition;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Petition")
@AllArgsConstructor
public class PetitionController {

    private final PetitionService petitionService;

    @PostMapping("/createPetition")
    public Petition createPetition(@RequestBody Petition petition) {
        return petitionService.createPetition(petition);
    }

    @GetMapping("/getAllPetition")
    public List<Petition> readPetition() {
        return petitionService.readPetition();
    }

    @PutMapping("/updatePetition/{id}")
    public Petition updatePetition(@PathVariable Long id, @RequestBody Petition petition) {
        return petitionService.updatePetition(id, petition);
    }

    @DeleteMapping("/deletePetition/{id}")
    public String deletePetition(@PathVariable Long id) {
        return petitionService.DeletePetition(id);
    }


    @GetMapping("/getPetitionById/{id}")
    public Petition getPetitionById(@PathVariable Long id){
        return petitionService.getPetitionById(id);
    }
    /*
    @GetMapping("/getPetitionById/{id}")
    public ResponseEntity<Petition> getPetitionById(@PathVariable Long id) {
        Petition petition = petitionService.getPetitionById(id);
        return ResponseEntity.ok(petition);
    }*/
}
