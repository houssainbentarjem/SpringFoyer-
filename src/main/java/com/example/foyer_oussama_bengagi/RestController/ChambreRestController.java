package com.example.foyer_oussama_bengagi.RestController;


import com.example.foyer_oussama_bengagi.DAO.Entities.Bloc;
import com.example.foyer_oussama_bengagi.DAO.Entities.Chambre;
import com.example.foyer_oussama_bengagi.Services.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class ChambreRestController {

    IChambreService iChambreService;

    @GetMapping("getAllChambres")
    public List<Chambre> getAll() {
        return iChambreService.findAllChambres();
    }
}
