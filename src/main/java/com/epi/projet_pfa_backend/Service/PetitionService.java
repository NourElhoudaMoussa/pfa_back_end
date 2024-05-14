package com.epi.projet_pfa_backend.Service;



import com.epi.projet_pfa_backend.modele.Petition;

import java.util.List;

public interface PetitionService {
    Petition createPetition(Petition petition);
    List<Petition> readPetition();
    Petition updatePetition(Long id, Petition petition);
    String DeletePetition(Long id);
    Petition getPetitionById(Long id);
}
