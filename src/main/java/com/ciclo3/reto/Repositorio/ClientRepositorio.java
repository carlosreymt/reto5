package com.ciclo3.reto.Repositorio;

import com.ciclo3.reto.Entidades.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepositorio extends CrudRepository<Client, Integer> {
}
