package com.example.foyer_oussama_bengagi.DAO.Repository;

import com.example.foyer_oussama_bengagi.DAO.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ReservationRepository extends JpaRepository<Reservation,String> {
    List<Reservation> findByEstValide(boolean estValide);
    List<Reservation> findByIdEtudiant(Long idEtudiant);
    List<Reservation> findByAnneeUniversitaireAndEstValide(int anneeUniversitaire, boolean estValide);

}