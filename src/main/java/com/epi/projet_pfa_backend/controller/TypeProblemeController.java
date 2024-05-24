package com.epi.projet_pfa_backend.controller;

import com.epi.projet_pfa_backend.Service.TypeProblemeService;
import com.epi.projet_pfa_backend.modele.TypeProbleme;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/TypeProbleme")
@AllArgsConstructor
public class TypeProblemeController {

    private final TypeProblemeService typeProblemeService;

    @PostMapping("/createTypeProbleme")
    public TypeProbleme createTypeProbleme(@RequestBody TypeProbleme typeProbleme) {
        return typeProblemeService.createTypeProbleme(typeProbleme);
    }

    @GetMapping("/getAllTypeProbleme")
    public List<TypeProbleme> readTypeProbleme() {
        return typeProblemeService.readTypeProbleme();
    }

    @PutMapping("/updateTypeProbleme/{id}")
    public TypeProbleme updateTypeProbleme(@PathVariable Long id, @RequestBody TypeProbleme typeProbleme) {
        return typeProblemeService.updateTypeProbleme(id, typeProbleme);
    }

    @DeleteMapping("/deleteTypeProbleme/{id}")
    public String deleteTypeProbleme(@PathVariable Long id) {
        return typeProblemeService.DeleteTypeProbleme(id);
    }


    @GetMapping("/getTypeProblemeById/{id}")
    public TypeProbleme getTypeProblemeById(@PathVariable Long id){
        return typeProblemeService.getTypeProblemeById(id);
    }
}
