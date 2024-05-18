package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.ServiceResponsableGenerale;
import com.epi.projet_pfa_backend.modele.ResponsableGenerale;
import com.epi.projet_pfa_backend.repository.ResponsableGeneraleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ServiceResponsableGeneraleImp implements ServiceResponsableGenerale {
    private final ResponsableGeneraleRepository RGRepository;
    @Override
    public ResponsableGenerale createResponsableGenerale(ResponsableGenerale responsableGenerale) {
        return RGRepository.save(responsableGenerale);
    }

    @Override
    public List<ResponsableGenerale> readResponsableGenerale() {
        return RGRepository.findAll();
    }

    @Override
    public ResponsableGenerale updateResponsableGenerale(Long id, ResponsableGenerale responsableGenerale) {
        return RGRepository.findById(id)
                .map(rg->{
                    rg.setPrenom(responsableGenerale.getPrenom());
                    rg.setNom(responsableGenerale.getNom());
                    rg.setCin(responsableGenerale.getCin());
                    rg.setDN(responsableGenerale.getDN());
                    rg.setLN(responsableGenerale.getLN());
                    rg.setGenre(responsableGenerale.getGenre());
                    rg.setAdr(responsableGenerale.getAdr());
                    rg.setNumTel(responsableGenerale.getNumTel());
                    rg.setLogin(responsableGenerale.getLogin());
                    rg.setMdp(responsableGenerale.getMdp());
                    rg.setMunicipale(responsableGenerale.getMunicipale());
                    return RGRepository.save(rg);
                }).orElseThrow(()->new RuntimeException("Responsable Generale non trouvé!!"));

    }

    @Override
    public String DeleteResponsableGenerale(Long id) {
        RGRepository.deleteById(id);
        return "Responsable Generale supprimé avec succées";
    }

    @Override
    public ResponsableGenerale getResponsableGeneraleById(Long id) {
        return RGRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Responsable Generale non trouvé!!"));
    }
}
