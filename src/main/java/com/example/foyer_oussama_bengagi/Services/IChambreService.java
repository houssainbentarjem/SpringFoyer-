package com.example.foyer_oussama_bengagi.Services;

import com.example.foyer_oussama_bengagi.DAO.Entities.Chambre;

import java.util.List;

public interface IChambreService {

    Chambre addChmabre(Chambre c);
    List<Chambre> addAllChambres(List<Chambre> chambres);

    Chambre updateChambre(Chambre c);
    List<Chambre> updateAllChambres(List<Chambre> chambres);
    List<Chambre> findAllChambres();
    Chambre findChambreById(long id);
    void deleteChambre(Chambre c);
    void deleteChambreById(long id);
}
