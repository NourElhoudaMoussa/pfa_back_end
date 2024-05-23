package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.InterventionService;
import com.epi.projet_pfa_backend.modele.Intervention;
import com.epi.projet_pfa_backend.repository.ActualiteRepository;
import com.epi.projet_pfa_backend.repository.InterventionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class InterventionServiceImp implements InterventionService {
    private final InterventionRepository interventionRepository;
    @Override
    public Intervention createIntervention(Intervention intervention) {
        return interventionRepository.save(intervention);
    }

    @Override
    public List<Intervention> readIntervention() {
        return interventionRepository.findAll();
    }

    @Override
    public Intervention updateIntervention(Long id, Intervention intervention) {
        return interventionRepository.findById(id)
                .map(inter->{
                    inter.setType(intervention.getType());
                    inter.setCitoyen(intervention.getCitoyen());
                    inter.setTitre(intervention.getTitre());
                    inter.setContenu(intervention.getContenu());
                    inter.setDateCreation(intervention.getDateCreation());
                    inter.setService(intervention.getService());
                    inter.setMessage(intervention.getMessage());
                    return interventionRepository.save(inter);
                }).orElseThrow(()->new RuntimeException("intervention non trouvé !!"));
    }

    @Override
    public String DeleteIntervention(Long id) {
        interventionRepository.deleteById(id);
        return "intervention supprimé avec succées";
    }

    @Override
    public Intervention getInterventionById(Long id) {
        return  interventionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("intervention non trouvé!!"));
    }
}
