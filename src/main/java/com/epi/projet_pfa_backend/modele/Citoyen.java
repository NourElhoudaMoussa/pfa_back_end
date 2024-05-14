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
//methode table par classe
@Table(name="Citoyen")
public class Citoyen extends User{
    @Column(length = 50)
    private String occupation;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "Participation_municipalite",
            joinColumns = @JoinColumn(
                    name = "id_citoyen", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "id_municipalite", referencedColumnName = "id"))

    private Collection<Municipale> municipaleCollection;

    @JsonIgnore
    @OneToMany(mappedBy = "citoyen", fetch =FetchType.EAGER)
    private List<Reclamation> reclamations=new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "citoyen", fetch =FetchType.EAGER)
    private List<Petition> petitions=new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "citoyen", fetch =FetchType.EAGER)
    private List<Intervention> interventions=new ArrayList<>();

    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "Participation_sondage",
            joinColumns = @JoinColumn(
                    name = "id_citoyen", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "id_sondage", referencedColumnName = "id"))

    private Collection<SondageDopinion> sondageDopinions;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "Citoyen_signant",
            joinColumns = @JoinColumn(
                    name = "id_citoyen", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "id_petition", referencedColumnName = "id"))

    private Collection<Petition> petitionsSigne;
}
