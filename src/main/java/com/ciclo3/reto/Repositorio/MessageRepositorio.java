package com.ciclo3.reto.Repositorio;

import com.ciclo3.reto.Entidades.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepositorio extends CrudRepository<Message, Integer> {
}
