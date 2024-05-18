package com.epi.projet_pfa_backend.controller;

import com.epi.projet_pfa_backend.modele.ServiceMunicipal;
import com.epi.projet_pfa_backend.service.ServiceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/Service")
@AllArgsConstructor
public class ServiceController {
    private final ServiceService serviceMunicipaleService;

    @PostMapping("/createService")
    public ServiceMunicipal createService(@RequestBody ServiceMunicipal serviceMunicipal){
        return serviceMunicipaleService.createService(serviceMunicipal);
    }
    @GetMapping("/getAllServices")
    public List<ServiceMunicipal> getAllServices(){
        return serviceMunicipaleService.readService();
    }

    @PutMapping("/updateService/{id}")//envoyer l'id comme variable
    public ServiceMunicipal updateService(@PathVariable Long id,@RequestBody ServiceMunicipal serviceMunicipal){
        return serviceMunicipaleService.updateService(id,serviceMunicipal);
    }
    @DeleteMapping("/deleteService/{id}")
    public String deleteService(@PathVariable Long id){
        return serviceMunicipaleService.DeleteService(id);
    }
}
