package com.ciclo3.reto.Servicio;

import com.ciclo3.reto.Entidades.Reservation;
import com.ciclo3.reto.Repositorio.ReservationRepositorio;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class ReservationServicio {

    private ReservationRepositorio repositorio;

    public ReservationServicio(ReservationRepositorio repositorio){
        this.repositorio = repositorio;
    }

    public List<Reservation> listaReservation(){
        return (List<Reservation>) repositorio.findAll();
    }

    public Optional<Reservation> buscarReservation(int id){
        return repositorio.findById(id);
    }

    public Reservation GuardarReservation(Reservation reservation){
        if(reservation.getIdReservation() == null){
            return repositorio.save(reservation);
        }
        else{
            return reservation;
        }
    }



}
