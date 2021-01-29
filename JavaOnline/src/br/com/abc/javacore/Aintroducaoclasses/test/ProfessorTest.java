package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "Jose";
        prof.matricula = "123456";
        prof.rg = "300.400.500-x";
        prof.cpf = "900.945.234-98";

        Professor prof2 = new Professor();
        prof2.nome = "Jurandir";
        prof2.matricula = "1212";
        prof2.rg = "300.400.666-x";
        prof2.cpf = "222.111.234-50";

        prof = prof2;

        prof2.nome = "Carol";

        System.out.println(prof.nome);
        System.out.println(prof.matricula);
        System.out.println(prof.rg);
        System.out.println(prof.cpf);

        System.out.println("---------");

        System.out.println(prof2.nome);
        System.out.println(prof2.matricula);
        System.out.println(prof2.rg);
        System.out.println(prof2.cpf);

    }
}
