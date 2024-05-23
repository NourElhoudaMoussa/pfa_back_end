package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.EvenementService;
import com.epi.projet_pfa_backend.modele.Evenement;
import com.epi.projet_pfa_backend.repository.ActualiteRepository;
import com.epi.projet_pfa_backend.repository.EvenementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class EvenementServiceImp implements EvenementService {
    private final EvenementRepository evenementRepository;
    @Override
    public Evenement createEvenement(Evenement evenement) {
        return evenementRepository.save(evenement);
    }

    @Override
    public List<Evenement> readEvenement() {
        return evenementRepository.findAll();
    }

    @Override
    public Evenement updateEvenement(Long id, Evenement evenement) {
        return evenementRepository.findById(id)
                .map(evnt->{
                    evnt.setDateEvenement(evenement.getDateEvenement());
                    evnt.setDescription(evenement.getDescription());
                    evnt.setMunicipale(evenement.getMunicipale());
                    return evenementRepository.save(evnt);
                }).orElseThrow(()->new RuntimeException("evenement non trouvé !!"));
    }

    @Override
    public String DeleteEvenement(Long id) {
        evenementRepository.deleteById(id);
        return "evenement supprimé avec succées";
    }

    @Override
    public Evenement getEvenementById(Long id) {

        return  evenementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("evenement non trouvé!!"));
    }
}
