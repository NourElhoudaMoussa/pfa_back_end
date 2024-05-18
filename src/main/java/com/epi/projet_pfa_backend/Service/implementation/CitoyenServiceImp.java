package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.CitoyenService;
import com.epi.projet_pfa_backend.modele.Citoyen;

import java.util.List;

public class CitoyenServiceImp implements CitoyenService {
    @Override
    public Citoyen createCitoyen(Citoyen citoyen) {
        return null;
    }

    @Override
    public List<Citoyen> readCitoyen() {
        return List.of();
    }

    @Override
    public Citoyen updateCitoyen(Long id, Citoyen citoyen) {
        return null;
    }

    @Override
    public String DeleteCitoyen(Long id) {
        return "";
    }

    @Override
    public Citoyen getCitoyenById(Long id) {
        return null;
    }
}
