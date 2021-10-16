package br.com.urionlinejudge;
import java.util.Scanner;

/*
URI Online Judge | 1060
Números Positivos
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Faça um programa que leia 6 valores.
Estes valores serão somente negativos ou positivos (desconsidere os valores nulos).
 A seguir, mostre a quantidade de valores positivos digitados.

Entrada
Seis valores, negativos e/ou positivos.

Saída
Imprima uma mensagem dizendo quantos valores positivos foram lidos.

Exemplo de Entrada
7
-5
6
-3.4
4.6
12
Exemplo de Saída
4 valores positivos
 */
public class UriOnlineJudge1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos = 0;

        for(int i =0; i < 6; i++){
            double numeros = sc.nextDouble();

            if(numeros > 0){
               positivos++;
            }
        }

        System.out.println(positivos+" valores positivos");

        sc.close();
    }
}
