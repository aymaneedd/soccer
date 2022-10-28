package com.project.projet_fin_chapitre.controller;

import com.project.projet_fin_chapitre.entities.Matsh;
import com.project.projet_fin_chapitre.service.MatshService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class MatshController {

    @Autowired
    MatshService ms;

    @GetMapping("masths")
    public List<Matsh> getAllMatshs(){
        return ms.getAllMatshs();
    }

    @GetMapping("matshs/{id}")
    public Optional<Matsh> getMatshById(@PathVariable Long id){
        return ms.getMatshById(id);
    }

    @PostMapping("matshs")
    public Matsh addMatsh(@RequestBody Matsh m){
        return ms.addMatsh(m);
    }

    @DeleteMapping("matshs/{id}")
    public void deleteAllMatsh(@PathVariable Long id){
        ms.deleteMatsh(id);
    }

    @PutMapping("matshs")
    public Matsh updateMatsh(@RequestBody Matsh m){
        return ms.updateMatsh(m);
    }

    @GetMapping("DateMatch")
    public List<Matsh> findByDateMatch(){
        return ms.findByDateMatch(LocalDate.parse("2021-02-28"));
    }

    @DeleteMapping("delete")
    public void findByDateMatchBefore(){
        List<Matsh> matchFoots = ms.findByDateMatchBefore(LocalDate.now());
        matchFoots.forEach((matchFound) -> {
            ms.deleteById(matchFound.getIdMatsh());
        });
        System.out.println(ms.findAll());
    }
}
