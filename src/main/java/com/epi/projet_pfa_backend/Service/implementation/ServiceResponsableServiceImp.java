package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.ServiceResponsableService;
import com.epi.projet_pfa_backend.modele.ResponsableService;
import com.epi.projet_pfa_backend.repository.ResponsableServiceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.List;
@AllArgsConstructor
@Service
public class ServiceResponsableServiceImp implements ServiceResponsableService {
    private final ResponsableServiceRepository RSRepository;
    @Override
    public ResponsableService createResponsableService(ResponsableService responsableService) {
        return RSRepository.save(responsableService);
    }

    @Override
    public List<ResponsableService> readResponsableService() {
        return RSRepository.findAll();
    }

    @Override
    public ResponsableService updateResponsableService(Long id, ResponsableService responsableService) {
        return RSRepository.findById(id)
                .map(rs->{
                    rs.setPrenom(responsableService.getPrenom());
                    rs.setNom(responsableService.getNom());
                    rs.setCin(responsableService.getCin());
                    rs.setDN(responsableService.getDN());
                    rs.setLN(responsableService.getLN());
                    rs.setGenre(responsableService.getGenre());
                    rs.setAdr(responsableService.getAdr());
                    rs.setNumTel(responsableService.getNumTel());
                    rs.setLogin(responsableService.getLogin());
                    rs.setMdp(responsableService.getMdp());
                    rs.setService(responsableService.getService());
                    return RSRepository.save(rs);
                }).orElseThrow(()->new RuntimeException("Responsable Service non trouvé!!"));

    }

    @Override
    public String DeleteResponsableService(Long id) {
        RSRepository.deleteById(id);
        return "Responsable Service supprimé avec succées";
    }

    @Override
    public ResponsableService getResponsableServiceById(Long id) {
        return RSRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Responsable Service non trouvé!!"));

    }
}
