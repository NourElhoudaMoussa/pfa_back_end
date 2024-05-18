package com.epi.projet_pfa_backend.service;


import com.epi.projet_pfa_backend.modele.ServiceMunicipal;

import java.util.List;

public interface ServiceService {
    ServiceMunicipal createService(ServiceMunicipal service);
    List<ServiceMunicipal> readService();
    ServiceMunicipal updateService(Long id, ServiceMunicipal service);
    String DeleteService(Long id);
    ServiceMunicipal getServiceById(Long id);
}
