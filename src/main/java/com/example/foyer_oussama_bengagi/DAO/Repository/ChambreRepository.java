package com.example.foyer_oussama_bengagi.DAO.Repository;

import com.example.foyer_oussama_bengagi.DAO.Entities.Bloc;
import com.example.foyer_oussama_bengagi.DAO.Entities.Chambre;
import com.example.foyer_oussama_bengagi.DAO.Entities.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {

    Chambre findByNumeroChambre(Long numeroChambre);
    List<Chambre> findByTypeChambre(TypeChambre type);
    List<Chambre> findByBloc(Bloc bloc);
    List<Chambre> findByBlocAndTypeChambre(Bloc bloc, TypeChambre type);
    Chambre findByNumeroChambreAndTypeChambre(Long numeroChambre, TypeChambre type);


}
