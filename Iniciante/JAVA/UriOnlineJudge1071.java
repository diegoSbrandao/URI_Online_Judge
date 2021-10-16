package br.com.urionlinejudge;
import java.util.Scanner;

/*
URI Online Judge | 1071
Soma de Impares Consecutivos I
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.

Entrada
O arquivo de entrada contém dois valores inteiros.

Saída
O programa deve imprimir um valor inteiro.
Este valor é a soma dos valores ímpares que estão entre os valores fornecidos na entrada que
 deverá caber em um inteiro.

Exemplo de Entrada
6
-5
Exemplo de Saída
5

Exemplo de Entrada
15
12
Exemplo de Saída
13

Exemplo de Entrada
12
12
Exemplo de Saída
0
 */

public class UriOnlineJudge1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int soma = 0;

        if(x > y ){
            int aux = y;
            y = x;
            x = aux;
        }

        for(int i = x+1; i < y; i++){
            if(i%2!=0){
                soma+=i;
            }
        }

        System.out.println(soma);
        sc.close();
    }
}














