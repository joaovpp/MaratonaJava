package br.com.abc.introducao.arrays;

public class Arrays1 {
    public static void main(String[] args) {
        // Normal loop
        String[] nomes = new String[4];
        nomes[0] = "Joao";
        nomes[1] = "Ze";
        nomes[2] = "Talita";
        nomes[3] = "Alan";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        // Enhanced for loop
        int[] idades = new int[3];
        idades[0] = 20;
        idades[1] = 15;
        idades[2] = 30;
        for (int idade : idades) {
            System.out.println(idade);
        }
    }
}
