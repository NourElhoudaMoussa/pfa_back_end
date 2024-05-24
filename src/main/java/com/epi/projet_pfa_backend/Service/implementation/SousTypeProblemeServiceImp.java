package com.epi.projet_pfa_backend.service.implementation;
import com.epi.projet_pfa_backend.Service.SousTypeProblemeService;
import com.epi.projet_pfa_backend.modele.SousTypeProbleme;
import com.epi.projet_pfa_backend.repository.SousTypeProblemeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class SousTypeProblemeServiceImp implements SousTypeProblemeService {
    private final SousTypeProblemeRepository sousTypeProblemeRepository;
    @Override
    public SousTypeProbleme createSousTypeProbleme(SousTypeProbleme sousTypeProbleme) {
        return sousTypeProblemeRepository.save(sousTypeProbleme);
    }

    @Override
    public List<SousTypeProbleme> readSousTypeProbleme() {
        return sousTypeProblemeRepository.findAll();
    }

    @Override
    public SousTypeProbleme updateSousTypeProbleme(Long id, SousTypeProbleme sousTypeProbleme) {
        return sousTypeProblemeRepository.findById(id)
                .map(stp->{
                    stp.setNomSousTypeProbleme(sousTypeProbleme.getNomSousTypeProbleme());
                    stp.setTypeProbleme(sousTypeProbleme.getTypeProbleme());
                    stp.setReclamations(sousTypeProbleme.getReclamations());

                    return sousTypeProblemeRepository.save(stp);
                }).orElseThrow(()->new RuntimeException("sous Type Probleme non trouvé !!"));
    }

    @Override
    public String DeleteSousTypeProbleme(Long id) {
        sousTypeProblemeRepository.deleteById(id);
        return "sous Type Probleme supprimé avec succées";
    }

    @Override
    public SousTypeProbleme getSousTypeProblemeById(Long id) {
        return  sousTypeProblemeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("sous Type Probleme non trouvé!!"));
    }
}
