package br.com.urionlinejudge;

import java.util.Scanner;

/*
beecrowd | 1133
Resto da Divisão
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Escreva um programa que leia 2 valores X e Y e que imprima todos os valores entre eles cujo resto da divisão dele por 5 for igual a 2 ou igual a 3.

Entrada
O arquivo de entrada contém 2 valores positivos inteiros quaisquer, não necessariamente em ordem crescente.

Saída
Imprima todos os valores conforme exemplo abaixo, sempre em ordem crescente.

Sample Input
10
18
Sample Output
12
13
17

 */
public class UriOnlineJudge1133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0, y = 0;
        x = sc.nextInt();
        y = sc.nextInt();
        int jokePosition = x;

        x = (x > y) ? y : x;
        y = (x != jokePosition) ? jokePosition : y;

        for (int i = x; i < y; i++) {
            if (i != x && i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }
        }
    }
}