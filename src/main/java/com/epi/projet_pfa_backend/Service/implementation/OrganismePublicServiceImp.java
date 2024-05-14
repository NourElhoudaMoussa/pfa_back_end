package com.epi.projet_pfa_backend.Service.implementation;

import com.epi.projet_pfa_backend.Service.OrganismePublicService;
import com.epi.projet_pfa_backend.modele.OrganismePublic;

import java.util.List;

public class OrganismePublicServiceImp implements OrganismePublicService {
    @Override
    public OrganismePublic createOrganismePublic(OrganismePublic organismePublic) {
        return null;
    }

    @Override
    public List<OrganismePublic> readOrganismePublic() {
        return List.of();
    }

    @Override
    public OrganismePublic updateOrganismePublic(Long id, OrganismePublic organismePublic) {
        return null;
    }

    @Override
    public String DeleteOrganismePublic(Long id) {
        return "";
    }

    @Override
    public OrganismePublic getOrganismePublicById(Long id) {
        return null;
    }
}
