package br.com.abc.javacore.Fmodificadorestatico.test;


import br.com.abc.javacore.Fmodificadorestatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        System.out.println("Exibindo qntde de parcelas possiveis");
        for (int parcela : Cliente.getParcelas()) {
            System.out.println(parcela);
        }
    }
}
