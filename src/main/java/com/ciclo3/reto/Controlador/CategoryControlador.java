package com.ciclo3.reto.Controlador;

import com.ciclo3.reto.Entidades.Category;
import com.ciclo3.reto.Servicio.CategoryServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CategoryControlador {
    private CategoryServicio servicio;

    public CategoryControlador(CategoryServicio servicio){
        this.servicio = servicio;
    }

    @GetMapping("/api/Category/all")
    public List<Category> listaCategory(){
        return servicio.listaCategory();
    }

    @PostMapping("/api/Category/save")
    public Category save (@RequestBody Category category){
        return servicio.GuardarCategory(category);
    }

    @GetMapping("/api/Category/{id}")
    public Optional<Category> buscarCategory(@PathVariable("id") int id){
        return servicio.buscarCategory(id);
    }

}
