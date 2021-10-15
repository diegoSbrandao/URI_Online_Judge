package br.com.urionlinejudge;
import java.util.Scanner;

/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1,
o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o
valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores,
 respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo,
lembrando de deixar um espaço após os dois pontos e um espaço após o "R$".
O valor deverá ser apresentado com 2 casas após o ponto.

Exemplos de Entrada
12 1 5.30
16 2 5.10
Exemplos de Saída
VALOR A PAGAR: R$ 15.50
 */
public class UriOnlineJudge1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idPeca1 = sc.nextInt();
        int quantPeca1 = sc.nextInt();
        double valorUnitario1 = sc.nextDouble();

        int idPeca2 = sc.nextInt();
        int quantPeca2 = sc.nextInt();
        double valorUnitario2 = sc.nextDouble();

        double total = (quantPeca1*valorUnitario1) + (quantPeca2*valorUnitario2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
        sc.close();
    }
}
