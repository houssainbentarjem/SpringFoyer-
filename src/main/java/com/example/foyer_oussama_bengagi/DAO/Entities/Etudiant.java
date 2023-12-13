package com.example.foyer_oussama_bengagi.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
@Table(name="Etudiant")
public class Etudiant {
    @Id
    @Column(name = "idEtudiant")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomEt;
    private String prenomEt;
    @NonNull
    private long cin;
    private String ecole;
    private LocalDate dateNaissance;

    public Etudiant() {

    }

    @ManyToMany(mappedBy = "etudiants", cascade = CascadeType.ALL)
    private Set<Reservation> reservations;

}
