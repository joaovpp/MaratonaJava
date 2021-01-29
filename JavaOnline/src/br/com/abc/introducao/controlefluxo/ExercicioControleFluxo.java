package br.com.abc.introducao.controlefluxo;

import java.util.Scanner;

public class ExercicioControleFluxo {
    public static void main(String[] args) {
        /*
        Crie uma variavel e imprima seu imposto
        imposto:
        salario < 1000 = 5%
        salario >= 1000 && salario < 2000 = 10%
        salario >= 2000 && salario < 4000 = 15%
        salario >= 5000 = 20%
         */
        // Pergunta ao usuario seu salario
        System.out.println("Informe seu salario: ");
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        double totalImposto;
        // avalia o imposto com base na resposta
        if (salario < 1000) {
            totalImposto = salario * 0.05;
        } else if (salario >= 1000 && salario < 2000) {
            totalImposto = salario * 0.1;
        } else if (salario >= 2000 && salario < 4000) {
            totalImposto = salario * 0.15;
        } else {
            totalImposto = salario * 0.2;
        }
        System.out.println("Total imposto devido: R$" + totalImposto);
    }
}
