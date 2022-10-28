package com.project.projet_fin_chapitre.controller;

import com.project.projet_fin_chapitre.entities.Stade;
import com.project.projet_fin_chapitre.service.MatshService;
import com.project.projet_fin_chapitre.service.StadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StadeController {

    @Autowired
    StadeService ss;

    @Autowired
    MatshService ms;

    @GetMapping("stades")
    public List<Stade> getAllStades(){
        return ss.getAllStades();
    }

    @PostMapping("stades")
    public Stade addStade(@RequestBody Stade s){
        return ss.addStade(s);
    }

    @GetMapping("stades/{id}")
    public Optional<Stade> getStadeById(@PathVariable Long id){
        return ss.getStadeById(id);
    }

    @DeleteMapping("stades/{id}")
    public void deleteAllStade(@PathVariable Long id){
        ss.deleteStade(id);
    }

    @PutMapping("stades")
    public Stade updateStade(@RequestBody Stade s){
        return ss.updateStade(s);
    }

    @GetMapping("stade3")
    public String findStadePartido(){
        Stade stade = ms.findById(3L).getStade();
        return stade.getNomStade();
    }
}
