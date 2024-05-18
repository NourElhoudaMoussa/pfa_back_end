package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.InterventionService;
import com.epi.projet_pfa_backend.modele.Intervention;

import java.util.List;

public class InterventionServiceImp implements InterventionService {
    @Override
    public Intervention createIntervention(Intervention intervention) {
        return null;
    }

    @Override
    public List<Intervention> readIntervention() {
        return List.of();
    }

    @Override
    public Intervention updateIntervention(Long id, Intervention intervention) {
        return null;
    }

    @Override
    public String DeleteIntervention(Long id) {
        return "";
    }

    @Override
    public Intervention getInterventionById(Long id) {
        return null;
    }
}
