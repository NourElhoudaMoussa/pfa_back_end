package com.epi.projet_pfa_backend.modele;

import jakarta.persistence.Entity;
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
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
public class Responsable extends User{
}
