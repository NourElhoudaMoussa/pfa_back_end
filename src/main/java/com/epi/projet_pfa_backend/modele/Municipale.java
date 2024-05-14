package com.epi.projet_pfa_backend.modele;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Municipale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String region;

    @Column(nullable = false,unique = true)
    private String municipale;

    @Column(nullable = false,unique = true)
    private String adresse;

    @Column(nullable = false,unique = true)
    private String tel;

    @Column(nullable = false,unique = true)
    private String fax;

    @JsonIgnore
    @OneToMany(mappedBy = "municipale", fetch =FetchType.EAGER)
    private List<Evenement> evenements=new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "municipale", fetch =FetchType.EAGER)
    private List<OrganismePublic> organismePublics=new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "municipale", fetch =FetchType.EAGER)
    private List<Licence> licences=new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "municipale", fetch =FetchType.EAGER)
    private List<SondageDopinion> sondageDopinions=new ArrayList<>();

    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "Participation_municipalite",
            joinColumns = @JoinColumn(
                    name = "id_municipalite", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "id_citoyen", referencedColumnName = "id"))

    private Collection<Citoyen> citoyens;

    @JsonIgnore
    @OneToMany(mappedBy = "municipale", fetch =FetchType.EAGER)
    private List<Service> services=new ArrayList<>();
}

