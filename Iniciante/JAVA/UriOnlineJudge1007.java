package br.com.urionlinejudge;
import java.util.Scanner;

/*
Leia quatro valores inteiros A, B, C e D.
A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D
segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo,
com um espaço em branco antes e depois da igualdade.

Exemplos de Entrada
5
6
7
8
Exemplos de Saída
DIFERENCA = -26
 */
public class UriOnlineJudge1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int DIFERENCA = (A * B - C * D);
        System.out.println("DIFERENCA = "+ DIFERENCA);
        sc.close();
    }
}
