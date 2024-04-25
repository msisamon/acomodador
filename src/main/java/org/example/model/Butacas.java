package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Butacas {
    int numFila;
    int numButaca;
    boolean ocupada;
    int valorVisibilidad;
}
