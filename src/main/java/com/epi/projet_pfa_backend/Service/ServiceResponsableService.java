package com.epi.projet_pfa_backend.Service;

import com.epi.projet_pfa_backend.modele.ResponsableService;

import java.util.List;

public interface ServiceResponsableService {
    ResponsableService createResponsableService(ResponsableService responsableService);
    List<ResponsableService> readResponsableService();
    ResponsableService updateResponsableService(Long id,ResponsableService responsableService);
    String DeleteResponsableService(Long id);
    ResponsableService getResponsableServiceById(Long id);
}
