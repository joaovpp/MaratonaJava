package br.com.abc.introducao.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        // Multidimensional array
        int [][] dias = new int [2][2];
        dias[0][0] = 30;
        dias[0][1] = 31;
        dias[1][0] = 29;
        dias[1][1] = 28;

        // traditional loop
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.print(dias[i][j] + " ");
            }
        }

        // for new line
        System.out.println();

        // enhanced for loop on multidimensional array
        for (int [] ref : dias) {
            for (int dia : ref) {
                System.out.print(dia + " ");
            }
        }
    }
}
