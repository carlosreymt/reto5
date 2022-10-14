package com.ciclo3.reto.Entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="score")
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idScore;

    @Column(name="messageText", length = 250, nullable = false, unique = false)
    private String messageText;

    @Column(name="score")
    private Integer score;

    @ManyToOne
    @JsonIgnoreProperties("score")
    private Reservation reservation;

    //Constructor , Getter and Setter


    public Score() {
    }

    public Score(Integer idScore, String messageText, Integer score, Reservation reservation) {
        this.idScore = idScore;
        this.messageText = messageText;
        this.score = score;
        this.reservation = reservation;
    }

    public Integer getIdScore() {
        return idScore;
    }

    public void setIdScore(Integer idScore) {
        this.idScore = idScore;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "Score{" +
                "idScore=" + idScore +
                ", messageText='" + messageText + '\'' +
                ", score=" + score +
                ", reservation=" + reservation +
                '}';
    }
}
