package com.tutorialesvip.tutorialunittest.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Period;
class DiferenciaEntreFechasTest {

    @Autowired
    DiferenciaEntreFechas diferenciaEntreFechas;

    @Test
    void calculateYearsOfIndependency() {

        diferenciaEntreFechas = new DiferenciaEntreFechas();
    
        String fechaIndependencia = "27/02/1844";

        Period resultado = diferenciaEntreFechas.calculateYearsOfIndependency(fechaIndependencia);
        
        Assertions.assertEquals(4, resultado.getMonths());
        Assertions.assertEquals(23, resultado.getDays());
        Assertions.assertEquals(180, resultado.getYears());
    }
}