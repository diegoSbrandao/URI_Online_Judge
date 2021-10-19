package br.com.urionlinejudge;
import java.util.Scanner;

/*
URI Online Judge | 1097
Sequencia IJ 3
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
I=1 J=7
I=1 J=6
I=1 J=5
I=3 J=9
I=3 J=8
I=3 J=7
...
I=9 J=15
I=9 J=14
I=9 J=13
 */
public class UriOnlineJudge1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1, j=7, contador = 0;
        int time = 0;

        while (contador < 15) {
            System.out.println("I=" + i + " J=" + j);
            j = j - 1;
            time = time + 1;

            if (time == 3) {
                j = j + 5;
                i = i + 2;
                time = 0;
            }
            contador++;
        }
        sc.close();
    }
}
