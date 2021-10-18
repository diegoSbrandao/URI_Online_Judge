package br.com.urionlinejudge;

import java.util.Scanner;

/*
URI Online Judge | 1080
Maior e Posição
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

Entrada
O arquivo de entrada contém 100 números inteiros, positivos e distintos.

Saída
Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.

Exemplo de Entrada
2
113
45
34565
6
...
8

Exemplo de Saída
34565
4
 */

public class UriOnlineJudge1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,maior = 0, posicao = 0;
        for(int i = 1; i < 100; i ++){
            n = sc.nextInt();

            if(n > maior){
                maior = n;
                posicao = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
        sc.close();
    }
}
