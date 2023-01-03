package br.com.urionlinejudge;

import java.util.Scanner;

/*
beecrowd | 1132
Múltiplos de 13
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números que não são múltiplos de 13 entre X e Y, incluindo ambos.

Entrada
O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente em ordem crescente.

Saída
Imprima a soma de todos os valores não divisíveis por 13 entre os dois valores lidos na entrada, inclusive ambos se for o caso.

Sample Input
100
200
Sample Output
13954

 */
public class UriOnlineJudge1132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0, y = 0, sum = 0;
        x = sc.nextInt();
        y = sc.nextInt();
        int jokePosition = x;

        x = (x > y) ? y : x;
        y = (x != jokePosition) ? jokePosition : y;

        for (int i = x; i <= y; i++) {
            sum += (i % 13 != 0) ? i : 0;
        }

        System.out.println(sum);

    }
}
