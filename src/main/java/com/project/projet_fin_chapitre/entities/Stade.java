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
public class Stade {
    @Id
    Long idStade;
    @Column
    String nomStade;
    @Column
    String ville;

    @JsonManagedReference
    @OneToMany(mappedBy = "stade")
    @JsonIgnore
    private List<Matsh> matshs;
}
