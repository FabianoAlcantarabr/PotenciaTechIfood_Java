/*Desafio
Nesse desafio, dados dois números, verifique se eles são iguais. Caso sejam, retorne "Sao iguais!”. Caso contrário, retorne "Nao sao iguais!” sem as aspas. 

Entrada
As entradas serão dois valores, um em cada linha, representados por A e B, que sempre serão números inteiros. 

Saída
A saída deverá retornar a frase "Sao iguais!" caso A e B sejam o mesmo valor. Caso contrário,  retorne "Nao sao iguais!", sem as aspas.

EXEMPLO DE ENTRADA 

EXEMPLO DE SAÍDA 

1
2

Nao sao iguais! 

50
50

Sao iguais! 

38
90

Nao sao iguais! */

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.*;
import java.util.Scanner;


public class Desafio {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int Num1;
        int Num2;

        //System.out.println("Digite o Primeiro número: ");
        Num1 = scan.nextInt();

        //System.out.println("Digite o Segundo número: ");
        Num2 = scan.nextInt();

        if (Num1 == Num2) {
            System.out.println("Sao iguais");
        }
        else {
            System.out.println("Nao sao iguais");
        }


    }
}
