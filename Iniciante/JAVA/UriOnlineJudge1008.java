package br.com.urionlinejudge;
import java.util.Scanner;

import static javax.print.attribute.standard.MediaSizeName.A;

/*
Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
o valor que recebe por hora e calcula o salário desse funcionário.
A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais,
representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada,
 respectivamente.

Saída
Imprima o número e o salário do funcionário, conforme exemplo fornecido,
com um espaço em branco antes e depois da igualdade. No caso do salário,
também deve haver um espaço em branco após o $.

Exemplos de Entrada
25
100
5.50
Exemplos de Saída
NUMBER = 25
SALARY = U$ 550.00
 */
public class UriOnlineJudge1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        int horasTrabalhdas = sc.nextInt();
        double valorHoras = sc.nextDouble();

        System.out.printf("NUMBER = %d\n", id);
        System.out.printf("SALARY = U$ %.2f\n", horasTrabalhdas*valorHoras);

        sc.close();
    }
}
