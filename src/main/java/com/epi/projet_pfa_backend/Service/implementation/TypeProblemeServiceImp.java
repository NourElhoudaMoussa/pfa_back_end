package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.TypeProblemeService;
import com.epi.projet_pfa_backend.modele.TypeProbleme;

import java.util.List;

public class TypeProblemeServiceImp implements TypeProblemeService {
    @Override
    public TypeProbleme createTypeProbleme(TypeProbleme typeProbleme) {
        return null;
    }

    @Override
    public List<TypeProbleme> readTypeProbleme() {
        return List.of();
    }

    @Override
    public TypeProbleme updateTypeProbleme(Long id, TypeProbleme typeProbleme) {
        return null;
    }

    @Override
    public String DeleteTypeProbleme(Long id) {
        return "";
    }

    @Override
    public TypeProbleme getTypeProblemeById(Long id) {
        return null;
    }
}
