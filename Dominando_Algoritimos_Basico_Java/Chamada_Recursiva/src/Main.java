/*Descrição
Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0.   

Entrada
A Entrada será composta por um número inteiro, N. 

Saída
Será  impresso o somatório de N até 0, como no exemplo a baixo: 

EXEMPLO DE ENTRADA

EXEMPLO DE SAÍDA

10	55
4	10
15 */


import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        int X;

        System.out.println("Digite um valor para X: ");
        X = numero.nextInt();

        System.out.println(somatorio(X));

        //TODO: Imprima o somatório de N (utilize o método "somatorio").
    }

    /**
     * Método útil que calcula o somatório de um número usando recursividade.
     */
    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}
