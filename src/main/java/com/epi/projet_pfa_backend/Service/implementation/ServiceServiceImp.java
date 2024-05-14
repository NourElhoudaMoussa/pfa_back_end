package com.epi.projet_pfa_backend.Service.implementation;

import com.epi.projet_pfa_backend.Service.ServiceService;
import com.epi.projet_pfa_backend.modele.Service;

import java.util.List;

public class ServiceServiceImp implements ServiceService {
    @Override
    public Service createService(Service service) {
        return null;
    }

    @Override
    public List<Service> readService() {
        return List.of();
    }

    @Override
    public Service updateService(Long id, Service service) {
        return null;
    }

    @Override
    public String DeleteService(Long id) {
        return "";
    }

    @Override
    public Service getServiceById(Long id) {
        return null;
    }
}
