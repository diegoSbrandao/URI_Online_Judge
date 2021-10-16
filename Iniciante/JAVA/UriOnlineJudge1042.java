package br.com.urionlinejudge;

import java.util.Scanner;
/*
Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado.

Exemplo de Entrada
7 21 -14

Exemplo de Saída
-14
7
21

7
21
-14

Exemplo de Entrada
-14 21 7

Exemplo de Saída
-14
7
21

-14
21
7
 */

public class UriOnlineJudge1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux;
        int[] vet = new int[3];

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        vet[0] = a;
        vet[1] = b;
        vet[2] = c;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(vet[i] < vet[j]){
                    aux = vet[j];
                    vet[j] = vet[i];
                    vet[i] = aux;
                }
            }
        }

        System.out.println(vet[0]);
        System.out.println(vet[1]);
        System.out.println(vet[2]);
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        sc.close();
    }
}

