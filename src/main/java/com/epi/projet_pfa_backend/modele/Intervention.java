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
public class Intervention {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20,nullable = false)
    private String type;
    @Column(length = 50,nullable = false)
    private String titre;
    @Column(length = 200,nullable = false)
    private String contenu;
    @Column(nullable = false)
    private Date dateCreation;
    @ManyToOne
    private Citoyen citoyen;
    @ManyToOne
    private ServiceMunicipal service;
    @OneToOne
    private Message message;
}
