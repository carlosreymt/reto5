package com.ciclo3.reto.Controlador;

/**
 * @Author
 * Juan Diego Arenas Cuellar	juan.arenas.mt@usa.edu.co
 * Carlos Alberto Rey Ardila	carlos.rey.mt@usa.edu.co
 * Edgar Mauricio Abaunza Pinzon	edgar.abaunza.mt@usa.edu.co
 * Darly Fernanda Sandoval Plazas	darly.sandoval.mt@usa.edu.co
 * Adriana Feo Osma	adriana.feo.mt@usa.edu.co
 */

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
