package com.epi.projet_pfa_backend.modele;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 8,nullable = false,unique = true)
    private String cin;

    @Column(length = 20,nullable = false,unique = true)
    private String nom;

    @Column(length = 20,nullable = false,unique = true)
    private String prenom;

    private Date DN;

    @Column(length = 50)
    private String LN;

    @Column(length = 10)
    private String genre;

    @Column(length = 150,nullable = false)
    private String adr;

    @Column(length = 8,nullable = false,unique = true)
    private String numTel;

    @Column(length = 100,nullable = false,unique = true)
    private String login;

    @Column(length = 50,nullable = false)
    private String mdp;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "Actualite_commentaire",
            joinColumns = @JoinColumn(
                    name = "id_user", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "id_actualite", referencedColumnName = "id"))


    private Collection<Actualite> actualites;





}
