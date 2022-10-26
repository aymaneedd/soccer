package com.project.projet_fin_chapitre.dao;

import com.project.projet_fin_chapitre.entities.Matsh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatshRepository extends JpaRepository<Matsh, Long> {

}
