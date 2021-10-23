package br.com.urionlinejudge;

import java.util.Scanner;

/*
URI Online Judge | 1116
Dividindo X por Y
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 2
Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo.
 Caso não for possível mostre a mensagem “divisao impossivel” para os valores em questão.

Entrada
A entrada contém um número inteiro N. Este N será a quantidade de pares de valores inteiros (X e Y)
 que serão lidos em seguida.

Saída
Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal,
 ou “divisao impossivel” caso não seja possível efetuar o cálculo.

Obs.: Cuide que a divisão entre dois inteiros em algumas linguagens como o C e C++ gera outro inteiro. Utilize cast :)

Exemplo de Entrada	Exemplo de Saída
3
3 -2
-8 0
0 8

-1.5
divisao impossivel
0.0
 */
public class UriOnlineJudge1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float x, y;

        for (int i = 0; i < n; i++) {
            x = sc.nextFloat();
            y = sc.nextFloat();

            System.out.println((y==0) ? "divisao impossivel" : x/y);
        }
        sc.close();
    }
}
