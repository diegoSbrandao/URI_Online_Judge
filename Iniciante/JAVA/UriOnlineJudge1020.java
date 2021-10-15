package br.com.urionlinejudge;
import java.util.Scanner;

/*
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere
todo ano com 365 dias e todo mês com 30 dias.
 Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364.
 Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.

Exemplo de Entrada	Exemplo de Saída
400

1 ano(s)
1 mes(es)
5 dia(s)

 */
public class UriOnlineJudge1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int RES = N;
        int ano=0;
        int mes=0;
        int dias=0;

        while (RES != 0) {
            ano = RES / 365;
            RES = RES - (ano * 365);

            mes = RES / 30;
            RES = RES - (mes * 30);

            dias = RES / 1;
            RES = RES - (dias * 1);

        }
        System.out.println(ano+" ano(s)");
        System.out.println(mes+" mes(es)");
        System.out.println(dias+" dia(s)");

        sc.close();
    }
}