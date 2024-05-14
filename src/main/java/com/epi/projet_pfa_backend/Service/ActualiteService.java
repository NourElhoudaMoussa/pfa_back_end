package com.epi.projet_pfa_backend.Service;

import com.epi.projet_pfa_backend.modele.Actualite;

import java.util.List;

public interface ActualiteService {
    Actualite createActualite(Actualite actualite);
    List<Actualite> readActualite();
    Actualite updateActualite(Long id,Actualite actualite);
    String DeleteActualite(Long id);
    Actualite getActualiteById(Long id);
}
