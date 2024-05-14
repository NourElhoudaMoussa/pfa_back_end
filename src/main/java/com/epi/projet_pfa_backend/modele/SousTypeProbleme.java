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
public class SousTypeProbleme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50,nullable = false,unique = true)
    private String nomSousTypeProbleme;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id",nullable = false)
    private TypeProbleme typeProbleme;

    @JsonIgnore
    @OneToMany(mappedBy = "sousTypeProbleme", fetch =FetchType.EAGER)
    private List<Reclamation> reclamations=new ArrayList<>();
}
