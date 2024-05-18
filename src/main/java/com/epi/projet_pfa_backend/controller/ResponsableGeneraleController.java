package com.epi.projet_pfa_backend.controller;

import com.epi.projet_pfa_backend.modele.ResponsableGenerale;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.epi.projet_pfa_backend.Service.ServiceResponsableGenerale;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ResponsableGenerale")
@AllArgsConstructor
public class ResponsableGeneraleController {
    private final ServiceResponsableGenerale serviceResponsableGenerale;
    @PostMapping("/createResponsableGenerale")
    public ResponsableGenerale createResponsableGenerale(@RequestBody ResponsableGenerale responsableGenerale){
        return serviceResponsableGenerale.createResponsableGenerale(responsableGenerale);
    }
    @GetMapping("/getAllResponsablesGenerales")
    public List<ResponsableGenerale> getAllResponsablesGenerales(){
        return serviceResponsableGenerale.readResponsableGenerale();
    }

    @PutMapping("/updateResponsableGenerale/{id}")//envoyer l'id comme variable
    public ResponsableGenerale updateResponsableGenerale(@PathVariable Long id,@RequestBody ResponsableGenerale responsableGenerale){
        return serviceResponsableGenerale.updateResponsableGenerale(id,responsableGenerale);
    }
    @DeleteMapping("/deleteResponsableGenerale/{id}")
    public String deleteResponsableGenerale(@PathVariable Long id){
        return serviceResponsableGenerale.DeleteResponsableGenerale(id);
    }

}
