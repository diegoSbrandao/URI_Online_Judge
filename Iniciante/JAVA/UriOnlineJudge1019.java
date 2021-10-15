package br.com.urionlinejudge;
import java.util.Scanner;

/*
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica,
e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos),
convertido para horas:minutos:segundos, conforme exemplo fornecido.

Exemplo de Entrada
556
Exemplo de Saída
0:9:16

 */
public class UriOnlineJudge1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int RES = N;
        int hora=0;
        int minutos=0;
        int segundos=0;

        while (RES != 0) {
            hora = RES / 3600;
            RES = RES - (hora * 3600);

            minutos = RES / 60;
            RES = RES - (minutos * 60);

            segundos = RES / 1;
            RES = RES - (segundos * 1);

        }
        System.out.println(hora+":"+minutos+":"+segundos);
        sc.close();
    }
}
