package br.univille;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlunoTest {
    
    private Aluno alunoTeste;
    
    @BeforeEach
    public void inicio(){
        alunoTeste = new Aluno();
    }
    @Test
    public void testaAlunoCDF(){
        alunoTeste.setPercFrequencia(99);
        alunoTeste.getListaNotas().add(new Avaliacao("Nota 1", 10f));
        alunoTeste.getListaNotas().add(new Avaliacao("Nota 2", 10f));
        //assertEquals(true, alunoTeste.estaAprovado());
        //assertEquals(false, alunoTeste.estaEmExame());
        //assertEquals(false, alunoTeste.estaReprovado());
        assertAll(
            () -> assertEquals(true, alunoTeste.estaAprovado()),
            () -> assertEquals(false, alunoTeste.estaEmExame()),
            () -> assertEquals(false, alunoTeste.estaReprovado())
        );
    }

    @Test
    public void testaAlunoEsforcado(){
        alunoTeste.setPercFrequencia(85);
        alunoTeste.getListaNotas().add(new Avaliacao("Nota 1", 6f));
        alunoTeste.getListaNotas().add(new Avaliacao("Nota 2", 7f));
        assertAll(
            () -> assertEquals(false, alunoTeste.estaAprovado()),
            () -> assertEquals(true, alunoTeste.estaEmExame()),
            () -> assertEquals(false, alunoTeste.estaReprovado())
        );
    }

    @Test
    public void testaAlunoTurista(){
        alunoTeste.setPercFrequencia(20);
        alunoTeste.getListaNotas().add(new Avaliacao("Nota 1", 2f));
        alunoTeste.getListaNotas().add(new Avaliacao("Nota 2", 2f));
        assertAll(
            () -> assertEquals(false, alunoTeste.estaAprovado()),
            () -> assertEquals(false, alunoTeste.estaEmExame()),
            () -> assertEquals(true, alunoTeste.estaReprovado())
        );
    }

}
