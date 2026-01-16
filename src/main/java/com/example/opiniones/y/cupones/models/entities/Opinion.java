package com.example.opiniones.y.cupones.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "opiniones")
public class Opinion {
    @
    Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_opinion;

    @Column(nullable = false)
    private int id_curso; // Este es el ID que vincularemos luego con el microservicio de Cursos

    @Column(nullable = false, length = 500)
    private String comentario;

    @Column(nullable = false)
    private int calificacion; // Puntuación de 1 a 5
    
}
