package br.com.urionlinejudge;

import java.util.Scanner;
import java.util.Locale;
/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a
 quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes
ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago,
com 2 casas após o ponto decimal.

Exemplo de Entrada
3 2
Exemplo de Saída
Total: R$ 10.00

 */
public class UriOnlineJudge1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double total =0;

        if(codigo==1){
            total = quantidade * 4;
        }
        else if(codigo==2){
            total = quantidade * 4.50;
        }
        else if(codigo==3){
            total = quantidade * 5;
        }
        else if(codigo==4){
            total = quantidade * 2;
        }
        else if(codigo==5){
            total = quantidade * 1.50;
        }
        System.out.printf("Total: R$ %.2f\n",total);
        sc.close();
    }
}
