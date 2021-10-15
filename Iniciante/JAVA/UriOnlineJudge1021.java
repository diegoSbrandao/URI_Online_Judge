package br.com.urionlinejudge;
import java.util.Locale;
import java.util.Scanner;

/*
Leia um valor de ponto flutuante com duas casas decimais.
Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis
no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2.
As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial,
conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.

Exemplo de Entrada
576.73

Exemplo de Saída
NOTAS:
5 nota(s) de R$ 100.00
1 nota(s) de R$ 50.00
1 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
1 nota(s) de R$ 5.00
0 nota(s) de R$ 2.00
MOEDAS:
1 moeda(s) de R$ 1.00
1 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
2 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
3 moeda(s) de R$ 0.01

 */
public class UriOnlineJudge1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();
        double RES = N;

        int X100 = 0;
        int X50 = 0;
        int X20 = 0;
        int X10 = 0;
        int X5 = 0;
        int X2 = 0;

        int X1 = 0;
        int X05 = 0;
        int X025 = 0;
        int X010 = 0;
        int X005 = 0;
        int X001 = 0;


        while (RES != 0) {
            X100 = (int) (RES / 100);
            RES = RES % 100;

            X50 = (int) (RES / 50);
            RES = RES % 50;

            X20 = (int) (RES / 20);
            RES = RES % 20;

            X10 = (int) (RES / 10);
            RES = RES % 10;

            X5 = (int) (RES / 5);
            RES = RES % 5;

            X2 = (int) (RES / 2);
            RES = RES % 2;
            break;
        }

        double moeda = 0;
        moeda = N - (N - RES);
        moeda = moeda * 100.00;

        while (moeda != 0 || moeda < 0) {

            X1 = (int) (moeda / 100);
            moeda = moeda % 100;

            X05 = (int) (moeda / 50.00);
            moeda = moeda % 50.00;

            X025 = (int) (moeda / 25.00);
            moeda = moeda % 25.00;

            X010 = (int) (moeda / 10.00);
            moeda = moeda % 10.00;

            X005 = (int) (moeda / 5.00);
            moeda = moeda % 5.00;

            X001 = (int) (moeda / 1.00);
            moeda = moeda % 1.00;
            break;
        }

        System.out.println("NOTAS:");
        System.out.println(X100 + " nota(s) de R$ 100.00");
        System.out.println(X50 + " nota(s) de R$ 50.00");
        System.out.println(X20 + " nota(s) de R$ 20.00");
        System.out.println(X10 + " nota(s) de R$ 10.00");
        System.out.println(X5 + " nota(s) de R$ 5.00");
        System.out.println(X2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(X1 + " moeda(s) de R$ 1.00");
        System.out.println(X05 + " moeda(s) de R$ 0.50");
        System.out.println(X025 + " moeda(s) de R$ 0.25");
        System.out.println(X010 + " moeda(s) de R$ 0.10");
        System.out.println(X005 + " moeda(s) de R$ 0.05");
        System.out.println(X001 + " moeda(s) de R$ 0.01");
        sc.close();
    }
}










