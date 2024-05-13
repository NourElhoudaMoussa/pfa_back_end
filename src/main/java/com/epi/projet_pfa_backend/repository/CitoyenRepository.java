package com.epi.projet_pfa_backend.repository;

import com.epi.projet_pfa_backend.modele.Citoyen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitoyenRepository extends JpaRepository<Citoyen, Long> {
}
