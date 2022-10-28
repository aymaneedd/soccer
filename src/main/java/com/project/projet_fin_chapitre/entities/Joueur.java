package com.project.projet_fin_chapitre.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Joueur {
    @Id
    Long idJoueur;
    @Column
    String nomJoueur;
    @Column
    String poste;

    @ManyToOne
    @JoinColumn(name = "equipe_id")
    @JsonIgnore
    private Equipe equipe;
}
