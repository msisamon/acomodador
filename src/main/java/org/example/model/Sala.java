package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sala {
    int filas;
    int columnas;

    List<Butacas> butacas;
    //List<List<Butacas>> mapaButacas;

    //Butacas [][] mapaButacas;


}
