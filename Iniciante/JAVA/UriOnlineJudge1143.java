package br.com.urionlinejudge;

import java.util.Scanner;

/*
beecrowd | 1143
Quadrado e ao Cubo
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Escreva um programa que leia um valor inteiro N (1 < N < 1000). Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido.

Exemplo de Entrada
5

Exemplo de Saída
1 1 1
2 4 8
3 9 27
4 16 64
5 25 125
 */
public class UriOnlineJudge1143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        n = sc.nextInt();
        float a = 1;

        for (int i = 1; i <= n; i++) {
            System.out.printf("%.0f %.0f %.0f\n", a, (Math.pow(a, 2)), Math.pow(a, 3));
            a += 1;
        }
    }
}