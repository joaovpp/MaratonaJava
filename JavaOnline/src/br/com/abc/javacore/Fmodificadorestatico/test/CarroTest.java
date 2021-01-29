package br.com.abc.javacore.Fmodificadorestatico.test;

import br.com.abc.javacore.Fmodificadorestatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Audi", 275);
        Carro c3 = new Carro("Mercedez", 290);

        c1.imprime();
        c2.imprime();
        c3.imprime();
        System.out.println("#########################");

        Carro.setVelocidadeLimite(280);
        Carro.velocidadeLimite = 220;
        Carro.setVelocidadeLimite(250);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
