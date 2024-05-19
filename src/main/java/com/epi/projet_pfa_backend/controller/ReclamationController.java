package com.epi.projet_pfa_backend.controller;

import com.epi.projet_pfa_backend.Service.ReclamationService;
import com.epi.projet_pfa_backend.modele.Actualite;
import com.epi.projet_pfa_backend.modele.Reclamation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Reclamtion")
@AllArgsConstructor
public class ReclamationController {

    private final ReclamationService reclamationService;
    @PostMapping("/createReclamation")
    public Reclamation createReclamation(@RequestBody Reclamation reclamation) {
        return reclamationService.createReclamation(reclamation);
    }
    @GetMapping("/getAllReclamation")
    public List<Reclamation> getAllReclamation(){
        return reclamationService.readReclamation();
    }

    @PutMapping("/updateReclamation/{id}")
    public Reclamation updateReclamation(@PathVariable Long id,@RequestBody Reclamation reclamation){
        return reclamationService.updateReclamation(id,reclamation);
    }
    @DeleteMapping("/deleteReclamation/{id}")
    public String DeleteReclamation(@PathVariable Long id){
        return reclamationService.DeleteReclamation(id);
    }

}
