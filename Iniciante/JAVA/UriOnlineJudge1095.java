package br.com.urionlinejudge;
import java.util.Scanner;

/*
URI Online Judge | 1095
Sequencia IJ 1
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo

Exemplo de Entrada	Exemplo de Saída
I=1 J=60
I=4 J=55
I=7 J=50
...
I=? J=0
 */
public class UriOnlineJudge1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1,j=60;

        while (j>=0){
            System.out.println("I="+i+" J="+j);
            i+=3;
            j-=5;
        }
            sc.close();
    }
}
