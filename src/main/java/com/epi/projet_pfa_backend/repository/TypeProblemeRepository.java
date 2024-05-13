package com.epi.projet_pfa_backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.epi.projet_pfa_backend.modele.TypeProbleme;
public interface TypeProblemeRepository extends JpaRepository<TypeProbleme,Long> {
}
