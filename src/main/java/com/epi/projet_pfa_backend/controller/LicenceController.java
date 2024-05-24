package com.epi.projet_pfa_backend.controller;

import com.epi.projet_pfa_backend.Service.LicenceService;
import com.epi.projet_pfa_backend.modele.Intervention;
import com.epi.projet_pfa_backend.modele.Licence;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Licence")
@AllArgsConstructor
public class LicenceController {
    private final LicenceService licenceService;

    @PostMapping("/createLicence")
    public Licence createLicence(@RequestBody Licence licence ){
        return licenceService.createLicence(licence);
    }
    @GetMapping("/getAllLicence")
    public List<Licence> readLicence(){
        return licenceService.readLicence();
    }

    @PutMapping("/updateLicence/{id}")
    public Licence updateLicence(@PathVariable Long id,@RequestBody Licence licence){
        return licenceService.updateLicence(id,licence);
    }
    @DeleteMapping("/DeleteILicence/{id}")
    public String DeleteLicence(@PathVariable Long id){
        return licenceService.DeleteLicence(id);
    }

    @GetMapping("/getLicenceById/{id}")
    public Licence getLicenceById(@PathVariable Long id){
        return licenceService.getLicenceById(id);
    }
}
