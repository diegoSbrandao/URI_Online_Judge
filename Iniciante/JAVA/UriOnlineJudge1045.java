package br.com.urionlinejudge;
import java.util.Scanner;

/*
Tipos de Triângulos
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:
se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
Entrada
A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na entrada.

Exemplos de Entrada
7.0 5.0 7.0
Exemplos de Saída
TRIANGULO ACUTANGULO
TRIANGULO ISOSCELES

Exemplos de Entrada
6.0 6.0 10.0
Exemplos de Saída
TRIANGULO OBTUSANGULO
TRIANGULO ISOSCELES

Exemplos de Entrada
6.0 6.0 6.0
Exemplos de Saída
TRIANGULO ACUTANGULO
TRIANGULO EQUILATERO

Exemplos de Entrada
5.0 7.0 2.0
Exemplos de Saída
NAO FORMA TRIANGULO

Exemplos de Entrada
6.0 8.0 10.0
NAO FORMA TRIANGULO
TRIANGULO RETANGULO
 */

public class UriOnlineJudge1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double aux;
        double[] vet = new double[3];

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        vet[0] = A;
        vet[1] = B;
        vet[2] = C;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(vet[i] < vet[j]){
                    aux = vet[j];
                    vet[j] = vet[i];
                    vet[i] = aux;
                }
            }
        }

        A = vet[2];
        B = vet[1];
        C = vet[0];


        if (A >= (B + C)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (A*A == (B*B) + (C*C)) System.out.println("TRIANGULO RETANGULO");
            if (A*A > (B*B) + (C*C)) System.out.println("TRIANGULO OBTUSANGULO");
            if (A*A < (B*B) + (C*C)) System.out.println("TRIANGULO ACUTANGULO");
            if (A == B && A == C) System.out.println("TRIANGULO EQUILATERO");
            if ((A == B && A != C) || (A == C && A != B) || (B == C && B != A)) System.out.println("TRIANGULO ISOSCELES");
        }

        sc.close();
    }
}
