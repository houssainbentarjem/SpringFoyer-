package com.example.foyer_oussama_bengagi.Services;


import com.example.foyer_oussama_bengagi.DAO.Repository.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService{

    UniversiteRepository universiteRepository;

}
