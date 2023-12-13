package com.example.foyer_oussama_bengagi.Services;

import com.example.foyer_oussama_bengagi.DAO.Entities.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc b);
    List<Bloc> addAllBlocs(List<Bloc> blocs);

    Bloc updateBloc(Bloc b);
    List<Bloc> updateAllBlocs(List<Bloc> blocs);
    List<Bloc> findAllBlocs();
    Bloc findBlocById(long id);
    void deleteBloc(Bloc b);
    void deleteBlocById(long id);

}
