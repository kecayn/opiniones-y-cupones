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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_opinion;

    @Column(nullable = false)
    private int id_curso; // Relación con Curso en el diagrama

    @Column(nullable = false)
    private int id_usuario; // Relación con Usuario en el diagrama

    @Column(nullable = false, length = 500)
    private String comentario;

    @Column(nullable = false)
    private int calificacion;

    @Column(nullable = false)
    private java.time.LocalDateTime fecha;
}
