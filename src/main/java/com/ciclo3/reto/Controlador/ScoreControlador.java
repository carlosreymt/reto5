package com.ciclo3.reto.Controlador;

import com.ciclo3.reto.Entidades.Score;
import com.ciclo3.reto.Servicio.ScoreServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ScoreControlador {
    private ScoreServicio servicio;

    public ScoreControlador(ScoreServicio servicio){
        this.servicio = servicio;
    }

    @GetMapping("/api/Score/all")
    public List<Score> listaScore(){
        return servicio.listaScore();
    }

    @PostMapping("/api/Score/save")
    public Score save (@RequestBody Score score){
        return servicio.GuardarScore(score);
    }

}
