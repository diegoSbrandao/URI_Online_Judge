package br.com.urionlinejudge;

import java.util.Scanner;

/*
beecrowd | 1145
Sequência Lógica 2
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Escreva um programa que leia dois valores X e Y. A seguir, mostre uma sequência de 1 até Y, passando para a próxima linha a cada X números.

Entrada
O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e (X < Y < 100000).

Saída
Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em branco entre cada número, conforme exemplo abaixo. Não deve haver espaço em branco após o último valor da linha.

Exemplo de Entrada
3 99


Exemplo de Saída
1 2 3
4 5 6
7 8 9
10 11 12
...
97 98 99

 */
public class UriOnlineJudge1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0;
        int number = 1;

        x = sc.nextInt();
        y = sc.nextInt();
        int contador = 1;

        while (contador < y) {

            for (int j = 0; j < x - 1; j++) {
                System.out.print(number + " ");
                number++;
                contador++;
            }
            System.out.println(number);
            number++;
            contador++;
        }
    }
}

