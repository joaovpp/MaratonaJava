package br.com.abc.introducao.controlefluxo;

public class ExercicioControleFluxo2 {
    public static void main(String[] args) {
        int par = 1;
        System.out.println("Numeros pares <= 100 são: ");
        while (par <= 100) {
            if (par % 2 == 0) {
                System.out.println(par);
                par++;
            } else {
                par++;
            }
        }

        int impar = 1;
        System.out.println("Numeros impares <= 100 são: ");
        while (impar <= 100) {
            if (impar % 2 != 0) {
                System.out.println(impar);
                impar++;
            } else {
                impar++;
            }
        }
    }
}
