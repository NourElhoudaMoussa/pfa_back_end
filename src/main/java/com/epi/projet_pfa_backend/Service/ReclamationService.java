package com.epi.projet_pfa_backend.Service;



import com.epi.projet_pfa_backend.modele.Reclamation;

import java.util.List;

public interface ReclamationService {
    Reclamation createReclamation(Reclamation reclamation);
    List<Reclamation> readReclamation();
    Reclamation updateReclamation(Long id,Reclamation reclamation);
    String DeleteReclamation(Long id);
    Reclamation getReclamationById(Long id);
}
