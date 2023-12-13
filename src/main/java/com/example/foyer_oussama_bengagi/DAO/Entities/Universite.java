package com.example.foyer_oussama_bengagi.DAO.Entities;

import jakarta.persistence.*;


@Entity
@Table(name="Universite")
public class Universite {
    @Id
    @Column(name = "idUniversite")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomUniversite;
    private String adresse;
    @OneToOne
    private Foyer foyer;

}
