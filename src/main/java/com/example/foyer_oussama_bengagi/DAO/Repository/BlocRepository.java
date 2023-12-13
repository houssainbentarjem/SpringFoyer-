package com.example.foyer_oussama_bengagi.DAO.Repository;

import com.example.foyer_oussama_bengagi.DAO.Entities.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.foyer_oussama_bengagi.DAO.Entities.Bloc;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {

    Bloc findByNomBloc(String nomBloc);
    Bloc getByNomBloc(String nomBloc);
    Bloc findByNomBlocAndCapaciteBloc(String nomBloc, int capaciteBloc);
    Bloc findByNomBlocOrCapaciteBloc(String nomBloc, int capaciteBloc);
    Bloc findByNomBlocAndIgnoreCase(String nomBloc);
    Bloc findByCapaciteBlocGreaterThan(int capacite);
    Bloc findByNomBlocContaining(String x);
    Bloc findAllByOrderByNomBlocAsc();
    List<Foyer> findByBloc(Bloc bloc);
    Foyer findByIdFoyerAndBloc(Long idFoyer, Bloc bloc);




}
