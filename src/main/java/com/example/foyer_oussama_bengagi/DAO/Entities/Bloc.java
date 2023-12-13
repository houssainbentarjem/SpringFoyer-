package com.example.foyer_oussama_bengagi.DAO.Entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;



@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@Table(name="Bloc")
public class Bloc {
    @Id
    @Column(name = "idBloc")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomBloc;
    private long capaciteBloc;

    @ManyToOne
    Foyer foyer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bloc")
    Set<Chambre> chambres;




}
