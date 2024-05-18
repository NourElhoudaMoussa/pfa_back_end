package com.epi.projet_pfa_backend.controller;

import com.epi.projet_pfa_backend.modele.ResponsableService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.epi.projet_pfa_backend.Service.ServiceResponsableService;

import java.util.List;

@RestController
@RequestMapping("/ResponsableService")
@AllArgsConstructor
public class ResponsableServiceController {
    private final ServiceResponsableService serviceResponsableService;

    @PostMapping("/createResponsableService")
    public ResponsableService createResponsableService(@RequestBody ResponsableService responsableService){
        return serviceResponsableService.createResponsableService(responsableService);
    }
    @GetMapping("/getAllResponsablesServices")
    public List<ResponsableService> getAllResponsablesServices(){
        return serviceResponsableService.readResponsableService();
    }

    @PutMapping("/updateResponsableService/{id}")//envoyer l'id comme variable
    public ResponsableService updateResponsableService(@PathVariable Long id,@RequestBody ResponsableService responsableService){
        return serviceResponsableService.updateResponsableService(id,responsableService);
    }
    @DeleteMapping("/deleteResponsableService/{id}")
    public String deleteResponsableService(@PathVariable Long id){
        return serviceResponsableService.DeleteResponsableService(id);
    }
}
