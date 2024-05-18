package com.epi.projet_pfa_backend.modele;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
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
public class Actualite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(length = 50,nullable = false)
    private String titre;
    @Column(nullable = false)
    private String contenu;
    @Column(nullable = false)
    private Date dateCreation;
    @ManyToOne
    private ServiceMunicipal service;

    @JsonIgnore
    @OneToMany(mappedBy = "actualite", fetch =FetchType.EAGER)
    private List<PieceJointe> pieceJointes=new ArrayList<>();

    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "Actualite_commentaire",
            joinColumns = @JoinColumn(name = "id_actualite", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_user", referencedColumnName = "id")
    )
    @AttributeOverrides({
            @AttributeOverride(name = "contenus", column = @Column(name = "contenu", nullable = false)),
            @AttributeOverride(name = "dateCreation", column = @Column(name = "dateCreation", nullable = false))
    })
    private Collection<User> users;



}
