package com.epi.projet_pfa_backend.controller;

import com.epi.projet_pfa_backend.modele.Actualite;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.epi.projet_pfa_backend.Service.ActualiteService;

import java.util.List;

@RestController
@RequestMapping("/Actualite")
@AllArgsConstructor
@CrossOrigin("*")
public class ActualiteController {
    private final ActualiteService actualiteService;

    @PostMapping("/createActualite")
    public Actualite createActualite(@RequestBody Actualite actualite){
        return actualiteService.createActualite(actualite);
    }
    @GetMapping("/getAllActualites")
    public List<Actualite> getAllActualites(){
        return actualiteService.readActualite();
    }

    @PutMapping("/updateActualite/{id}")//envoyer l'id comme variable
    public Actualite updateActualite(@PathVariable Long id,@RequestBody Actualite actualite){
        return actualiteService.updateActualite(id,actualite);
    }
    @DeleteMapping("/deleteActualite/{id}")
    public String deleteActualite(@PathVariable Long id){
        return actualiteService.DeleteActualite(id);
    }
}
