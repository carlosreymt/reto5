package com.ciclo3.reto.Repositorio;

import com.ciclo3.reto.Entidades.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepositorio extends CrudRepository<Admin, Integer> {

}
