package br.com.urionlinejudge;
import java.util.Scanner;

/*
URI Online Judge | 1075
Resto 2
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão resto igual a 2.

Entrada
A entrada contém um valor inteiro N (N < 10000).

Saída
Imprima todos valores que quando divididos por N dão resto = 2, um por linha.

Exemplo de Entrada
13
Exemplo de Saída
2
15
28
41
...
 */

public class UriOnlineJudge1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i < 10000; i++) {

            if (i % N == 2) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}

