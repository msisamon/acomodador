package org.example.repository;

import org.example.model.Butacas;
import org.example.model.Sala;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SalaDB {
    List<Sala> salas;

    public SalaDB () {
        this.salas = new ArrayList<>();
        salas.add(new Sala(9, 10, new ArrayList<Butacas>()));
    }
}
