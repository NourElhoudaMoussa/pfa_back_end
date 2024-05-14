package com.epi.projet_pfa_backend.Service;



import com.epi.projet_pfa_backend.modele.Licence;

import java.util.List;

public interface LicenceService {
    Licence createLicence(Licence licence);
    List<Licence> readLicence();
    Licence updateLicence(Long id,Licence licence);
    String DeleteLicence(Long id);
    Licence getLicenceById(Long id);
}
