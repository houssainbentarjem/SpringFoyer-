package com.example.foyer_oussama_bengagi.DAO.Repository;

import com.example.foyer_oussama_bengagi.DAO.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;


@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    // select * from etudiant where cin = ....

    Etudiant findByCin(long cin);
    List<Etudiant> findByNomEtLike(String nom);
    List<Etudiant> findByNomEtContains(String nom);
    List<Etudiant> findByNomEtContaining(String nom);
    Etudiant findByNomAndPrenom(String nom, String prenom);
    Etudiant findByCin(String cin);
    List<Etudiant> findByDateNaissanceAfter(LocalDate date);
    List<Etudiant> findByEcole(String ecole);
    List<Etudiant> findByIdReservation(long idReservation);
    List<Etudiant> findByReservationsAnnee(int annee);
    List<Etudiant> findByEcoleNomAndDateNaissanceAfter(String ecole, Date date);
    List<Etudiant> findByReservationsAnneeOrderByDateNaissanceAsc(int annee);


}
