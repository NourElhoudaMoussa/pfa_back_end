package com.epi.projet_pfa_backend.Service;



import com.epi.projet_pfa_backend.modele.SousTypeProbleme;

import java.util.List;

public interface SousTypeProblemeService {
    SousTypeProbleme createSousTypeProbleme(SousTypeProbleme sousTypeProbleme);
    List<SousTypeProbleme> readSousTypeProbleme();
    SousTypeProbleme updateSousTypeProbleme(Long id,SousTypeProbleme sousTypeProbleme);
    String DeleteSousTypeProbleme(Long id);
    SousTypeProbleme getSousTypeProblemeById(Long id);
}
