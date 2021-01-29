package br.com.abc.javacore.Dsobrecargaconstrutores.test;

import br.com.abc.javacore.Dsobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante aluno = new Estudante("1222",
                "Joao", new double[]{5,7,9});
        Estudante est = new Estudante("565656","Jorivaldo",
                new double[]{9,8,7},"18/01/2021");
        aluno.imprime();
        est.imprime();
    }
}
