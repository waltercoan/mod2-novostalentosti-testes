package br.univille;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BoletoTest {
    
    @Test
    public void testaBoletoDezEmDia(){
        float valorBoleto = 10;
        int diaVenc = 15;
        float percDesc = 0;
        float percMulta = 2;
        Boleto boleto = new Boleto(valorBoleto,diaVenc,percDesc,percMulta);
        assertEquals(10f, boleto.pagar(diaVenc));
    }
    @Test
    public void testaBoletoDezComDescEmDia(){
        float valorBoleto = 10;
        int diaVenc = 15;
        float percDesc = 10;
        float percMulta = 2;
        Boleto boleto = new Boleto(valorBoleto,diaVenc,percDesc,percMulta);
        assertEquals(9f, boleto.pagar(diaVenc));
    }
    @Test
    public void testaBoletoDezComMultaAtrasado(){
        float valorBoleto = 10;
        int diaVenc = 15;
        float percDesc = 10;
        float percMulta = 2;
        Boleto boleto = new Boleto(valorBoleto,diaVenc,percDesc,percMulta);
        assertEquals(10.2f, boleto.pagar(diaVenc+1));
    }
    @Test
    public void testaBoletoValorNegativo(){
        float valorBoleto = -10;
        int diaVenc = 15;
        float percDesc = 10;
        float percMulta = 2;
        Boleto boleto = new Boleto(valorBoleto,diaVenc,percDesc,percMulta);
        assertEquals(0, boleto.pagar(diaVenc+1));
    }
}
