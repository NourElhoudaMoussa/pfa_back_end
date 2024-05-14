package com.epi.projet_pfa_backend.Service;



import com.epi.projet_pfa_backend.modele.TypeProbleme;

import java.util.List;

public interface TypeProblemeService {
    TypeProbleme createTypeProbleme(TypeProbleme typeProbleme);
    List<TypeProbleme> readTypeProbleme();
    TypeProbleme updateTypeProbleme(Long id,TypeProbleme typeProbleme);
    String DeleteTypeProbleme(Long id);
    TypeProbleme getTypeProblemeById(Long id);
}
