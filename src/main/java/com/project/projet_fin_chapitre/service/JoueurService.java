package com.project.projet_fin_chapitre.service;

import com.project.projet_fin_chapitre.dao.JoueurRepository;
import com.project.projet_fin_chapitre.entities.Equipe;
import com.project.projet_fin_chapitre.entities.Joueur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JoueurService {
    @Autowired
    JoueurRepository jr;

    public List<Joueur> getAllJoueurs(){
        return jr.findAll();
    }

    public Joueur addJoueur(Joueur j){
        return jr.save(j);
    }

    public Optional<Joueur> getJoueurById(Long id){
        return jr.findById(id);
    }

    public void deleteJoueur(Long id){
        jr.deleteById(id);
    }

    public Joueur updateJoueur(Joueur j){
        return jr.save(j);
    }

    public List<Joueur> findByPosteAndEquipe(String poste, Equipe equipe) {
        return jr.findByPosteAndEquipe(poste, equipe);
    }
}
