package com.example.foyer_oussama_bengagi.Services;


import com.example.foyer_oussama_bengagi.DAO.Repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService{

    ReservationRepository reservationRepository;

}
