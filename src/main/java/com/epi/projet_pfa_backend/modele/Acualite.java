package com.epi.projet_pfa_backend.modele;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
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
public class Acualite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(length = 50,nullable = false)
    private String titre;
    @Column(nullable = false)
    private String contenu;
    @Column(nullable = false)
    private Date dateCreation;


}
