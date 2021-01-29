package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        int x = 5;
        int y = 20;
        int z = 1;
        Calculadora calc = new Calculadora ();
        calc.somaDoisNumeros(x, y);
        calc.subtraiDoisNumeros(y, x);
        System.out.println(calc.multiplicaDoisNumeros(x,y));
        System.out.println(calc.divideDoisNumeros(x, z));

        int [] numeros = {1,2,3,4,5,6};
        calc.somaArrays(numeros);
        calc.somaVarArgs(1,2,3,4,5);
    }
}
