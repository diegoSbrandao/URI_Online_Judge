package br.com.urionlinejudge;
import java.util.Scanner;

/*
Leia 2 valores inteiros (A e B).
Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
indicando se os valores lidos são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima.

Exemplo de Entrada
6 24
Exemplo de Saída
Sao Multiplos

Exemplo de Entrada
6 25
Exemplo de Saída
Nao sao Multiplos
 */

public class UriOnlineJudge1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String multi = "";

        multi = (a%b==0 || b%a==0 ) ? "Sao Multiplos": "Nao sao Multiplos";
        System.out.println(multi);
        sc.close();
    }
}
