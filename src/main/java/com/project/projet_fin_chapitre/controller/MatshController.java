package com.project.projet_fin_chapitre.controller;

import com.project.projet_fin_chapitre.entities.Matsh;
import com.project.projet_fin_chapitre.service.MatshService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MatshController {

    @Autowired
    MatshService ms;

    @GetMapping("matshs")
    public List<Matsh> getAllMatshs(){
        return ms.getAllMatshs();
    }

    @PostMapping("matshs")
    public Matsh addMatsh(@RequestBody Matsh m){
        return ms.addMatsh(m);
    }

    @GetMapping("matshs/{id}")
    public Optional<Matsh> getMatshById(@PathVariable Long id){
        return ms.getMatshById(id);
    }

    @DeleteMapping("matshs/{id}")
    public void deleteAllMatsh(@PathVariable Long id){
        ms.deleteMatsh(id);
    }

    @PutMapping("matshs")
    public Matsh updateMatsh(@RequestBody Matsh m){
        return ms.updateMatsh(m);
    }
}
