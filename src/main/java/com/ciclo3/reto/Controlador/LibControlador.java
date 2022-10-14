package com.ciclo3.reto.Controlador;

import com.ciclo3.reto.Entidades.Category;
import com.ciclo3.reto.Entidades.Lib;
import com.ciclo3.reto.Servicio.CategoryServicio;
import com.ciclo3.reto.Servicio.LibServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LibControlador {
    private LibServicio servicio;

    public LibControlador(LibServicio servicio){
        this.servicio = servicio;
    }

    @GetMapping("/api/Lib/all")
    public List<Lib> listaLib(){
        return servicio.listaLib();
    }

    @PostMapping("/api/Lib/save")
    public Lib save (@RequestBody Lib lib){
        return servicio.GuardarLib(lib);
    }

    @GetMapping("/api/Lib/{id}")
    public Optional<Lib> buscarLib(@PathVariable("id") int id){
        return servicio.buscarLib(id);
    }
}
