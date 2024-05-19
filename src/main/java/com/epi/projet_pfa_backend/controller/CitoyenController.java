package com.epi.projet_pfa_backend.controller;

import com.epi.projet_pfa_backend.Service.CitoyenService;
import com.epi.projet_pfa_backend.modele.Citoyen;
import com.epi.projet_pfa_backend.modele.ResponsableGenerale;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Citoyen")
@AllArgsConstructor
public class CitoyenController {
    private final CitoyenService citoyenService;
    @PostMapping("/createCitoyen")
    public Citoyen createCitoyen(@RequestBody Citoyen citoyen) {
        return citoyenService.createCitoyen(citoyen);
    }

    @GetMapping("/getAllCitoyen")
    public List<Citoyen> getAllCitoyens(){
        return citoyenService.readCitoyen();
    }

    @PutMapping("/updateResponsableGenerale/{id}")
    public Citoyen updateResponsableGenerale(@PathVariable Long id,@RequestBody Citoyen citoyen){
        return citoyenService.updateCitoyen(id,citoyen);
    }
    @DeleteMapping("/deleteResponsableGenerale/{id}")
    public String deleteResponsableGenerale(@PathVariable Long id){
        return citoyenService.DeleteCitoyen(id);
    }
}
