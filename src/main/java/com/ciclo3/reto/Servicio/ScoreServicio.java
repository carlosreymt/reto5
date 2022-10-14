package com.ciclo3.reto.Servicio;

import com.ciclo3.reto.Entidades.Category;
import com.ciclo3.reto.Entidades.Score;
import com.ciclo3.reto.Repositorio.ScoreRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServicio {
    private ScoreRepositorio repositorio;

    public ScoreServicio(ScoreRepositorio repositorio){
        this.repositorio = repositorio;
    }

    public List<Score> listaScore(){
        return (List<Score>) repositorio.findAll();
    }

    public Score GuardarScore(Score score){
        if(score.getIdScore() == null){
            return repositorio.save(score);
        }
        else{
            return score;
        }
    }
}
