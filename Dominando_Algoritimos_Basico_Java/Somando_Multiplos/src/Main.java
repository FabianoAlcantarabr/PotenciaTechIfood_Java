/*Desafio
Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.

Entrada
A entrada deverá ser composta pelo valor A na primeira linha, seguido do valor N na segunda. 

Saída
A saída deverá retornar o valor da soma de todos os múltiplos A até o seu limite N.

Exemplo 1

Entrada	Saída
5
20	50
Exemplo 2

Entrada	Saída
3
18	63*/

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, N;

        int soma = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o Valor de A: ");
        A = input.nextInt();

        System.out.println("Digite o Valor de N: ");
        N = input.nextInt();

        for (int x = 1; x <= N; x++) {
            if (x % A == 0) {
                soma += x;
            }
        }
        System.out.println(soma);

        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
    }
}
