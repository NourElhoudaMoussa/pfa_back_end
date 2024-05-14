package com.epi.projet_pfa_backend.Service;


import com.epi.projet_pfa_backend.modele.Service;

import java.util.List;

public interface ServiceService {
    Service createService(Service service);
    List<Service> readService();
    Service updateService(Long id,Service service);
    String DeleteService(Long id);
    Service getServiceById(Long id);
}
