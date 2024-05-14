package com.epi.projet_pfa_backend.modele;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true)
    private String question;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id",nullable = false)
    private SondageDopinion sondage;

    @JsonIgnore
    @OneToMany(mappedBy = "question", fetch =FetchType.EAGER)
    private List<Reponse> reponses=new ArrayList<>();
}
