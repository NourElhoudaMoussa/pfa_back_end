package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.ActualiteService;
import com.epi.projet_pfa_backend.modele.Actualite;
import com.epi.projet_pfa_backend.repository.ActualiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class ActualiteServiceImp implements ActualiteService {
    private final ActualiteRepository actualiteRepository;
    @Override
    public Actualite createActualite(Actualite actualite) {
        return actualiteRepository.save(actualite);
    }

    @Override
    public List<Actualite> readActualite() {
        return actualiteRepository.findAll();
    }

    @Override
    public Actualite updateActualite(Long id, Actualite actualite) {
        return actualiteRepository.findById(id)
                .map(act->{
                    act.setTitre(actualite.getTitre());
                    act.setContenu(actualite.getContenu());
                    act.setDateCreation(actualite.getDateCreation());
                    act.setService(actualite.getService());
                    return actualiteRepository.save(act);
                }).orElseThrow(()->new RuntimeException("actualité non trouvé !!"));
    }

    @Override
    public String DeleteActualite(Long id) {
        actualiteRepository.deleteById(id);
        return "Actualité supprimé avec succées";

    }

    @Override
    public Actualite getActualiteById(Long id) {
        return  actualiteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("actualité non trouvé!!"));
    }
}
