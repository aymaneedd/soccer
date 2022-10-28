package com.project.projet_fin_chapitre.service;

import com.project.projet_fin_chapitre.dao.MatshRepository;
import com.project.projet_fin_chapitre.entities.Matsh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class MatshService {
    @Autowired
    MatshRepository mr;

    public List<Matsh> getAllMatshs(){
        return mr.findAll();
    }

    public Matsh addMatsh(Matsh m){
        return mr.save(m);
    }

    public Matsh findById(Long id) {
        return mr.findById(id).orElseThrow(() -> new RuntimeException("match not found"));
    }

    public void deleteMatsh(Long id){
        mr.deleteById(id);
    }

    public void deleteById(Long id) {
        mr.deleteById(id);
    }

    public List<Matsh> findAll() {
        return mr.findAll();
    }

    public Optional<Matsh> getMatshById(Long id) {
        return mr.findById(id);
    }

    public Matsh updateMatsh(Matsh m){

        return mr.save(m);
    }

    public List<Matsh> findByDateMatch(LocalDate dateMatch) {
        return mr.findByDateMatsh(dateMatch);
    }

    public List<Matsh> findByDateMatchBefore(LocalDate dateMatch) {
        return mr.findByDateMatshBefore(dateMatch);
    }

}
