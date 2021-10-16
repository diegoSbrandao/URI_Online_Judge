package br.com.urionlinejudge;
import java.util.Scanner;

/*
Aumento de Salário
Por Neilor Tonin, URI  Brasil

Timelimit: 1
A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:


Salário	Percentual de Reajuste
0 - 400.00
400.01 - 800.00
800.01 - 1200.00
1200.01 - 2000.00
Acima de 2000.00

15%
12%
10%
7%
4%

Leia o salário do funcionário e calcule e mostre o novo salário,
bem como o valor de reajuste ganho e o índice reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de
reajuste ganho, conforme exemplo abaixo.

Exemplo de Entrada
400.00
Exemplo de Saída
Novo salario: 460.00
Reajuste ganho: 60.00
Em percentual: 15 %

Exemplo de Entrada
800.01
Exemplo de Saída
Novo salario: 880.01
Reajuste ganho: 80.00
Em percentual: 10 %

Exemplo de Entrada
2000.00
Exemplo de Saída
Novo salario: 2140.00
Reajuste ganho: 140.00
Em percentual: 7 %
 */

public class UriOnlineJudge1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        if (salario <= 400.0){
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 15 %%\n", salario * 1.15, salario * 1.15 - salario);
        }else if (salario <= 800.0){
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 12 %%\n", salario * 1.12, salario * 1.12 - salario);
        }else if (salario <= 1200.0){
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 10 %%\n", salario * 1.10, salario * 1.10 - salario);
        }else if (salario <= 2000.0){
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 7 %%\n", salario * 1.07, salario * 1.07 - salario);
        }else{
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 4 %%\n", salario * 1.04, salario * 1.04 - salario);
            }
        sc.close();
    }
}
