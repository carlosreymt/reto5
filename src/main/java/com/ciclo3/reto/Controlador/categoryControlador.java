package com.ciclo3.reto.Controlador;

import com.ciclo3.reto.Entidades.Category;
import com.ciclo3.reto.Servicios.categoryServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class categoryControlador {
    private categoryServicio servicio;

    public categoryControlador(categoryServicio servicio){
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

}
