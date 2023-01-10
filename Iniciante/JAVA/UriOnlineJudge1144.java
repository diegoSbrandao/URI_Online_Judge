package br.com.urionlinejudge;

import java.util.Scanner;

/*
beecrowd | 1144
Sequência Lógica
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Escreva um programa que leia um valor inteiro N. N * 2 linhas de saída serão apresentadas na execução do programa, seguindo a lógica do exemplo abaixo. Para valores com mais de 6 dígitos, todos os dígitos devem ser apresentados.

Entrada
O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).

Saída
Imprima a saída conforme o exemplo fornecido.

Exemplo de Entrada
5

Exemplo de Saída
1 1 1
1 2 2
2 4 8
2 5 9
3 9 27
3 10 28
4 16 64
4 17 65
5 25 125
5 26 126

 */
public class UriOnlineJudge1144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        n = sc.nextInt();
        float a = 1;

        for (int i = 1; i <= n; i++) {
            System.out.printf("%.0f %.0f %.0f\n", a, (Math.pow(a, 2)), Math.pow(a, 3));
            System.out.printf("%.0f %.0f %.0f\n", a, (Math.pow(a, 2) + 1), (Math.pow(a, 3) + 1));
            a++;

        }
    }
}











