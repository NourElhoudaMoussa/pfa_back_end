package com.epi.projet_pfa_backend.repository;

import com.epi.projet_pfa_backend.modele.Intervention;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterventionRepository extends JpaRepository<Intervention, Long> {
}
