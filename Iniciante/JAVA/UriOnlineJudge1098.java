package br.com.urionlinejudge;

/*
URI Online Judge | 1098
Sequencia IJ 4
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
I=0 J=1
I=0 J=2
I=0 J=3
I=0.2 J=1.2
I=0.2 J=2.2
I=0.2 J=3.2
.....
I=2 J=?
I=2 J=?
I=2 J=?
 */
public class UriOnlineJudge1098 {
    public static void main(String[] args) {
        float i, j, valor;

        int temp, temp2;

        for (i = 0, j = 1, valor = 0, temp = 0, temp2 = 0; i < 2.2; j++) {

            if (temp2 == 0) {
                System.out.printf("I=%.0f J=%.0f\n", i, j);

            } else {
                System.out.printf("I=%.1f J=%.1f\n", i, j);
            }
            temp++;

            if (temp == 3) {
                i += 0.2;
                valor += 0.2;
                j = valor;
                temp = 0;
                temp2++;
            }
            if (temp2 == 5) {
                temp2 = 0;
            }
        }
    }
}










