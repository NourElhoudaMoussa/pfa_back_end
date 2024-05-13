package com.epi.projet_pfa_backend.repository;

import com.epi.projet_pfa_backend.modele.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvenementRepository extends JpaRepository<Evenement, Long> {
}
