package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.LicenceService;
import com.epi.projet_pfa_backend.modele.Licence;

import java.util.List;

public class LicenceServiceImp implements LicenceService {
    @Override
    public Licence createLicence(Licence licence) {
        return null;
    }

    @Override
    public List<Licence> readLicence() {
        return List.of();
    }

    @Override
    public Licence updateLicence(Long id, Licence licence) {
        return null;
    }

    @Override
    public String DeleteLicence(Long id) {
        return "";
    }

    @Override
    public Licence getLicenceById(Long id) {
        return null;
    }
}
