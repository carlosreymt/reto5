package com.ciclo3.reto.Controlador;

import com.ciclo3.reto.Entidades.Message;
import com.ciclo3.reto.Servicio.MessageServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MessageControlador {

    private MessageServicio servicio;

    public MessageControlador(MessageServicio servicio){
        this.servicio = servicio;
    }

    @GetMapping("/api/Message/all")
    public List<Message> listaMessage(){
        return servicio.listaMessage();
    }

    @PostMapping("/api/Message/save")
    public Message save (@RequestBody Message message){
        return servicio.GuardarMessage(message);
    }

    @GetMapping("/api/Message/{id}")
    public Optional<Message> buscarMessage(@PathVariable("id") int id){
        return servicio.buscarMessage(id);
    }
}
