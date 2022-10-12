package com.ciclo3.reto.Repositorio;


import com.ciclo3.reto.Entidades.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface categoryRepositorio extends CrudRepository<Category, String> {


}
