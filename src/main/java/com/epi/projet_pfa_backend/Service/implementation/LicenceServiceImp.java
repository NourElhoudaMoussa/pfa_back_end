package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.LicenceService;
import com.epi.projet_pfa_backend.modele.Licence;
import com.epi.projet_pfa_backend.repository.LicenceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class LicenceServiceImp implements LicenceService {
    private final LicenceRepository licenceRepository;
    @Override
    public Licence createLicence(Licence licence) {
        return licenceRepository.save(licence);
    }

    @Override
    public List<Licence> readLicence(){
        return licenceRepository.findAll();
    }

    @Override
    public Licence updateLicence(Long id, Licence licence) {

        return licenceRepository.findById(id)
                .map(l->{
                    l.setTitre(licence.getTitre());
                    l.setConditionUtilisation(licence.getConditionUtilisation());
                    l.setDocumentRequis(licence.getDocumentRequis());
                    l.setEtapes(licence.getEtapes());
                    l.setIntervenants(licence.getIntervenants());
                    l.setDelais(licence.getDelais());
                    l.setLieuxDeDepotDuDossier(licence.getLieuxDeDepotDuDossier());
                    l.setMunicipale(licence.getMunicipale());
                    return licenceRepository.save(l);
                }).orElseThrow(()->new RuntimeException("licence non trouvé !!"));
    }

    @Override
    public String DeleteLicence(Long id) {
        licenceRepository.deleteById(id);
        return "licence supprimé avec succées";
    }

    @Override
    public Licence getLicenceById(Long id) {
        return  licenceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("licence non trouvé!!"));
    }
}
