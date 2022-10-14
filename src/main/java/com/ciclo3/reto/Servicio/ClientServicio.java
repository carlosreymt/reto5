package com.ciclo3.reto.Servicio;


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
