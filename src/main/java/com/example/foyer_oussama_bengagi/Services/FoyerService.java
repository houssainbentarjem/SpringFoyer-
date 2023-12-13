package com.example.foyer_oussama_bengagi.Services;


import com.example.foyer_oussama_bengagi.DAO.Repository.FoyerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService{
    FoyerRepository foyerRepository;
}
