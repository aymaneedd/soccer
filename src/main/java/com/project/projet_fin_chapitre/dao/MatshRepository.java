package com.project.projet_fin_chapitre.dao;

import com.project.projet_fin_chapitre.entities.Matsh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MatshRepository extends JpaRepository<Matsh, Long> {

    public List<Matsh> findByDateMatsh(LocalDate dateMatch);
    public List<Matsh> findByDateMatshBefore(LocalDate dateMatch);

}
