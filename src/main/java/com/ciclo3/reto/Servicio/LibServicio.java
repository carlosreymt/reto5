package com.ciclo3.reto.Servicio;

/**
 * @Author
 * Juan Diego Arenas Cuellar	juan.arenas.mt@usa.edu.co
 * Carlos Alberto Rey Ardila	carlos.rey.mt@usa.edu.co
 * Edgar Mauricio Abaunza Pinzon	edgar.abaunza.mt@usa.edu.co
 * Darly Fernanda Sandoval Plazas	darly.sandoval.mt@usa.edu.co
 * Adriana Feo Osma	adriana.feo.mt@usa.edu.co
 */

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
