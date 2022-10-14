package com.ciclo3.reto.Controlador;

/**
 * @Author
 * Juan Diego Arenas Cuellar	juan.arenas.mt@usa.edu.co
 * Carlos Alberto Rey Ardila	carlos.rey.mt@usa.edu.co
 * Edgar Mauricio Abaunza Pinzon	edgar.abaunza.mt@usa.edu.co
 * Darly Fernanda Sandoval Plazas	darly.sandoval.mt@usa.edu.co
 * Adriana Feo Osma	adriana.feo.mt@usa.edu.co
 */

import com.ciclo3.reto.Entidades.Reservation;
import com.ciclo3.reto.Servicio.ReservationServicio;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class ReservationControlador {

    private ReservationServicio servicio;

    public ReservationControlador(ReservationServicio servicio){
        this.servicio = servicio;
    }

    @GetMapping("/api/Reservation/all")
    public List<Reservation> listaReservation(){
        return servicio.listaReservation();
    }

    @PostMapping("/api/Reservation/save")
    public Reservation save (@RequestBody Reservation reservation){
        return servicio.GuardarReservation(reservation);
    }

    @GetMapping("/api/Reservation/{id}")
    public Optional<Reservation> buscarReservation(@PathVariable("id") int id){
        return servicio.buscarReservation(id);
    }
}
