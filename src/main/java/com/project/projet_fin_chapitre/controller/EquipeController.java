package com.project.projet_fin_chapitre.controller;

import com.project.projet_fin_chapitre.entities.Equipe;
import com.project.projet_fin_chapitre.entities.Matsh;
import com.project.projet_fin_chapitre.service.EquipeService;
import com.project.projet_fin_chapitre.service.MatshService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EquipeController {

    @Autowired
    EquipeService es;

    @Autowired
    MatshService ms;

    @GetMapping("equipes")
    public List<Equipe> getAllEquipes(){
        return es.getAllEquipes();
    }

    @PostMapping("equipes")
    public Equipe addEquipe(@RequestBody Equipe e){
        return es.addEquipe(e);
    }

    @GetMapping("equipes/{id}")
    public Optional<Equipe> getEquipeById(@PathVariable Long id){
        return es.getEquipeById(id);
    }

    @DeleteMapping("equipes/{id}")
    public void deleteAllEquipe(@PathVariable Long id){
        es.deleteEquipe(id);
    }

    @PutMapping("equipes")
    public Equipe updateEquipe(@RequestBody Equipe m){
        return es.updateEquipe(m);
    }

    @GetMapping("pays/{pays}")
    public List<Equipe> findByPays(@PathVariable String pays){
        return es.findByPays(pays);
    }

    @GetMapping("nomEquipe/{nomEquipe}")
    public Equipe findByNomEquipe(@PathVariable String nomEquipe){
        return es.findByNomEquipe(nomEquipe);
    }

    @GetMapping("deuxEquipes")
    public List<Equipe> findTwoEquipes(){
        Matsh matsh = ms.findById(3L);
        List<Equipe> equipes = matsh.getEquipes();
        return equipes;
    }
}
