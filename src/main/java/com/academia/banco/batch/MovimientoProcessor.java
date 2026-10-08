package com.academia.banco.batch;

import com.academia.banco.model.Movimiento;

import java.math.BigDecimal;

import org.springframework.batch.infrastructure.item.ItemProcessor;

// El Procesador: recibe UN movimiento como lo leyó el Lector y devuelve el que se va a escribir.
public class MovimientoProcessor implements ItemProcessor<Movimiento, Movimiento> {

    @Override
    public Movimiento process(Movimiento movimiento) {
        String tipo = movimiento.tipo().trim().toUpperCase();   // " retiro" → "RETIRO"
        if (!tipo.equals("DEPOSITO") && !tipo.equals("RETIRO")) {
            return null;                                         // null = «este no se escribe» (se FILTRA)
        }

        if (movimiento.monto().compareTo(new BigDecimal("10000.00")) > 0) {  // si el monto es mayor a 10 mil
            return null; 
        } 
        return new Movimiento(movimiento.cuenta().trim(), tipo, movimiento.monto());
    }
}