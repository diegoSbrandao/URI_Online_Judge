package br.com.urionlinejudge;

import java.util.Scanner;

/*
URI Online Judge | 1079
Médias Ponderadas
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2,
o segundo valor tem peso 3 e o terceiro valor tem peso 5.

Entrada
O arquivo de entrada contém um valor inteiro N na primeira linha.
Cada N linha a seguir contém um caso de teste com três valores com uma casa decimal cada valor.

Saída
Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo.

Exemplo de Entrada
3
6.5 4.3 6.2
5.1 4.2 8.1
8.0 9.0 10.0
Exemplo de Saída
5.7
6.3
9.3
 */

public class UriOnlineJudge1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double x,y,z,media;

        while (N > 0){

            x = sc.nextDouble();
            y = sc.nextDouble();
            z = sc.nextDouble();

            media = (x * 2 + y * 3 + z * 5) / 10;
            System.out.printf("%.1f\n",media);
            N = N - 1;
        }

        sc.close();
    }
}
