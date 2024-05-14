package com.epi.projet_pfa_backend.Service;


import com.epi.projet_pfa_backend.modele.ResponsableGenerale;

import java.util.List;

public interface ServiceResponsableGenerale {
    ResponsableGenerale createResponsableGenerale(ResponsableGenerale responsableGenerale);
    List<ResponsableGenerale> readResponsableGenerale();
    ResponsableGenerale updateResponsableGenerale(Long id,ResponsableGenerale responsableGenerale);
    String DeleteResponsableGenerale(Long id);
    ResponsableGenerale getResponsableGeneraleById(Long id);
}
