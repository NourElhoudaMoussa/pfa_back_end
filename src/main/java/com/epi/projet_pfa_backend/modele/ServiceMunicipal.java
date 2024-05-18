package com.epi.projet_pfa_backend.modele;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceMunicipal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50,nullable = false,unique = true)
    private String nomService;
    @JsonIgnore
    @OneToMany(mappedBy = "service", fetch =FetchType.EAGER)
    private List<Actualite> actualites =new ArrayList<>();
    @JsonIgnore
    @OneToMany(mappedBy = "service", fetch =FetchType.EAGER)
    private List<Intervention> interventions=new ArrayList<>();
    @JsonIgnore
    @OneToMany(mappedBy = "service", fetch =FetchType.EAGER)
    private List<Petition> petitions=new ArrayList<>();

    @ManyToOne
    @JoinColumn(referencedColumnName = "id",nullable = false)
    private Municipale municipale;

    @JsonIgnore
    @OneToMany(mappedBy = "service", fetch =FetchType.EAGER)
    private List<TypeProbleme> typeProblemes=new ArrayList<>();

    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private ResponsableService responsableService;
}
