package com.epi.projet_pfa_backend.controller;

import com.epi.projet_pfa_backend.Service.OrganismePublicService;
import com.epi.projet_pfa_backend.modele.OrganismePublic;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/OrganismePublic")
@AllArgsConstructor
public class OrganismePublicController {
 private final OrganismePublicService organismePublicService;

    @PostMapping("/createOrganismePublic")
    public OrganismePublic createOrganismePublic(@RequestBody OrganismePublic organismePublic ){
        return organismePublicService.createOrganismePublic(organismePublic);
    }
    @GetMapping("/getAllOrganismePublic")
    public List<OrganismePublic> readOrganismePublic(){
        return organismePublicService.readOrganismePublic();
    }

    @PutMapping("/updateOrganismePublic/{id}")
    public OrganismePublic updateOrganismePublic(@PathVariable Long id,@RequestBody OrganismePublic organismePublic){
        return organismePublicService.updateOrganismePublic(id,organismePublic);
    }
    @DeleteMapping("/DeleteIOrganismePublic/{id}")
    public String DeleteOrganismePublic(@PathVariable Long id){
        return organismePublicService.DeleteOrganismePublic(id);
    }

    @GetMapping("/getOrganismePublicById/{id}")
    public OrganismePublic getOrganismePublicById(@PathVariable Long id){
        return organismePublicService.getOrganismePublicById(id);
    }
}
