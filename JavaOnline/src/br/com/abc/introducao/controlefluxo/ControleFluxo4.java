package br.com.abc.introducao.controlefluxo;

public class ControleFluxo4 {
    public static void main(String[] args) {
        boolean condition = true;
        int idade = 1;
        while (condition) {
            if (idade == 18) {
                System.out.println(idade);
                condition = false;
            } else {
                System.out.println(idade);
                idade++;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
