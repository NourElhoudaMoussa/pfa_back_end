package com.epi.projet_pfa_backend.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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





}
