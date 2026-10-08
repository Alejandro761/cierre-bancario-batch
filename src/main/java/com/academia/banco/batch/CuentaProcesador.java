package com.academia.banco.batch;

import java.math.BigDecimal;

import org.springframework.batch.infrastructure.item.ItemProcessor;

import com.academia.banco.model.SaldoCuenta;

public class CuentaProcesador implements ItemProcessor<SaldoCuenta, SaldoCuenta> {
    
    @Override 
    public SaldoCuenta process (SaldoCuenta saldoCuenta) {
        BigDecimal saldo = saldoCuenta.saldo();

        if (saldo.compareTo(new BigDecimal("0.00")) < 0) {
            return null;
        }

        return saldoCuenta;
    }
}
