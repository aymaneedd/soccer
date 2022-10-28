package com.project.projet_fin_chapitre.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Arbitre {
    @Id
    Long idArbitre;
    @Column
    String nom;
    @Column
    String nationalite;

    @JsonManagedReference
    @OneToMany(mappedBy = "arbitre")
    @JsonIgnore
    private List<Matsh> matshs;
}
