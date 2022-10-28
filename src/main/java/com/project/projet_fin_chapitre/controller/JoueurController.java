package com.project.projet_fin_chapitre.controller;

import com.project.projet_fin_chapitre.entities.Equipe;
import com.project.projet_fin_chapitre.entities.Joueur;
import com.project.projet_fin_chapitre.service.EquipeService;
import com.project.projet_fin_chapitre.service.JoueurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class JoueurController {

    @Autowired
    JoueurService js;

    @Autowired
    EquipeService es;

    @GetMapping("joueurs")
    public List<Joueur> getAllJoueurs(){
        return js.getAllJoueurs();
    }

    @PostMapping("joueurs")
    public Joueur addJoueur(@RequestBody Joueur j){
        return js.addJoueur(j);
    }

    @GetMapping("joueurs/{id}")
    public Optional<Joueur> getJoueurById(@PathVariable Long id){
        return js.getJoueurById(id);
    }

    @DeleteMapping("joueurs/{id}")
    public void deleteAllJoueur(@PathVariable Long id){
        js.deleteJoueur(id);
    }

    @PutMapping("joueurs")
    public Joueur updateJoueur(@RequestBody Joueur j){
        return js.updateJoueur(j);
    }

    @GetMapping("ATLMADRID")
    public List<Joueur> findByNomEquipe(){
        Equipe equipe = es.findByNomEquipe("ATLMADRID");
        return equipe.getJoueurs();
    }

    @GetMapping("attaquant")
    public List<Joueur> findByPosteAndEquipe(){
        Equipe equipe1 = es.findByNomEquipe("PSG");
        return js.findByPosteAndEquipe("attaquant", equipe1);
    }
}
