package br.com.urionlinejudge;
import java.util.Scanner;

/*
Tempo de Jogo com Minutos
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e fim do jogo.

Saída
Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .

Exemplo de Entrada
7 8 9 10
Exemplo de Saída
O JOGO DUROU 2 HORA(S) E 2 MINUTO(S)

Exemplo de Entrada
7 7 7 7
Exemplo de Saída
O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)

Exemplo de Entrada
7 10 8 9
Exemplo de Saída
O JOGO DUROU 0 HORA(S) E 59 MINUTO(S)
 */
public class UriOnlineJudge1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia = 1440;
        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();

        horaInicial *= 60;
        horaFinal *= 60;
        minutoInicial +=horaInicial;
        minutoFinal +=horaFinal;

        if (minutoFinal<= minutoInicial) {
            minutoFinal += dia;
        }
        int soma1 = (minutoFinal-minutoInicial)/60;
        int soma2 =  (minutoFinal-minutoInicial)%60;
        System.out.println("O JOGO DUROU "+soma1+" HORA(S) E "+soma2+" MINUTO(S)");

        sc.close();
    }
}
