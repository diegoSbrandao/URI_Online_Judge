package br.com.urionlinejudge;
import java.util.Scanner;

/*
URI Online Judge | 1114
Senha Fixa
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Escreva um programa que repita a leitura de uma senha até que ela seja válida.
Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e
o algoritmo encerrado. Considere que a senha correta é o valor 2002.

Entrada
A entrada é composta por vários casos de testes contendo valores inteiros.

Saída
Para cada valor lido mostre a mensagem correspondente à descrição do problema.

Exemplo de Entrada
2200
1020
2022
2002
Exemplo de Saída
Senha Invalida
Senha Invalida
Senha Invalida
Acesso Permitido
 */
public class UriOnlineJudge1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 2002, y;

        for (;;) {
            y = sc.nextInt();

            System.out.println((x == y) ? "Acesso Permitido" : "Senha Invalida");
            if(x==y)break;
        }
        sc.close();
    }
}