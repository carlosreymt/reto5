package com.ciclo3.reto.Repositorio;

import com.ciclo3.reto.Entidades.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepositorio extends CrudRepository<Reservation, Integer> {
}
