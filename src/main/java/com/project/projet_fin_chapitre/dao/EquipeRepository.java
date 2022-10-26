package com.project.projet_fin_chapitre.dao;

import com.project.projet_fin_chapitre.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {

}
