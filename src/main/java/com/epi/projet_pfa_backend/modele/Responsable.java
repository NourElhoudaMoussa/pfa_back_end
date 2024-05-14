package com.epi.projet_pfa_backend.modele;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//methode table par classe
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
public abstract class Responsable extends User{

    @OneToMany(mappedBy = "responsable", fetch =FetchType.EAGER)
    private List<Message> messages=new ArrayList<>();

}
