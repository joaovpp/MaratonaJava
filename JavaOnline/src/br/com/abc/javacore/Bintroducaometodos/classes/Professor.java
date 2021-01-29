package br.com.abc.javacore.Bintroducaometodos.classes;

public class Professor {
    public String nome;
    public String rg;
    public String cpf;
    public String matricula;

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("RG: " + this.rg);
        System.out.println("CPF: " + this.cpf);
    }
}
