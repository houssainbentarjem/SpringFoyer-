package com.example.foyer_oussama_bengagi.Services;
import com.example.foyer_oussama_bengagi.DAO.Entities.Bloc;
import com.example.foyer_oussama_bengagi.DAO.Entities.Chambre;
import com.example.foyer_oussama_bengagi.DAO.Repository.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ChambreService implements IChambreService{

ChambreRepository chambreRepository;


    @Override
    public Chambre addChmabre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public List<Chambre> addAllChambres(List<Chambre> chambres) {
        return chambreRepository.saveAll(chambres);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public List<Chambre> updateAllChambres(List<Chambre> chambres) {
        return chambreRepository.saveAll(chambres);
    }

    @Override
    public List<Chambre> findAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre findChambreById(long id) {
       return  chambreRepository.findById(id).orElse(Bloc.builder().id(0).nomBloc("Chambre").build());
    }

    @Override
    public void deleteChambre(Chambre c) {

    }

    @Override
    public void deleteChambreById(long id) {

    }
}
