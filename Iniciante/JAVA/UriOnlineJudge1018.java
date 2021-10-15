package br.com.urionlinejudge;

import java.util.Scanner;

/*
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas)
no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1.
A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias,
conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário
seu programa apresentará a mensagem: “Presentation Error”.

Exemplo de Entrada
576

Exemplo de Saída
576
5 nota(s) de R$ 100,00
1 nota(s) de R$ 50,00
1 nota(s) de R$ 20,00
0 nota(s) de R$ 10,00
1 nota(s) de R$ 5,00
0 nota(s) de R$ 2,00
1 nota(s) de R$ 1,00

 */
public class UriOnlineJudge1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X100 = 0;
        int X50 = 0;
        int X20 = 0;
        int X10 = 0;
        int X5 = 0;
        int X2 = 0;
        int X1 = 0;
        int RES = N;

        while (RES != 0) {
            X100 = RES / 100;
            RES -= (X100 * 100);

            X50 = RES / 50;
            RES -= (X50 * 50);

            X20 = RES / 20;
            RES -= (X20 * 20);

            X10 = RES / 10;
            RES -= (X10 * 10);

            X5 = RES / 5;
            RES -= (X5 * 5);

            X2 = RES / 2;
            RES -= (X2 * 2);

            X1 = RES / 1;
            RES -= (X1 * 1);
        }

        System.out.println(N);
        System.out.println(X100 + " nota(s) de R$ 100,00" );
        System.out.println(X50 + " nota(s) de R$ 50,00" );
        System.out.println(X20 + " nota(s) de R$ 20,00" );
        System.out.println(X10 + " nota(s) de R$ 10,00" );
        System.out.println(X5 + " nota(s) de R$ 5,00" );
        System.out.println(X2 + " nota(s) de R$ 2,00" );
        System.out.println(X1 + " nota(s) de R$ 1,00" );

        sc.close();
    }
}
