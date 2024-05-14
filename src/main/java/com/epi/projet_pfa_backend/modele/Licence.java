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
public class Licence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true)
    private String titre;
    @Column(nullable = false)
    private String conditionUtilisation;
    @Column(nullable = false)
    private String documentRequis;
    @Column(nullable = false)
    private String etapes;
    @Column(nullable = false)
    private String intervenants;
    @Column(nullable = false)
    private String delais;
    @Column(nullable = false)
    private String lieuxDeDepotDuDossier;

}
