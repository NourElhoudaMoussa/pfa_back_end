package com.epi.projet_pfa_backend.Service.implementation;

import com.epi.projet_pfa_backend.Service.ActualiteService;
import com.epi.projet_pfa_backend.modele.Actualite;

import java.util.List;

public class ActualiteServiceImp implements ActualiteService {
    @Override
    public Actualite createActualite(Actualite actualite) {
        return null;
    }

    @Override
    public List<Actualite> readActualite() {
        return List.of();
    }

    @Override
    public Actualite updateActualite(Long id, Actualite actualite) {
        return null;
    }

    @Override
    public String DeleteActualite(Long id) {
        return "";
    }

    @Override
    public Actualite getActualiteById(Long id) {
        return null;
    }
}
