package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.PetitionService;
import com.epi.projet_pfa_backend.modele.Petition;
import com.epi.projet_pfa_backend.repository.PetitionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
@AllArgsConstructor
@Service
public class PetitionServiceImp implements PetitionService {
    private final PetitionRepository petitionRepository;
    @Override
    public Petition createPetition(Petition petition) {
        return petitionRepository.save(petition);
    }

    @Override
    public List<Petition> readPetition() {
        return petitionRepository.findAll();
    }

    @Override
    public Petition updatePetition(Long id, Petition petition) {
        return petitionRepository.findById(id)
                .map(p->{
                    p.setTitre(petition.getTitre());
                    p.setContenu(petition.getContenu());
                    p.setDateCreation(petition.getDateCreation());
                    p.setCitoyen(petition.getCitoyen());
                    p.setService(petition.getService());
                    return petitionRepository.save(p);
                }).orElseThrow(()->new RuntimeException("petition non trouvé !!"));
    }

    @Override
    public String DeletePetition(Long id) {
        petitionRepository.deleteById(id);
        return "petition supprimé avec succées";
    }

    @Override
    public Petition getPetitionById(Long id) {
        return  petitionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("petition non trouvé!!"));
    }
}
