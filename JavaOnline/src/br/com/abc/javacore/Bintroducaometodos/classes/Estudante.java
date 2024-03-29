package br.com.abc.javacore.Bintroducaometodos.classes;

public class Estudante {
    // qndo private, só sera visivel para dentro da classe estudante
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.notas != null) {
            for (double nota : this.notas) {
                System.out.print(nota + " ");
            }
        }
    }

    public void tirarMedia() {
        if (this.notas == null) {
            System.out.println("Esse aluno não possui notas.");
        } else {
            double media = 0;
            for (double nota : this.notas) {
                media += nota;
            }
            media = media / this.notas.length;
            if (media >= 6) {
                this.aprovado = true;
                System.out.println("\nA media é: " + media + ". Situação: aprovado.");
            } else {
                this.aprovado = false;
                System.out.println("\nA media é: " + media + ". Situação: Reprovado.");
            }
        }
    }
    // getters and setters - encapsulam nossos atributos
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        if(idade < 0) {
            System.out.println("Voce não pode fazer isso");
        } else {
            this.idade = idade;
        }
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public double[] getNotas(){
        return this.notas;
    }
    // para valores booleanos utilizar o método 'is'
    public boolean isAprovado(){
        return this.aprovado;
    }
}