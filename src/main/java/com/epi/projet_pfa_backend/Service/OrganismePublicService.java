package com.epi.projet_pfa_backend.Service;



import com.epi.projet_pfa_backend.modele.OrganismePublic;

import java.util.List;

public interface OrganismePublicService {
    OrganismePublic createOrganismePublic(OrganismePublic organismePublic);
    List<OrganismePublic> readOrganismePublic();
    OrganismePublic updateOrganismePublic(Long id,OrganismePublic organismePublic);
    String DeleteOrganismePublic(Long id);
    OrganismePublic getOrganismePublicById(Long id);
}
