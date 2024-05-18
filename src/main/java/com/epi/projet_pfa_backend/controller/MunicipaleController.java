package com.epi.projet_pfa_backend.controller;

import com.epi.projet_pfa_backend.modele.Municipale;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.epi.projet_pfa_backend.Service.MunicipaleService;
import java.util.List;
@RestController
@RequestMapping("/Municipale")
@AllArgsConstructor
public class MunicipaleController {
    private final MunicipaleService municipaleService;

    @PostMapping("/createMunicipale")
    public Municipale createMunicipale(@RequestBody Municipale municipale){
        return municipaleService.createMunicipale(municipale);
    }

    @GetMapping("/getAllMunicipales")
    public List<Municipale> getAllMunicipales(){
        return municipaleService.readMunicipale();
    }

    @PutMapping("/updateMunicipale/{id}")//envoyer l'id comme variable
    public Municipale updateMunicipale(@PathVariable Long id,@RequestBody Municipale municipale){
        return municipaleService.updateMunicipale(id,municipale);
    }

    @DeleteMapping("/deleteMunicipale/{id}")
    public String deleteMunicipale(@PathVariable Long id){
        return municipaleService.DeleteMunicipale(id);
    }
}
