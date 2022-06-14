package br.univille;

public class Avaliacao {
    private String descricao;
    private float nota;

    public Avaliacao(String descricao, 
            float nota) {
        this.descricao = descricao;
        this.nota = nota;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public float getNota(){
        return this.nota;
    }
}
