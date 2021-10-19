package br.com.urionlinejudge;
import java.util.Scanner;

/*
URI Online Judge | 1096
Sequencia IJ 2
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo

Exemplo de Entrada	Exemplo de Saída
I=1 J=7
I=1 J=6
I=1 J=5
I=3 J=7
I=3 J=6
I=3 J=5
...
I=9 J=7
I=9 J=6
I=9 J=5
 */
public class UriOnlineJudge1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1, j=7, contador = 0;

        while (contador < 15) {

            System.out.println("I=" + i + " J=" + j);
            j = j - 1;

            if(j<5){
                i = i + 2;
                j = 7;
            }
            contador++;
        }
        sc.close();
    }
}













