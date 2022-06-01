package br.univille;

public class PlanejadorDeChurrasco {
    private int adulto;
    private int crianca;

    public void setAdulto(int adulto){
        this.adulto = adulto;
    }
    public void setCrianca(int crianca){
        this.crianca = crianca;
    }

    public float calculaQtdCarne(){
        float total = 0;
        total = total + (adulto * 250f);
        total = total + (crianca * 100f);
        return total;
    }
}
