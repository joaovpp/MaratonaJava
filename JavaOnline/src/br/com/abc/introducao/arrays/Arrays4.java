package br.com.abc.introducao.arrays;

public class Arrays4 {
    public static void main(String[] args) {
        // creating multideminsional arrays of different lengths
        // First option
//        int [][] dias = new int [3][];
//        dias[0] = new int[2];
//        dias[1] = new int[3];
//        dias[2] = new int[4];

        // Second option
        int [][] dias = {{1,2}, {3,4,5}, {6,7,8,9}};

        for (int[] ref : dias) {
            for (int dia : ref) {
                System.out.println(dia);
            }
        }
    }
}
