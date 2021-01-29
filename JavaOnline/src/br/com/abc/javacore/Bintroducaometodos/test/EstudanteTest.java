package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();
        aluno.setNome("João");
        aluno.setIdade(-1);
        aluno.setNotas(new double[]{8,2,5});
        aluno.print();
        aluno.tirarMedia();
        System.out.println("Aprovado? " + aluno.isAprovado());

    }
}
