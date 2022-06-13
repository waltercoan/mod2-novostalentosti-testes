package br.univille;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlanejadorDeChurrascoTest {
    private PlanejadorDeChurrasco plan;
    
    @BeforeEach
    public void inicio(){
        plan = new PlanejadorDeChurrasco();
    }


    @Test
    public void testaUmAdultoZeroCrianca(){
        plan.setAdulto(1);
        plan.setCrianca(0);
        assertEquals(250f, plan.calculaQtdCarne());
    }
    @Test
    public void testaZeroAdultoUmaCrianca(){
        plan.setAdulto(0);
        plan.setCrianca(1);
        assertEquals(100f, plan.calculaQtdCarne());
    }
}
