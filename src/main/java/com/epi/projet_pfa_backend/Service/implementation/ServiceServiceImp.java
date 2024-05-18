package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.service.ServiceService;
import com.epi.projet_pfa_backend.modele.ServiceMunicipal;
import com.epi.projet_pfa_backend.repository.ServiceRepository;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class ServiceServiceImp implements ServiceService {
    private final ServiceRepository serviceRepository;
    @Override
    public ServiceMunicipal createService(ServiceMunicipal service) {
        return serviceRepository.save(service);
    }

    @Override
    public List<ServiceMunicipal> readService() {
        return serviceRepository.findAll();
    }

    @Override
    public ServiceMunicipal updateService(Long id, ServiceMunicipal service) {
        return serviceRepository.findById(id)
                .map(s->{
                    s.setNomService(service.getNomService());
                    s.setMunicipale(service.getMunicipale());
                    return serviceRepository.save(s);
                }).orElseThrow(()->new RuntimeException("Service non trouvé!!"));
    }

    @Override
    public String DeleteService(Long id) {
        serviceRepository.deleteById(id);
        return "Service supprimé avec succées";
    }

    @Override
    public ServiceMunicipal getServiceById(Long id) {
        return serviceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Service non trouvé!!"));
    }
}
