package br.com.abc.introducao.controlefluxo;

public class ControleFluxo3 {
    public static void main(String[] args) {
        byte dia = 5;
        // char, int, byte, short, enum e String
        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terca");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("Não é um dia valido!");
                break;
        }
        switch (dia) {
            case 1: case 7:
                System.out.println("Final de semana");
                break;
            case 2: case 3: case 4: case 5: case 6:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Não é um dia valido!");
        }
    }
}
