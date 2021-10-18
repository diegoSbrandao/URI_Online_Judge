package br.com.urionlinejudge;
import java.util.Locale;
import java.util.Scanner;

/*
URI Online Judge | 1074
Par ou Ímpar
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida.
Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN),
ímpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0),
embora a descrição correta seja (EVEN NULL), pois por definição zero é par,
seu programa deverá imprimir apenas NULL.

Entrada
A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos de teste.
 Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).

Saída
Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo.
Todas as letras deverão ser maiúsculas e sempre deverá
haver um espaço entre duas palavras impressas na mesma linha.

Exemplo de Entrada
4
-5
0
3
-4
Exemplo de Saída
ODD NEGATIVE
NULL
ODD POSITIVE
EVEN NEGATIVE
 */

public class UriOnlineJudge1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] vetor = new String[N];

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();

            if (X % 2 == 0) {
                if (X > 0) {
                    vetor[i] = "EVEN POSITIVE";

                } else {
                    vetor[i] = "EVEN NEGATIVE";

                }
            }

            if (X % 2 != 0) {
                if (X > 0) {
                    vetor[i] = "ODD POSITIVE";
                } else {
                    vetor[i] = "ODD NEGATIVE";
                }
            }

            if (X == 0) {
                vetor[i] = "NULL";
            }
        }

        for (String answer : vetor) {
            System.out.println(answer);
        }
        sc.close();
    }
}