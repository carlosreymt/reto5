package com.ciclo3.reto.Repositorio;

import com.ciclo3.reto.Entidades.Lib;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibRepositorio extends CrudRepository<Lib,Integer> {
}
