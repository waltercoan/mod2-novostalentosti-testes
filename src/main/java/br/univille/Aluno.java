package br.univille;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private float percFrequencia;
    private ArrayList<Avaliacao> listaNotas = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public ArrayList<Avaliacao> getListaNotas() {
        return listaNotas;
    }
    public void setListaNotas(ArrayList<Avaliacao> listaNotas) {
        this.listaNotas = listaNotas;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPercFrequencia() {
        return percFrequencia;
    }
    public void setPercFrequencia(float percFrequencia) {
        this.percFrequencia = percFrequencia;
    }
    private float calcMedia(){
        float soma = 0;
        float media = 0;

        for(var umaAvaliacao : listaNotas){
            soma += umaAvaliacao.getNota();
        }
        /*
        for(int i=0; i< listaNotas.getSize();i++){
            var umaAvaliacao = listaNotas.get(i);
            soma = soma + umaAvaliacao.getNota();
        }
        */
        media = soma / listaNotas.size();

        return media;
    }

    public boolean estaEmExame(){
        var media = calcMedia();
        if (percFrequencia >= 75 && (media > 3 && media < 7)){
            return true;
        }
        return false;
    }
    public boolean estaAprovado(){
        var media = calcMedia();
        if (percFrequencia >= 75 && (media >= 7)){
            return true;
        }
        return false;
    }
    public boolean estaReprovado(){
        var media = calcMedia();
        if (percFrequencia < 75 || media <= 3){
            return true;
        }
        return false;
    }
}
