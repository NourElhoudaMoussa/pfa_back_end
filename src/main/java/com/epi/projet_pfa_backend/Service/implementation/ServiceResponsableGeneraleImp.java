package com.epi.projet_pfa_backend.Service.implementation;

import com.epi.projet_pfa_backend.Service.ServiceResponsableGenerale;
import com.epi.projet_pfa_backend.modele.ResponsableGenerale;

import java.util.List;

public class ServiceResponsableGeneraleImp implements ServiceResponsableGenerale {
    @Override
    public ResponsableGenerale createResponsableGenerale(ResponsableGenerale responsableGenerale) {
        return null;
    }

    @Override
    public List<ResponsableGenerale> readResponsableGenerale() {
        return List.of();
    }

    @Override
    public ResponsableGenerale updateResponsableGenerale(Long id, ResponsableGenerale responsableGenerale) {
        return null;
    }

    @Override
    public String DeleteResponsableGenerale(Long id) {
        return "";
    }

    @Override
    public ResponsableGenerale getResponsableGeneraleById(Long id) {
        return null;
    }
}
