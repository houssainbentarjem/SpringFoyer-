package com.example.foyer_oussama_bengagi.Services;


import com.example.foyer_oussama_bengagi.DAO.Entities.Bloc;
import com.example.foyer_oussama_bengagi.DAO.Repository.BlocRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;




@Service
@AllArgsConstructor
public class BlocService implements IBlocService{

    BlocRepository blocRepository;

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public List<Bloc> addAllBlocs(List<Bloc> blocs) {
        return blocRepository.saveAll(blocs);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public List<Bloc> updateAllBlocs(List<Bloc> blocs) {
        return blocRepository.saveAll(blocs);
    }

    @Override
    public List<Bloc> findAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc findBlocById(long id) {
        return blocRepository.findById(id).orElse(Bloc.builder().id(0).nomBloc("Bloc").build());
    }

    @Override
    public void deleteBloc(Bloc b) {
        blocRepository.delete(b);
    }

    @Override
    public void deleteBlocById(long id) {
        blocRepository.deleteById(id);
    }
}
