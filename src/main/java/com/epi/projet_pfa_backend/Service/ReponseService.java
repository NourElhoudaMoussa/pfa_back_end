package com.epi.projet_pfa_backend.Service;



import com.epi.projet_pfa_backend.modele.Reponse;

import java.util.List;

public interface ReponseService {
    Reponse createReponse(Reponse reponse);
    List<Reponse> readReponse();
    Reponse updateReponse(Long id,Reponse reponse);
    String DeleteReponse(Long id);
    Reponse getReponseById(Long id);
}
