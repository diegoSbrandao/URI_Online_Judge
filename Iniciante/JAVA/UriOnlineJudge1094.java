package br.com.urionlinejudge;
import java.util.Scanner;

/*
URI Online Judge | 1094
Experiências
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa
de sua ajuda para organizar os experimentos de um laboratório o qual ela é responsável.
Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o
percentual de cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos.
Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados,
o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.

Entrada
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a
seguir. Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade
de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada
e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o
percentual deve ser apresentado com dois dígitos após o ponto.

Exemplo de Entrada
10
10 C
6 R
15 S
5 C
14 R
9 C
6 R
8 S
5 C
14 R
Exemplo de Saída
Total: 92 cobaias
Total de coelhos: 29
Total de ratos: 40
Total de sapos: 23
Percentual de coelhos: 31.52 %
Percentual de ratos: 43.48 %
Percentual de sapos: 25.00 %
 */

public class UriOnlineJudge1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,quantia,somaC=0, somaR=0, somaS=0;
        double total, perC, perR, perS;

        n = sc.nextInt();

        for(int i =0; i < n; i++){

            quantia = sc.nextInt();
            String tipo = sc.next();

            if (tipo.equalsIgnoreCase("C")){
                somaC = somaC + quantia;
            }
            else if (tipo.equalsIgnoreCase("R")){
                somaR = somaR + quantia;
            }
            else if (tipo.equalsIgnoreCase("S")){
                somaS = somaS + quantia;
            }

        }

        total = somaC + somaR + somaS;
        perC = somaC * 100 / total;
        perR = somaR * 100 / total;
        perS = somaS * 100 / total;

        System.out.printf("Total: %.0f cobaias\n",total);
        System.out.printf("Total de coelhos: %d\n",somaC);
        System.out.printf("Total de ratos: %d\n",somaR);
        System.out.printf("Total de sapos: %d\n",somaS);
        System.out.printf("Percentual de coelhos: %.2f %%\n",perC);
        System.out.printf("Percentual de ratos: %.2f %%\n",perR);
        System.out.printf("Percentual de sapos: %.2f %%\n",perS);

        sc.close();
    }
}