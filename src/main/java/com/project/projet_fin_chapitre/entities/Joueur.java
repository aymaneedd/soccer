package com.project.projet_fin_chapitre.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Joueur {
    @Id
    Long idJoueur;
    String nomJoueur;
    String poste;
}
