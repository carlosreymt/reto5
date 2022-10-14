package com.ciclo3.reto.Controlador;


import com.ciclo3.reto.Entidades.Client;
import com.ciclo3.reto.Servicio.ClientServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClientControlador {
    private ClientServicio servicio;

    public ClientControlador(ClientServicio servicio){
        this.servicio = servicio;
    }

    @GetMapping("/api/Client/all")
    public List<Client> listaClient(){
        return servicio.listaClient();
    }

    @PostMapping("/api/Client/save")
    public Client save (@RequestBody Client client){
        return servicio.GuardarClient(client);
    }

    @GetMapping("/api/Client/{id}")
    public Optional<Client> buscarCategory(@PathVariable("id") int id){
        return servicio.buscarClient(id);
    }
}
