package com.ciclo3.reto.Servicio;

import com.ciclo3.reto.Entidades.Admin;
import com.ciclo3.reto.Repositorio.AdminRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServicio {
    private AdminRepositorio repositorio;

    public AdminServicio(AdminRepositorio repositorio){
        this.repositorio = repositorio;
    }

    public List<Admin> listaAdmin(){
        return (List<Admin>) repositorio.findAll();
    }

    public Optional<Admin> buscarAdmin(int id){
        return repositorio.findById(id);
    }

    public Admin GuardarAdmin(Admin admin){
        if(admin.getIdAdmin() == null){
            return repositorio.save(admin);
        }
        else{
            return admin;
        }
    }



}
