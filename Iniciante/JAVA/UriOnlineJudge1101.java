package br.com.urionlinejudge;
import java.util.Scanner;

/*
URI Online Judge | 1101
Sequência de Números e Soma
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia um conjunto não determinado de pares de valores M e N
(parar quando algum dos valores for menor ou igual a zero).
Para cada par lido, mostre a sequência do menor até o maior
 e a soma dos inteiros consecutivos entre eles (incluindo o N e M).

Entrada
O arquivo de entrada contém um número não determinado de valores M e N.
A última linha de entrada vai conter um número nulo ou negativo.

Saída
Para cada dupla de valores, imprima a sequência do menor até o maior e a soma deles, conforme exemplo abaixo.

Exemplo de Entrada
5 2
6 3
5 0
Exemplo de Saída
2 3 4 5 Sum=14
3 4 5 6 Sum=18
 */

public class UriOnlineJudge1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m=0,n=0,aux;

        do {
            m= sc.nextInt();
            n= sc.nextInt();

            if(m <=0 || n <= 0){
                break;
            }

            if (m > n) {
                aux = n;
                n = m;
                m = aux;
            }

            somaNumero(m,n);

        }while (m >0 || n > 0);

        sc.close();
    }

    public static void somaNumero(int x, int y) {
        int soma = 0;
        String tamanho = "";

        for (int i = x; i <= y; i++) {
                soma+=i;
                tamanho += i+" ";
        }
        System.out.println(tamanho+""+"Sum="+soma);
    }
}













