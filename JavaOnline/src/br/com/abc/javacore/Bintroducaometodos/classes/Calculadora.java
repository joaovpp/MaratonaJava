package br.com.abc.javacore.Bintroducaometodos.classes;

public class Calculadora {

    // void quer dizer q a funcao não retorna nada
    public void somaDoisNumeros(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    public void subtraiDoisNumeros(int num1, int num2) {
        System.out.println(num1 - num2);
    }
    // int retirna um inteiro
    public int multiplicaDoisNumeros(int num1, int num2) {
        return num1 * num2;
    }
    // retorna um double
    public double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }
    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 30;
        num2 = 40;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);
    }
    public void somaArrays(int [] numeros) {
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
    // Um parametro varargs aceita um array, 0 ou muitos parametros
    // deve ser o ultimo parametro do método
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
