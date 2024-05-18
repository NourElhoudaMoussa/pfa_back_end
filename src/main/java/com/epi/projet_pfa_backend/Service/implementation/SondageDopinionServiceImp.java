package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.SondageDopinionService;
import com.epi.projet_pfa_backend.modele.SondageDopinion;

import java.util.List;

public class SondageDopinionServiceImp implements SondageDopinionService {
    @Override
    public SondageDopinion createSondageDopinion(SondageDopinion sondageDopinion) {
        return null;
    }

    @Override
    public List<SondageDopinion> readSondageDopinion() {
        return List.of();
    }

    @Override
    public SondageDopinion updateSondageDopinion(Long id, SondageDopinion sondageDopinion) {
        return null;
    }

    @Override
    public String DeleteSondageDopinion(Long id) {
        return "";
    }

    @Override
    public SondageDopinion getSondageDopinionById(Long id) {
        return null;
    }
}
