package com.epi.projet_pfa_backend.controller;

import com.epi.projet_pfa_backend.Service.SondageDopinionService;
import com.epi.projet_pfa_backend.modele.SondageDopinion;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/SondageDopinion")
@AllArgsConstructor
public class SondageDopinionController {

    private final SondageDopinionService sdService;

    @PostMapping("/createSondageDopinion")
    public SondageDopinion createSondageDopinion(@RequestBody SondageDopinion sondageDopinion) {
        return sdService.createSondageDopinion(sondageDopinion);
    }

    @GetMapping("/getAllSondageDopinion")
    public List<SondageDopinion> readSondageDopinion() {
        return sdService.readSondageDopinion();
    }

    @PutMapping("/updateSondageDopinion/{id}")
    public SondageDopinion updateSondageDopinion(@PathVariable Long id, @RequestBody SondageDopinion sondageDopinion) {
        return sdService.updateSondageDopinion(id, sondageDopinion);
    }

    @DeleteMapping("/deleteSondageDopinion/{id}")
    public String deleteSondageDopinion(@PathVariable Long id) {
        return sdService.DeleteSondageDopinion(id);
    }


    @GetMapping("/getSondageDopinionById/{id}")
    public SondageDopinion getSondageDopinionById(@PathVariable Long id){
        return sdService.getSondageDopinionById(id);
    }
}
