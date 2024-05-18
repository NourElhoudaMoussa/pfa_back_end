package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.ReponseService;
import com.epi.projet_pfa_backend.modele.Reponse;

import java.util.List;

public class ReponseServiceImp implements ReponseService {
    @Override
    public Reponse createReponse(Reponse reponse) {
        return null;
    }

    @Override
    public List<Reponse> readReponse() {
        return List.of();
    }

    @Override
    public Reponse updateReponse(Long id, Reponse reponse) {
        return null;
    }

    @Override
    public String DeleteReponse(Long id) {
        return "";
    }

    @Override
    public Reponse getReponseById(Long id) {
        return null;
    }
}
