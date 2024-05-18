package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.EvenementService;
import com.epi.projet_pfa_backend.modele.Evenement;

import java.util.List;

public class EvenementServiceImp implements EvenementService {
    @Override
    public Evenement createEvenement(Evenement evenement) {
        return null;
    }

    @Override
    public List<Evenement> readEvenement() {
        return List.of();
    }

    @Override
    public Evenement updateEvenement(Long id, Evenement evenement) {
        return null;
    }

    @Override
    public String DeleteEvenement(Long id) {
        return "";
    }

    @Override
    public Evenement getEvenementById(Long id) {
        return null;
    }
}
