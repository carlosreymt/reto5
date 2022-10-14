package com.ciclo3.reto.Servicio;

/**
 * @Author
 * Juan Diego Arenas Cuellar	juan.arenas.mt@usa.edu.co
 * Carlos Alberto Rey Ardila	carlos.rey.mt@usa.edu.co
 * Edgar Mauricio Abaunza Pinzon	edgar.abaunza.mt@usa.edu.co
 * Darly Fernanda Sandoval Plazas	darly.sandoval.mt@usa.edu.co
 * Adriana Feo Osma	adriana.feo.mt@usa.edu.co
 */

import com.ciclo3.reto.Entidades.Client;
import com.ciclo3.reto.Repositorio.ClientRepositorio;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClientServicio {
    private ClientRepositorio repositorio;

    public ClientServicio(ClientRepositorio repositorio){
        this.repositorio = repositorio;
    }

    public List<Client> listaClient() {
        return (List<Client>) repositorio.findAll();
    }

    public Optional<Client> buscarClient(int id){
        return repositorio.findById(id);
    }

    public Client GuardarClient(Client client){
        if(client.getIdClient() == null){
            return repositorio.save(client);
        }
        else{
            return client;
        }
    }




}
