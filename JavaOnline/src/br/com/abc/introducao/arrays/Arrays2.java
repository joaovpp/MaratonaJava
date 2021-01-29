package br.com.abc.introducao.arrays;

public class Arrays2 {
    public static void main(String[] args) {
        // 3 formas de se inicializar um array
        int [] numeros = new int[3];
        int [] numeros2 = {1,2,3,4,5,6};
        int [] numeros3 = new int[] {1,6,8};

        for (int numero: numeros2){
            System.out.println(numero);
        }
    }
}
