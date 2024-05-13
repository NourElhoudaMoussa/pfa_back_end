package com.epi.projet_pfa_backend.repository;


import com.epi.projet_pfa_backend.modele.SondageDopinion;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ServiceRepository extends JpaRepository<SondageDopinion,Long> {
}
