package com.ciclo3.reto.Servicio;

/**
 * @Author
 * Juan Diego Arenas Cuellar	juan.arenas.mt@usa.edu.co
 * Carlos Alberto Rey Ardila	carlos.rey.mt@usa.edu.co
 * Edgar Mauricio Abaunza Pinzon	edgar.abaunza.mt@usa.edu.co
 * Darly Fernanda Sandoval Plazas	darly.sandoval.mt@usa.edu.co
 * Adriana Feo Osma	adriana.feo.mt@usa.edu.co
 */

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
