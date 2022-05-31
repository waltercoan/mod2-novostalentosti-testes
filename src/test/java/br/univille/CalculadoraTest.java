package br.univille;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CalculadoraTest {
    private Calculadora calc;
    
    //@beforeeach - executa antes de cada teste
    @BeforeEach
    public void paraCada(){
        calc = new Calculadora();
    }
    //Annotation
    @DisplayName("Testa soma do valor dois com dois")
    @Test
    public void testaSomaDoiseDois(){
        assertEquals(4, calc.soma(2, 2));
    }
    @DisplayName("Testa soma do valor dois com cinco")
    @Test
    public void testaSomaDoiseCinco(){
        assertEquals(7, calc.soma(2, 5));
    }
    @Test
    public void testaSubtracaoDoiseDois(){
        assertEquals(0, calc.subtracao(2,2));
    }

    @Test
    public void testaDivisaoDezeCinco(){
        assertEquals(2, calc.divisao(10, 5));
    }

    @Test
    public void testaDivisaoDezeZero(){
        try{
            calc.divisao(10, 0);
            fail("Deveria ocorrer ArithmeticException");
        }catch (ArithmeticException e){
            assertTrue(true);
        }
        
    }
    @Test
    public void testaDivisaoDezeZerov2(){
        assertThrows(ArithmeticException.class,
            () -> calc.divisao(10, 0));
    }
    @Test
    public void testaDivisaoDezeZerov3(){
        assertEquals(true, Float.isInfinite(calc.divisao(3f, 0f)));
    }



    /*@Test
    public void testaDivisaoCincoeZero(){
        try {
            calc.divisao(5, 0);
            fail("Deveria executar ArithmeticException");
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
        assertThrows(ArithmeticException.class,
            () -> calc.divisao(5, 0));
    }*/
}
