package com.example.foyer_oussama_bengagi.DAO.Repository;

import com.example.foyer_oussama_bengagi.DAO.Entities.Foyer;
import com.example.foyer_oussama_bengagi.DAO.Entities.Reservation;
import com.example.foyer_oussama_bengagi.DAO.Entities.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FoyerRepository extends JpaRepository<Foyer,Long> {
    Foyer findByNomFoyer(String nom);
    List<Foyer> findByCapaciteFoyerGreaterThan(int capacite);
    List<Foyer> findByCapaciteFoyerLessThan(int capacite);
    List<Foyer> findByCapaciteFoyerBetween(int min,int max);
    Foyer findByUniversiteNomUniversite(String nom);
    List<Foyer> getByBlocsChambresTypeC(TypeChambre typeChambre);
    List<Reservation> findByEstValide(boolean estValide);
    List<Reservation> findByIdEtudiant(long idEtudiant);
    List<Reservation> findByAnneeUniversitaireAndEstValide(int anneeUniversitaire, boolean estValide);



}