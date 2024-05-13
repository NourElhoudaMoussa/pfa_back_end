package com.epi.projet_pfa_backend.repository;

import com.epi.projet_pfa_backend.modele.Petition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetitionRepository extends JpaRepository<Petition, Long> {
}
