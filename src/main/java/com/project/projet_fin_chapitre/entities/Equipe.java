package com.project.projet_fin_chapitre.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Equipe {
    @Id
    Long idEquipe;
    @Column
    String nomEquipe;
    @Column
    String pays;

    @JsonManagedReference
    @OneToMany(mappedBy = "equipe", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Joueur> joueurs;

    @ManyToMany(mappedBy = "equipes", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Matsh> matshs;
}
