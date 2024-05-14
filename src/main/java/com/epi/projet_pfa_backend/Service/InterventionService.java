package com.epi.projet_pfa_backend.Service;



import com.epi.projet_pfa_backend.modele.Intervention;

import java.util.List;

public interface InterventionService {
    Intervention createIntervention(Intervention intervention);
    List<Intervention> readIntervention();
    Intervention updateIntervention(Long id,Intervention intervention);
    String DeleteIntervention(Long id);
    Intervention getInterventionById(Long id);
}
