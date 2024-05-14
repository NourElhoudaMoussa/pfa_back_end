package com.epi.projet_pfa_backend.Service.implementation;

import com.epi.projet_pfa_backend.Service.ReclamationService;
import com.epi.projet_pfa_backend.modele.Reclamation;

import java.util.List;

public class ReclamationServiceImp implements ReclamationService {
    @Override
    public Reclamation createReclamation(Reclamation reclamation) {
        return null;
    }

    @Override
    public List<Reclamation> readReclamation() {
        return List.of();
    }

    @Override
    public Reclamation updateReclamation(Long id, Reclamation reclamation) {
        return null;
    }

    @Override
    public String DeleteReclamation(Long id) {
        return "";
    }

    @Override
    public Reclamation getReclamationById(Long id) {
        return null;
    }
}
