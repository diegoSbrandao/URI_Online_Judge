package br.com.urionlinejudge;

import java.util.Scanner;

/*
Leia 2 valores com uma casa decimal (x e y),
que devem representar as coordenadas de um ponto em um plano.
A seguir, determine qual o quadrante ao qual pertence o ponto,
ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).

Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

Entrada
A entrada contem as coordenadas de um ponto.

Saída
A saída deve apresentar o quadrante em que o ponto se encontra.

Exemplo de Entrada
4.5 -2.2
Exemplo de Saída
Q4

Exemplo de Entrada
0.1 0.1
Exemplo de Saída
Q1
Exemplo de Entrada
0.0 0.0
Exemplo de Saída
Origem
 */
public class UriOnlineJudge1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        double Y = sc.nextDouble();

        if (X > 0.0 && Y < 0.0) {
            System.out.println("Q4");

        } else if (X > 0.0 && Y > 0.0) {
            System.out.println("Q1");

        } else if (X < 0.0 && Y < 0.0) {
            System.out.println("Q3");

        }else if (X < 0.0 && Y > 0.0) {
            System.out.println("Q2");
        }
        else if (X < 0.0 || X > 0.0 && Y == 0.0) {
            System.out.println("Eixo X");
        }
        else if (Y < 0.0 || Y > 0.0 && X == 0.0) {
            System.out.println("Eixo Y");
        }

        else{
            System.out.println("Origem");
        }

        sc.close();
    }
}


















