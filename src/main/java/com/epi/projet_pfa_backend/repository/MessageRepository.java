package com.epi.projet_pfa_backend.repository;

import com.epi.projet_pfa_backend.modele.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
