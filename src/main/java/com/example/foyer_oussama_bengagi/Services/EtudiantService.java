package com.example.foyer_oussama_bengagi.Services;


import com.example.foyer_oussama_bengagi.DAO.Repository.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService{

EtudiantRepository etudiantRepository;

}
