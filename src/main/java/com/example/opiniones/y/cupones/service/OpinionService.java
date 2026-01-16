package com.example.opiniones.y.cupones.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.opiniones.y.cupones.models.entities.Opinion;
import com.example.opiniones.y.cupones.models.request.AgregarOpinion;
import com.example.opiniones.y.cupones.repository.OpinionRepository;

@Service


public class OpinionService {
    @Autowired
    private OpinionRepository opinionRepository;

    public List<Opinion> obtenerTodas() {
        return opinionRepository.findAll();
    }

    public Opinion guardar(AgregarOpinion request) {
        Opinion opinion = new Opinion();
        opinion.setId_curso(request.getId_curso());
        opinion.setComentario(request.getComentario());
        opinion.setCalificacion(request.getCalificacion());
        return opinionRepository.save(opinion);
    }
    
}
