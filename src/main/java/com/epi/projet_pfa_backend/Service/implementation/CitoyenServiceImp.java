package com.epi.projet_pfa_backend.service.implementation;

import com.epi.projet_pfa_backend.Service.CitoyenService;
import com.epi.projet_pfa_backend.modele.Citoyen;
import com.epi.projet_pfa_backend.repository.CitoyenRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class CitoyenServiceImp implements CitoyenService {
    private final CitoyenRepository citoyenRepository;
    @Override
    public Citoyen createCitoyen(Citoyen citoyen) {
        return citoyenRepository.save(citoyen);
    }

    @Override
    public List<Citoyen> readCitoyen() {

        return citoyenRepository.findAll();
    }

    @Override
    public Citoyen updateCitoyen(Long id, Citoyen citoyen) {
        return citoyenRepository.findById(id)
                .map(c->{
                    c.setPrenom(citoyen.getPrenom());
                    c.setNom(citoyen.getNom());
                    c.setCin(citoyen.getCin());
                    c.setDN(citoyen.getDN());
                    c.setLN(citoyen.getLN());
                    c.setGenre(citoyen.getGenre());
                    c.setAdr(citoyen.getAdr());
                    c.setNumTel(citoyen.getNumTel());
                    c.setLogin(citoyen.getLogin());
                    c.setMdp(citoyen.getMdp());
                    return citoyenRepository.save(c);
                }).orElseThrow(()->new RuntimeException("Citoyen non trouvé!!"));
    }

    @Override
    public String DeleteCitoyen(Long id) {
        citoyenRepository.deleteById(id);
        return "Citoyen supprimé avec succées";
    }

    @Override
    public Citoyen getCitoyenById(Long id) {
        return citoyenRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Citoyen non trouvé!!"));
    }
}
