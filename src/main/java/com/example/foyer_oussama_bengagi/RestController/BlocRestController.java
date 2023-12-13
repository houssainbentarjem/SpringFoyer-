package com.example.foyer_oussama_bengagi.RestController;


import com.example.foyer_oussama_bengagi.DAO.Entities.Bloc;
import com.example.foyer_oussama_bengagi.Services.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@AllArgsConstructor
@RestController
public class BlocRestController {
    IBlocService iBlocService;

    @GetMapping("getAll")
    public List<Bloc> getAll() {
        return iBlocService.findAllBlocs();
    }

}
