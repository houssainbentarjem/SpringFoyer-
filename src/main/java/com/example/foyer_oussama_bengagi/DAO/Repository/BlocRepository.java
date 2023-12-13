package com.example.foyer_oussama_bengagi.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.foyer_oussama_bengagi.DAO.Entities.Bloc;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {
}
