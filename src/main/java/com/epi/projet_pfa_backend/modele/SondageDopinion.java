package com.epi.projet_pfa_backend.modele;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SondageDopinion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50,nullable = false,unique = true)
    private String titre;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String dateCreation;
    @ManyToOne
    private Municipale municipale;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "Participation_sondage",
            joinColumns = @JoinColumn(
                    name = "id_sondage", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "id_citoyen", referencedColumnName = "id"))

    private Collection<Citoyen> citoyens;

    @JsonIgnore
    @OneToMany(mappedBy = "sondage", fetch =FetchType.EAGER)
    private List<Question> questions=new ArrayList<>();
}
