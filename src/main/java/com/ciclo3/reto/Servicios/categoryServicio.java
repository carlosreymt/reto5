package com.ciclo3.reto.Servicios;

import com.ciclo3.reto.Entidades.Category;
import com.ciclo3.reto.Repositorio.categoryRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class categoryServicio {
    private categoryRepositorio repositorio;

    public categoryServicio(categoryRepositorio repositorio){
        this.repositorio = repositorio;
    }

    //Consultar todas las categorias. ALL
    public List<Category> listaCategory(){
        return (List<Category>) repositorio.findAll();
    }

    //Consultar una categoria por ID
    public Optional<Category> buscarCategory(String id){
        return repositorio.findById(id);
    }

    //Guardar una categoria
    public Category GuardarCategory(Category category){
        if(category.getId() == null){
            return repositorio.save(category);
        }
        else{
            return category;
        }
    }

}
