package br.com.abc.javacore.Fmodificadorestatico.classes;

public class Carro {
    //  Velocidade limite deve ser de 240km/h
    private String nome;
    private double velocidadeMaxima;
    // static significa que o atributo é o msm pra classe toda
    // e não especifico a um objeto
    public static double velocidadeLimite;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
    }

    public void imprime() {
        System.out.println("------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("VelocidadeMaxima: " + this.velocidadeMaxima);
        System.out.println("VelocidadeLimite: " + velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}