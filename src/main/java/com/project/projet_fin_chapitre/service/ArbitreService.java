package com.project.projet_fin_chapitre.service;

import com.project.projet_fin_chapitre.dao.ArbitreRepository;
import com.project.projet_fin_chapitre.entities.Arbitre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArbitreService {
    @Autowired
    ArbitreRepository ar;

    public List<Arbitre> getAllArbitres(){
        return ar.findAll();
    }

    public Arbitre addArbitre(Arbitre a){
        return ar.save(a);
    }

    public Optional<Arbitre> getArbitreById(Long id){
        return ar.findById(id);
    }

    public void deleteArbitre(Long id){
        ar.deleteById(id);
    }

    public Arbitre updateArbitre(Arbitre a){
        return ar.save(a);
    }
}
