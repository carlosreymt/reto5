package com.ciclo3.reto.Controlador;

import com.ciclo3.reto.Entidades.Admin;
import com.ciclo3.reto.Servicio.AdminServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AdminControlador {
    private AdminServicio servicio;

    public AdminControlador(AdminServicio servicio){
        this.servicio = servicio;
    }

    @GetMapping("/api/Admin/all")
    public List<Admin> listaAdmin(){
        return servicio.listaAdmin();
    }

    @PostMapping("/api/Admin/save")
    public Admin save (@RequestBody Admin admin){
        return servicio.GuardarAdmin(admin);
    }

    @GetMapping("/api/Admin/{id}")
    public Optional<Admin> buscarAdmin(@PathVariable("id") int id){
        return servicio.buscarAdmin(id);
    }


}