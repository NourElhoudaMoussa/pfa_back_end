package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.SondageDopinionService;
import com.epi.projet_pfa_backend.modele.SondageDopinion;
import com.epi.projet_pfa_backend.repository.SondageDopinionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class SondageDopinionServiceImp implements SondageDopinionService {
    private final SondageDopinionRepository sondageDopinionRepository;
    @Override
    public SondageDopinion createSondageDopinion(SondageDopinion sondageDopinion) {
        return sondageDopinionRepository.save(sondageDopinion);
    }

    @Override
    public List<SondageDopinion> readSondageDopinion() {
        return sondageDopinionRepository.findAll();
    }

    @Override
    public SondageDopinion updateSondageDopinion(Long id, SondageDopinion sondageDopinion) {
        return sondageDopinionRepository.findById(id)
                .map(s->{
                    s.setTitre(sondageDopinion.getTitre());
                    s.setDescription(sondageDopinion.getDescription());
                    s.setDateCreation(sondageDopinion.getDateCreation());
                    s.setMunicipale(sondageDopinion.getMunicipale());
                    s.setCitoyens(sondageDopinion.getCitoyens());
                    s.setQuestions(sondageDopinion.getQuestions());
                    return sondageDopinionRepository.save(s);
                }).orElseThrow(()->new RuntimeException("sondage d'opinion non trouvé !!"));
    }

    @Override
    public String DeleteSondageDopinion(Long id) {
        sondageDopinionRepository.deleteById(id);
        return "sondage d'opinion supprimé avec succées";
    }

    @Override
    public SondageDopinion getSondageDopinionById(Long id) {
        return  sondageDopinionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("sondage d'opinion non trouvé!!"));
    }
}
