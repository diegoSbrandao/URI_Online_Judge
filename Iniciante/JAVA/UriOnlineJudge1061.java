package br.com.urionlinejudge;
import java.time.*;
import java.util.Scanner;

/*
URI Online Judge | 1061
Tempo de um Evento
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Pedrinho está organizando um evento em sua Universidade.
 O evento deverá ser no mês de Abril, iniciando e terminando dentro do mês.
 O problema é que Pedrinho quer calcular o tempo que o evento vai durar,
 uma vez que ele sabe quando inicia e quando termina o evento.

Sabendo que o evento pode durar de poucos segundos a vários dias,
você deverá ajudar Pedrinho a calcular a duração deste evento.

Entrada
Como entrada, na primeira linha vai haver a descrição “Dia”,
seguido de um espaço e o dia do mês no qual o evento vai começar.
Na linha seguinte, será informado o momento no qual o evento vai iniciar, no formato hh : mm : ss.
Na terceira e quarta linha de entrada haverá outra informação no mesmo formato das duas primeiras linhas,
indicando o término do evento.

Saída
Na saída, deve ser apresentada a duração do evento, no seguinte formato:

W dia(s)
X hora(s)
Y minuto(s)
Z segundo(s)

Obs: Considere que o evento do caso de teste para o problema tem duração mínima de 1 minuto.

Exemplo de Entrada
Dia 5
08 : 12 : 23
Dia 9
06 : 13 : 23

Exemplo de Saída
3 dia(s)
22 hora(s)
1 minuto(s)
0 segundo(s)
 */

public class UriOnlineJudge1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aux;

        aux = sc.next();
        int day = sc.nextInt();
        int hour = sc.nextInt();
        aux = sc.next();
        int minute = sc.nextInt();
        aux = sc.next();
        int second = sc.nextInt();

        aux = sc.next();
        int day2 = sc.nextInt();
        int hour2 = sc.nextInt();
        aux = sc.next();
        int minute2 = sc.nextInt();
        aux = sc.next();
        int second2 = sc.nextInt();

          LocalDateTime time1 = LocalDateTime.of(2000,1,day,hour,minute,second);
          LocalDateTime time2 = LocalDateTime.of(2000,1,day2,hour2,minute2,second2);

          long timeElapsed = Duration.between(time1, time2).toDays();
          long timeElapsed2 = Duration.between(time1, time2).toHours();
          long timeElapsed3 = Duration.between(time1, time2).toMinutes();
          long timeElapsed4 = Duration.between(time1, time2).getSeconds();

        System.out.println(timeElapsed+" dia(s)");
        System.out.println(timeElapsed2 - (timeElapsed*24)+" hora(s)");
        System.out.println(timeElapsed3 - (timeElapsed2*60)+" minuto(s)");
        System.out.println(timeElapsed4 - (timeElapsed3*60)+" segundo(s)");


        sc.close();
    }
}
