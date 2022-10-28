package com.project.projet_fin_chapitre.service;

import com.project.projet_fin_chapitre.dao.StadeRepository;
import com.project.projet_fin_chapitre.entities.Stade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StadeService {
    @Autowired
    StadeRepository sr;

    public List<Stade> getAllStades(){
        return sr.findAll();
    }

    public Stade addStade(Stade s){
        return sr.save(s);
    }

    public Optional<Stade> getStadeById(Long id){
        return sr.findById(id);
    }

    public void deleteStade(Long id){
        sr.deleteById(id);
    }

    public Stade updateStade(Stade s){
        return sr.save(s);
    }

    public Optional<Stade> findById(Long id) {
        return sr.findById(id);
    }
}
