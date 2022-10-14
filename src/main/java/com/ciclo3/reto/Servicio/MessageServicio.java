package com.ciclo3.reto.Servicio;

import com.ciclo3.reto.Entidades.Category;
import com.ciclo3.reto.Entidades.Message;
import com.ciclo3.reto.Repositorio.CategoryRepositorio;
import com.ciclo3.reto.Repositorio.MessageRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageServicio {
    private MessageRepositorio repositorio;

    public MessageServicio(MessageRepositorio repositorio){
        this.repositorio = repositorio;
    }

    public List<Message> listaMessage(){
        return (List<Message>) repositorio.findAll();
    }

    public Optional<Message> buscarMessage(int id){
        return repositorio.findById(id);
    }

    public Message GuardarMessage(Message message){
        if(message.getIdMessage() == null){
            return repositorio.save(message);
        }
        else{
            return message;
        }
    }
}
