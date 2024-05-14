package com.epi.projet_pfa_backend.Service;



import com.epi.projet_pfa_backend.modele.Citoyen;

import java.util.List;

public interface CitoyenService {
    Citoyen createCitoyen(Citoyen citoyen);
    List<Citoyen> readCitoyen();
    Citoyen updateCitoyen(Long id,Citoyen citoyen);
    String DeleteCitoyen(Long id);
    Citoyen getCitoyenById(Long id);
}
