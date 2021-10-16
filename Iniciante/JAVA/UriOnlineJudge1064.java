package br.com.urionlinejudge;
import java.util.Scanner;

/*
URI Online Judge | 1064
Positivos e Média
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos.
Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados,
 com um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante.
Pelo menos um destes números será positivo.

Saída
O primeiro valor de saída é a quantidade de valores positivos.
A próxima linha deve mostrar a média dos valores positivos digitados.

Exemplo de Entrada
7
-5
6
-3.4
4.6
12
Exemplo de Saída
4 valores positivos
7.4
 */
public class UriOnlineJudge1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos = 0;
        double somaPositivos = 0;

        for (int i = 0; i < 6; i++) {
            double numeros = sc.nextDouble();

            if (numeros > 0) {
                positivos++;
                somaPositivos += numeros;

            }
        }
        double media = somaPositivos / positivos;

        System.out.println(positivos + " valores positivos");
        System.out.printf("%.1f\n", media);

        sc.close();
    }
}
