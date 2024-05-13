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
    private String nom;
    private String adresse;
    private String jourDebut;
    private String jourFin;
    private String deHeure1;
    private String aHeure1;
    private String deHeure2;
    private String aHeure2;
}
