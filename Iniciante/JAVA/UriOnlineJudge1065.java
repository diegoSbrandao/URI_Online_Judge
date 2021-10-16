package br.com.urionlinejudge;
import java.util.Scanner;

/*
URI Online Judge | 1065
Pares entre Cinco Números
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Faça um programa que leia 5 valores inteiros.
Conte quantos destes valores digitados são pares e mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.

Exemplo de Entrada
7
-5
6
-4
12
Exemplo de Saída
3 valores pares
 */
public class UriOnlineJudge1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0;

        for(int i =0; i < 5; i++){
            double numeros = sc.nextDouble();

            if(numeros%2== 0){
                pares++;
            }
        }

        System.out.println(pares+" valores pares");

        sc.close();
    }
}