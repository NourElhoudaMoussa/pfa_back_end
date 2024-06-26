package com.epi.projet_pfa_backend.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//methode table par classe
@Table(name="ResponsableGenerale")
public class ResponsableGenerale extends Responsable{
    @OneToOne
    private Municipale municipale;
}
