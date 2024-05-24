package com.epi.projet_pfa_backend.controller;

import com.epi.projet_pfa_backend.Service.ReponseService;
import com.epi.projet_pfa_backend.modele.Actualite;
import com.epi.projet_pfa_backend.modele.Reponse;
import com.epi.projet_pfa_backend.modele.Reponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Reponse")
@AllArgsConstructor
public class ReponseController {
    private final ReponseService reponseService;

    @PostMapping("/createReponse")
    public Reponse createReponse(@RequestBody Reponse reponse){
        return reponseService.createReponse(reponse);
    }
    @GetMapping("/getAllReponse")
    public List<Reponse> readReponse(){
        return reponseService.readReponse();
    }

    @PutMapping("/updateReponse/{id}")
    public Reponse updateReponse(@PathVariable Long id,@RequestBody Reponse reponse){
        return reponseService.updateReponse(id,reponse);
    }
    @DeleteMapping("/DeleteReponse/{id}")
    public String DeleteReponse(@PathVariable Long id){
        return reponseService.DeleteReponse(id);
    }

    @GetMapping("/getReponseById/{id}")
    public Reponse getReponseById(@PathVariable Long id){
        return reponseService.getReponseById(id);
    }

}
