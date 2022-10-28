package com.project.projet_fin_chapitre.service;

import com.project.projet_fin_chapitre.dao.EquipeRepository;
import com.project.projet_fin_chapitre.entities.Equipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipeService {
    @Autowired
    EquipeRepository er;

    public List<Equipe> getAllEquipes(){
        return er.findAll();
    }

    public Equipe addEquipe(Equipe e){
        return er.save(e);
    }

    public Optional<Equipe> getEquipeById(Long id){
        return er.findById(id);
    }

    public void deleteEquipe(Long id){
        er.deleteById(id);
    }

    public Equipe updateEquipe(Equipe m){
        return er.save(m);
    }

    public List<Equipe> findByPays(String pays) {
        return er.findByPays(pays);
    }

    public Equipe findByNomEquipe(String nomEquipe) {

        return er.findByNomEquipe(nomEquipe);
    }
}
