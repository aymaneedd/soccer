package com.project.projet_fin_chapitre.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Matsh {
    @Id
    Long idMatsh;
    @Column
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateMatsh;
    @Column
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime heureMatsh;

    @JsonIgnore
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "arbitre_id")
    private Arbitre arbitre;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "stade_id")
    private Stade stade;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "matsh_equipe", joinColumns = {@JoinColumn(name = "matsh_id")}, inverseJoinColumns = {@JoinColumn(name = "equipe_id")})
    private List<Equipe> equipes;

}
