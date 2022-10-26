package com.project.projet_fin_chapitre.controller;

import com.project.projet_fin_chapitre.entities.Arbitre;
import com.project.projet_fin_chapitre.service.ArbitreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ArbitreController {

    @Autowired
    ArbitreService as;

    @GetMapping("arbitres")
    public List<Arbitre> getAllArbitres(){
        return as.getAllArbitres();
    }

    @PostMapping("arbitres")
    public Arbitre addArbitre(@RequestBody Arbitre a){
        return as.addArbitre(a);
    }

    @GetMapping("arbitres/{id}")
    public Optional<Arbitre> getArbitreById(@PathVariable Long id){
        return as.getArbitreById(id);
    }

    @DeleteMapping("arbitres/{id}")
    public void deleteAllArbitre(@PathVariable Long id){
        as.deleteArbitre(id);
    }

    @PutMapping("arbitres")
    public Arbitre updateArbitre(@RequestBody Arbitre a){
        return as.updateArbitre(a);
    }
}
