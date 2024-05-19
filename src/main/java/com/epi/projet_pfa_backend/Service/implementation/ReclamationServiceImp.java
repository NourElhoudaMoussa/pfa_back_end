package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.ReclamationService;
import com.epi.projet_pfa_backend.modele.Reclamation;
import com.epi.projet_pfa_backend.repository.ReclamationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class ReclamationServiceImp implements ReclamationService {
    private final ReclamationRepository reclamationRepository;
    @Override
    public Reclamation createReclamation(Reclamation reclamation) {
        return reclamationRepository.save(reclamation);
    }

    @Override
    public List<Reclamation> readReclamation() {
        return reclamationRepository.findAll();
    }

    @Override
    public Reclamation updateReclamation(Long id, Reclamation reclamation) {

        return reclamationRepository.findById(id)
                .map(RE->{

                    RE.setDescription(reclamation.getDescription());
                    RE.setAdresse(reclamation.getAdresse());
                    RE.setCitoyen(reclamation.getCitoyen());
                    RE.setDateCreation(reclamation.getDateCreation());
                    RE.setEtat(reclamation.getEtat());
                    RE.setSousTypeProbleme(reclamation.getSousTypeProbleme());

                    return reclamationRepository.save(RE);
                }).orElseThrow(()->new RuntimeException("Réclamation non trouvé!!"));
    }

    @Override
    public String DeleteReclamation(Long id) {
        reclamationRepository.deleteById(id);
        return "Réclamation supprimé avec succées";
    }

    @Override
    public Reclamation getReclamationById(Long id) {
        return reclamationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Réclamation non trouvé!!"));
    }
}
