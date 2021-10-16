package br.com.urionlinejudge;
import java.util.Scanner;

/*
URI Online Judge | 1066
Pares, Ímpares, Positivos e Negativos
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares,
quantos valores digitados foram ímpares,
quantos valores digitados foram positivos e quantos valores digitados foram negativos.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha,
 não esquecendo o final de linha após cada uma.

Exemplo de Entrada
-5
0
-3
-4
12
Exemplo de Saída
3 valor(es) par(es)
2 valor(es) impar(es)
1 valor(es) positivo(s)
3 valor(es) negativo(s)
 */
public class UriOnlineJudge1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        for (int i = 0; i < 5; i++) {
            int numeros = sc.nextInt();

            if (numeros % 2 == 0) {
                pares++;
                if (numeros < 0) {
                    negativo++;
                } else if (numeros > 0) {
                    positivo++;
                }
            } else {
                impar++;
                if (numeros < 0) {
                    negativo++;
                } else if (numeros > 0) {
                    positivo++;
                }
            }
        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");

        sc.close();
    }
}