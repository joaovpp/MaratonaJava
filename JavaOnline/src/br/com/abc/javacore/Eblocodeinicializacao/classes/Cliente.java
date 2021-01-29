package br.com.abc.javacore.Eblocodeinicializacao.classes;
/*
Ordem de execução da classe:
1- Alocado espaço na memoria para o objeto que será criado
2- Cada atributo é criado e inicializado
3- Bloco de inicilização é executado
4- O construtor é executado
 */
public class Cliente {
    private int[] parcelas;

    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização");
        for (int i = 1; i <= 100; i++){
            parcelas[i-1] = i;
        }
    }

    public Cliente() {
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
