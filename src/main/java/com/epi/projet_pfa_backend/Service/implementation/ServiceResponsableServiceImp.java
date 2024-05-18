package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.ServiceResponsableService;
import com.epi.projet_pfa_backend.modele.ResponsableService;

import java.util.List;

public class ServiceResponsableServiceImp implements ServiceResponsableService {
    @Override
    public ResponsableService createResponsableService(ResponsableService responsableService) {
        return null;
    }

    @Override
    public List<ResponsableService> readResponsableService() {
        return List.of();
    }

    @Override
    public ResponsableService updateResponsableService(Long id, ResponsableService responsableService) {
        return null;
    }

    @Override
    public String DeleteResponsableService(Long id) {
        return "";
    }

    @Override
    public ResponsableService getResponsableServiceById(Long id) {
        return null;
    }
}
