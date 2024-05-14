package com.epi.projet_pfa_backend.modele;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Collection;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrganismePublic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String adresse;
    @Column(length = 10,nullable = false)
    private String jourDebut;
    @Column(length = 10,nullable = false)
    private String jourFin;
    @Column(length = 5,nullable = false)
    private String deHeure1;
    @Column(length = 5,nullable = false)
    private String aHeure1;
    @Column(length = 5)
    private String deHeure2;
    @Column(length = 5)
    private String aHeure2;
}
