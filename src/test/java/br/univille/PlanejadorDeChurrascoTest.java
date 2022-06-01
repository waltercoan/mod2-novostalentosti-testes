package br.univille;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PlanejadorDeChurrascoTest {
    
    @Test
    public void testaUmAdultoZeroCrianca(){
        PlanejadorDeChurrasco plan = new PlanejadorDeChurrasco();
        plan.setAdulto(1);
        plan.setCrianca(0);
        assertEquals(250f, plan.calculaQtdCarne());
    }
}
