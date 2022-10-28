package com.project.projet_fin_chapitre.dao;

import com.project.projet_fin_chapitre.entities.Equipe;
import com.project.projet_fin_chapitre.entities.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JoueurRepository extends JpaRepository<Joueur, Long> {
    List<Joueur> findByPosteAndEquipe(String poste, Equipe equipe);
}
