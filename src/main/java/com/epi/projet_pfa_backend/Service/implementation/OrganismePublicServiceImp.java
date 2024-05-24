package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.OrganismePublicService;
import com.epi.projet_pfa_backend.modele.OrganismePublic;
import com.epi.projet_pfa_backend.repository.OrganismePublicRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
@AllArgsConstructor
@Service
public class OrganismePublicServiceImp implements OrganismePublicService {
    private final OrganismePublicRepository organismePublicRepository;
    @Override
    public OrganismePublic createOrganismePublic(OrganismePublic organismePublic) {
        return organismePublicRepository.save(organismePublic);
    }

    @Override
    public List<OrganismePublic> readOrganismePublic() {
        return organismePublicRepository.findAll();
    }

    @Override
    public OrganismePublic updateOrganismePublic(Long id, OrganismePublic organismePublic) {
        return organismePublicRepository.findById(id)
                .map(org->{
                    org.setNom(organismePublic.getNom());
                    org.setAdresse(organismePublic.getAdresse());
                    org.setJourDebut(organismePublic.getJourDebut());
                    org.setJourFin(organismePublic.getJourFin());
                    org.setDeHeure1(organismePublic.getDeHeure1());
                    org.setAHeure1(organismePublic.getAHeure1());
                    org.setDeHeure2(organismePublic.getDeHeure2());
                    org.setAHeure2(organismePublic.getAHeure2());
                    org.setMunicipale(organismePublic.getMunicipale());
                    return organismePublicRepository.save(org);
                }).orElseThrow(()->new RuntimeException("organisme Public non trouvé !!"));
    }

    @Override
    public String DeleteOrganismePublic(Long id) {
        organismePublicRepository.deleteById(id);
        return "organisme Public supprimé avec succées";
    }

    @Override
    public OrganismePublic getOrganismePublicById(Long id) {
        return  organismePublicRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("organisme Public non trouvé!!"));
    }
}
