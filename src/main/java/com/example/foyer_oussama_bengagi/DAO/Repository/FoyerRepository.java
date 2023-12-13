package com.example.foyer_oussama_bengagi.DAO.Repository;

import com.example.foyer_oussama_bengagi.DAO.Entities.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FoyerRepository extends JpaRepository<Foyer,Long> {
}
