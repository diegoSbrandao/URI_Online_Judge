package br.com.urionlinejudge;

import java.util.Scanner;

/*
beecrowd | 1142
PUM
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Escreva um programa que leia um valor inteiro N. Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada numberém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido.

Exemplo de Entrada
7

Exemplo de Saída
1 2 3 PUM
5 6 7 PUM
9 10 11 PUM
13 14 15 PUM
17 18 19 PUM
21 22 23 PUM
25 26 27 PUM

 */
public class UriOnlineJudge1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int number = 1;

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println("PUM");
            number++;

        }
    }
}