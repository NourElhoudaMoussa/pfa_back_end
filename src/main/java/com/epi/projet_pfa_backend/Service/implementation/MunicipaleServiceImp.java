package com.epi.projet_pfa_backend.Service.implementation;

import com.epi.projet_pfa_backend.Service.MunicipaleService;
import com.epi.projet_pfa_backend.modele.Municipale;

import java.util.List;


public class MunicipaleServiceImp implements MunicipaleService {
    @Override
    public Municipale createMunicipale(Municipale municipale) {
        return null;
    }

    @Override
    public List<Municipale> readMunicipale() {
        return List.of();
    }

    @Override
    public Municipale updateMunicipale(Long id, Municipale municipale) {
        return null;
    }

    @Override
    public String DeleteMunicipale(Long id) {
        return "";
    }

    @Override
    public Municipale getMunicipaleById(Long id) {
        return null;
    }
}
