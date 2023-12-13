package com.example.foyer_oussama_bengagi.DAO.Entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="Reservation")
public class Reservation {
    @Id
    @Column(name = "idReservation")
    private String id;
    private LocalDate anneeUniversitaire;
    private boolean estValide;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;

}
