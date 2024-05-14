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
public class TypeProbleme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50,nullable = false,unique = true)
    private String nomTypeProbleme;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id",nullable = false)
    private Service service;

    @JsonIgnore
    @OneToMany(mappedBy = "typeProbleme", fetch =FetchType.EAGER)
    private List<SousTypeProbleme> sousTypeProblemes=new ArrayList<>();
}
