package com.epi.projet_pfa_backend.modele;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reclamation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String adresse;
    @Column(nullable = false)
    private Date dateCreation;
    @Column(length = 20,nullable = false)
    private String etat;
    @JsonIgnore
    @OneToMany(mappedBy = "reclamation", fetch =FetchType.EAGER)
    private List<PieceJointe> pieceJointes=new ArrayList<>();
    @ManyToOne
    private Citoyen citoyen;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private SousTypeProbleme sousTypeProbleme;


}
