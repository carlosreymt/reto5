package com.ciclo3.reto.Servicio;

/**
 * @Author
 * Juan Diego Arenas Cuellar	juan.arenas.mt@usa.edu.co
 * Carlos Alberto Rey Ardila	carlos.rey.mt@usa.edu.co
 * Edgar Mauricio Abaunza Pinzon	edgar.abaunza.mt@usa.edu.co
 * Darly Fernanda Sandoval Plazas	darly.sandoval.mt@usa.edu.co
 * Adriana Feo Osma	adriana.feo.mt@usa.edu.co
 */

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
