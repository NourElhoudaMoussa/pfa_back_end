package com.epi.projet_pfa_backend.modele;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Collection;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Petition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String titre;
    @Column(nullable = false)
    private String contenu;
    @Column(nullable = false)
    private Date dateCreation;
    @ManyToOne
    private Citoyen citoyen;
    @ManyToOne
    private Service service;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "Citoyen_signant",
            joinColumns = @JoinColumn(
                    name = "id_petition", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "id_citoyen", referencedColumnName = "id"))

    private Collection<Citoyen> citoyens;
}
