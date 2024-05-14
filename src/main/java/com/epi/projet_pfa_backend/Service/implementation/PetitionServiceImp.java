package com.epi.projet_pfa_backend.Service.implementation;

import com.epi.projet_pfa_backend.Service.PetitionService;
import com.epi.projet_pfa_backend.modele.Petition;

import java.util.List;

public class PetitionServiceImp implements PetitionService {
    @Override
    public Petition createPetition(Petition petition) {
        return null;
    }

    @Override
    public List<Petition> readPetition() {
        return List.of();
    }

    @Override
    public Petition updatePetition(Long id, Petition petition) {
        return null;
    }

    @Override
    public String DeletePetition(Long id) {
        return "";
    }

    @Override
    public Petition getPetitionById(Long id) {
        return null;
    }
}
