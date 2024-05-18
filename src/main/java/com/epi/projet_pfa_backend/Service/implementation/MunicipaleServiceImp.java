package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.MunicipaleService;
import com.epi.projet_pfa_backend.modele.Municipale;
import com.epi.projet_pfa_backend.repository.MunicipaleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class MunicipaleServiceImp implements MunicipaleService {
    private final MunicipaleRepository municipaleRepository;
    @Override
    public Municipale createMunicipale(Municipale municipale) {
        return municipaleRepository.save(municipale);
    }

    @Override
    public List<Municipale> readMunicipale() {
        return municipaleRepository.findAll();
    }

    @Override
    public Municipale updateMunicipale(Long id, Municipale municipale) {
        return municipaleRepository.findById(id)
                .map(mun->{
                    mun.setRegion(municipale.getRegion());
                    mun.setMunicipale(municipale.getMunicipale());
                    mun.setAdresse(municipale.getAdresse());
                    mun.setTel(municipale.getTel());
                    mun.setFax(municipale.getFax());
                    return municipaleRepository.save(mun);
                }).orElseThrow(()->new RuntimeException("municipalité non trouvé!!"));

    }

    @Override
    public String DeleteMunicipale(Long id) {
        municipaleRepository.deleteById(id);
        return "municipalité supprimé avec succées";
    }

    @Override
    public Municipale getMunicipaleById(Long id) {

        return municipaleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("municipalité non trouvé!!"));

    }
}
