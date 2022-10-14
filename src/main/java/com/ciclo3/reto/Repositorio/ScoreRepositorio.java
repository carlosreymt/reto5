package com.ciclo3.reto.Repositorio;

import com.ciclo3.reto.Entidades.Score;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepositorio extends CrudRepository<Score, Integer> {

}
