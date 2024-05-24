package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.ReponseService;
import com.epi.projet_pfa_backend.modele.Reponse;
import com.epi.projet_pfa_backend.repository.ReponseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class ReponseServiceImp implements ReponseService {
    private final ReponseRepository reponseRepository;
    @Override
    public Reponse createReponse(Reponse reponse) {
        return reponseRepository.save(reponse);
    }

    @Override
    public List<Reponse> readReponse() {
        return reponseRepository.findAll();
    }

    @Override
    public Reponse updateReponse(Long id, Reponse reponse) {
        return reponseRepository.findById(id)
                .map(r->{
                    r.setReponse(reponse.getReponse());
                    r.setQuestion(reponse.getQuestion());
                    return reponseRepository.save(r);
                }).orElseThrow(()->new RuntimeException("reponse non trouvé !!"));
    }

    @Override
    public String DeleteReponse(Long id) {
        reponseRepository.deleteById(id);
        return "reponse supprimé avec succées";
    }

    @Override
    public Reponse getReponseById(Long id) {
        return  reponseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("reponse non trouvé!!"));
    }
}
