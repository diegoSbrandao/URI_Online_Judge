package br.com.urionlinejudge;

import java.util.Scanner;

/*
URI Online Judge | 1115
Quadrante
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de
pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence.
O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA
 (nesta situação sem escrever mensagem alguma).

Entrada
A entrada contém vários casos de teste. Cada caso de teste contém 2 valores inteiros.

Saída
Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida,
conforme o exemplo.

Exemplo de Entrada
2 2
3 -2
-8 -1
-7 1
0 2
Exemplo de Saída
primeiro
quarto
terceiro
segundo
 */
public class UriOnlineJudge1115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        double Y = sc.nextDouble();

        while (true) {
            if (X > 0.0 && Y < 0.0) {
                System.out.println("quarto");

            } else if (X > 0.0 && Y > 0.0) {
                System.out.println("primeiro");

            } else if (X < 0.0 && Y < 0.0) {
                System.out.println("terceiro");

            } else if (X < 0.0 && Y > 0.0) {
                System.out.println("segundo");
            }
            X = sc.nextDouble();
            Y = sc.nextDouble();
            if(X==0 || Y==0)break;
        }
        sc.close();
    }
}

