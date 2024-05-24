package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.TypeProblemeService;
import com.epi.projet_pfa_backend.modele.TypeProbleme;

import com.epi.projet_pfa_backend.repository.TypeProblemeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class TypeProblemeServiceImp implements TypeProblemeService {
    private final TypeProblemeRepository typeProblemeRepository;
    @Override
    public TypeProbleme createTypeProbleme(TypeProbleme typeProbleme) {
        return typeProblemeRepository.save(typeProbleme);
    }

    @Override
    public List<TypeProbleme> readTypeProbleme() {
        return typeProblemeRepository.findAll();
    }

    @Override
    public TypeProbleme updateTypeProbleme(Long id, TypeProbleme typeProbleme) {
        return typeProblemeRepository.findById(id)
                .map(tp->{
                    tp.setNomTypeProbleme(typeProbleme.getNomTypeProbleme());
                    tp.setService(typeProbleme.getService());
                    tp.setSousTypeProblemes(typeProbleme.getSousTypeProblemes());

                    return typeProblemeRepository.save(tp);
                }).orElseThrow(()->new RuntimeException("type Probleme non trouvé !!"));
    }

    @Override
    public String DeleteTypeProbleme(Long id) {
        typeProblemeRepository.deleteById(id);
        return "type Probleme supprimé avec succées";
    }

    @Override
    public TypeProbleme getTypeProblemeById(Long id) {
        return  typeProblemeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("type Probleme non trouvé!!"));
    }
}
