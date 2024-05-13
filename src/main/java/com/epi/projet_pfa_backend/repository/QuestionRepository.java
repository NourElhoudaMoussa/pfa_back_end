package com.epi.projet_pfa_backend.repository;

import com.epi.projet_pfa_backend.modele.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
