package br.com.urionlinejudge;
import java.util.Scanner;

/*
Leia dois valores inteiros.
A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD.
A seguir mostre a variável PROD com mensagem correspondente.

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço em branco antes
 e depois da igualdade. Não esqueça de imprimir o fim de linha após o produto, caso contrário
  seu programa apresentará a mensagem: “Presentation Error”.

Exemplos de Entrada
3
9
Exemplos de Saída
PROD = 27
 */
public class UriOnlineJudge1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int PROD = A*B;
        System.out.println("PROD = "+PROD);


        sc.close();
    }
}
