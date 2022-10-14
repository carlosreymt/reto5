package com.ciclo3.reto.Servicio;

import com.ciclo3.reto.Entidades.Category;
import com.ciclo3.reto.Entidades.Lib;
import com.ciclo3.reto.Repositorio.LibRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibServicio {
    private LibRepositorio repositorio;

    public LibServicio(LibRepositorio repositorio){this.repositorio = repositorio;}

    public List<Lib> listaLib(){
        return (List<Lib>) repositorio.findAll();
    }

    public Optional<Lib> buscarLib(int id){
        return repositorio.findById(id);
    }

    public Lib GuardarLib(Lib lib){
        if(lib.getId() == null){
            return repositorio.save(lib);
        }
        else{
            return lib;
        }
    }
}
