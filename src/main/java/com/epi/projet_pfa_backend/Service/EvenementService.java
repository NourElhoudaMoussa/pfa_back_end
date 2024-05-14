package com.epi.projet_pfa_backend.Service;

import com.epi.projet_pfa_backend.modele.Evenement;


import java.util.List;

public interface EvenementService {
    Evenement createEvenement(Evenement evenement);
    List<Evenement> readEvenement();
    Evenement updateEvenement(Long id,Evenement evenement);
    String DeleteEvenement(Long id);
    Evenement getEvenementById(Long id);
}
