package br.univille;

public class Boleto {
    private float valor;
    private int diaDoVencimento;
    private float percDesconto;
    private float percMulta; 

    public Boleto(float valor, int diaDoVencimento, 
            float percDesconto, float percMulta) {
        if (valor >= 0){
            this.valor = valor;
        }
        this.diaDoVencimento = diaDoVencimento;
        this.percDesconto = percDesconto;
        this.percMulta = percMulta;
    }
    public float getValor() {
        return valor;
    }
    public int getDiaDoVencimento() {
        return diaDoVencimento;
    }
    public float getPercDesconto() {
        return percDesconto;
    }
    public float getPercMulta() {
        return percMulta;
    }

    public float pagar(int diaDoPagamento){
        float valorAPagar = 0;
        if(diaDoPagamento > diaDoVencimento){
            valorAPagar = this.valor + (this.valor * this.percMulta / 100f);
        }else{
            valorAPagar = this.valor - (this.valor * this.percDesconto / 100f);
        }
        return valorAPagar;
    }

}
