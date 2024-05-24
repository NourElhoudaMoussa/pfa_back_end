package com.epi.projet_pfa_backend.controller;

import com.epi.projet_pfa_backend.Service.InterventionService;
import com.epi.projet_pfa_backend.modele.Intervention;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Intervention")
@AllArgsConstructor
public class InterventionController {
    private final InterventionService interventionService;

    @PostMapping("/createIntervention")
    public Intervention createIntervention(@RequestBody Intervention intervention ){
        return interventionService.createIntervention(intervention);
    }
    @GetMapping("/getAllIntervention")
    public List<Intervention> readIntervention(){
        return interventionService.readIntervention();
    }

    @PutMapping("/updateIntervention/{id}")
    public Intervention updateIntervention(@PathVariable Long id,@RequestBody Intervention intervention){
        return interventionService.updateIntervention(id,intervention);
    }
    @DeleteMapping("/DeleteIntervention/{id}")
    public String DeleteIntervention(@PathVariable Long id){
        return interventionService.DeleteIntervention(id);
    }

    @GetMapping("/getInterventionById/{id}")
    public Intervention getInterventionById(@PathVariable Long id){
        return interventionService.getInterventionById(id);
    }
}
