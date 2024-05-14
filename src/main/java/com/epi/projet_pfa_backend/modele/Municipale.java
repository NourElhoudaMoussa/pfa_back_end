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
public class Municipale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String region;
    @Column(nullable = false,unique = true)
    private String municipale;
    @Column(nullable = false,unique = true)
    private String adresse;
    @Column(nullable = false,unique = true)
    private String tel;
    @Column(nullable = false,unique = true)
    private String fax;
}
