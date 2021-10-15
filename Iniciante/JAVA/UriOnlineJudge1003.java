package br.com.urionlinejudge;
import java.util.Scanner;

/*
Leia dois valores inteiros, no caso para variáveis A e B.
A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "SOMA" com todas as letras maiúsculas,
com um espaço em branco antes e depois da igualdade seguido pelo valor correspondente à soma de A e B.
Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado,
caso contrário, você receberá "Presentation Error".

Exemplos de Entrada
30
10
Exemplos de Saída
SOMA = 40
 */

public class UriOnlineJudge1003 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int A = sc.nextInt();
      int B = sc.nextInt();
      int SOMA = A+B;
        System.out.println("SOMA = "+SOMA);


      sc.close();
    }
}
