package br.com.urionlinejudge;

import java.util.Scanner;

/*
URI Online Judge | 1099
Soma de Ímpares Consecutivos II
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir.
 Cada caso de teste consiste de dois inteiros X e Y.
 Você deve apresentar a soma de todos os ímpares existentes entre X e Y.

Entrada
A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir.
Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

Saída
Imprima a soma de todos valores ímpares entre X e Y.

Exemplo de Entrada
7

4 5

13 10

6 4

3 3

3 5

3 4

3 8

Exemplo de Saída
0

11

5

0

0

0

12
 */
public class UriOnlineJudge1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=0, y=0;

        for (int i = 0; i < n; i++) {
            int aux = 0;
            x = sc.nextInt();
            y = sc.nextInt();

            if (x > y) {
                aux = y;
                y = x;
                x = aux;
            }
            somaImpar(x, y);
        }
        sc.close();
    }

    public static void somaImpar(int x, int y) {
        x = x+1;
        int soma = 0;
        for (int i = x; i < y; i++) {
            if (i % 2 != 0) {
                soma+=i;
            }
        }
        System.out.println(soma);
    }
}





