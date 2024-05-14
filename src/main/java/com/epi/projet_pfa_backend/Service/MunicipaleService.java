package com.epi.projet_pfa_backend.Service;

import com.epi.projet_pfa_backend.modele.Municipale;

import java.util.List;

public interface MunicipaleService {
    Municipale createMunicipale(Municipale municipale);
    List<Municipale> readMunicipale();
    Municipale updateMunicipale(Long id,Municipale municipale);
    String DeleteMunicipale(Long id);
    Municipale getMunicipaleById(Long id);
}
