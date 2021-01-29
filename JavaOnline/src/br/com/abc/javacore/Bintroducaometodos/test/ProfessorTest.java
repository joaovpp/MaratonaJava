package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "123.321.980-45";
        prof.matricula = "1234";
        prof.nome = "Jurandir";
        prof.rg = "30.908.345-x";

        prof.imprime();
    }
}
