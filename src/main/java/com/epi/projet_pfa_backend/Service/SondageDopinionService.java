package com.epi.projet_pfa_backend.Service;



import com.epi.projet_pfa_backend.modele.SondageDopinion;

import java.util.List;

public interface SondageDopinionService {
    SondageDopinion createSondageDopinion(SondageDopinion sondageDopinion);
    List<SondageDopinion> readSondageDopinion();
    SondageDopinion updateSondageDopinion(Long id,SondageDopinion sondageDopinion);
    String DeleteSondageDopinion(Long id);
    SondageDopinion getSondageDopinionById(Long id);
}
