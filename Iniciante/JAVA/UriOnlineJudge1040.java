package br.com.urionlinejudge;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Locale;

/*
Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal,
 correspondente às quatro notas de um aluno. Calcule a média com pesos 2, 3, 4 e 1, respectivamente,
 para cada uma destas notas e mostre esta média acompanhada pela mensagem "Media: ".
 Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.".
 Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.".
 Se a média calculada for um valor entre 5.0 e 6.9,
 inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno.
 Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada.
 Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2).
  e imprima a mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais )
   ou "Aluno reprovado.", (caso a média tenha ficado 4.9 ou menos).
   Para estes dois casos (aprovado ou reprovado após ter pego exame)
    apresente na última linha uma mensagem "Media final: " seguido da média final para esse aluno.
 */
public class UriOnlineJudge1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(new Locale("en", "US"));
        float n1 = sc.nextFloat() * 2;
        float n2 = sc.nextFloat() * 3;
        float n3 = sc.nextFloat() * 4;
        float n4 = sc.nextFloat();
        float media = (n1 + n2 + n3 + n4) / 10;
        float mediaFinal = media;
        float exame = 0;

        if (media < 7) {
            System.out.printf("Media: %.1f\n", media);

            if (media >= 5 && media <= 6.9) {
                System.out.printf("Aluno em exame.\n");
                exame = sc.nextFloat();
                System.out.printf("Nota do exame: %.1f\n", exame);
                mediaFinal = (mediaFinal + exame) / 2;

                if (mediaFinal >= 5) {
                    System.out.printf("Aluno aprovado.\n");
                    System.out.printf("Media final: %.1f\n", mediaFinal);
                } else {
                    System.out.printf("Aluno reprovado.\n");
                    System.out.printf("Media final: %.1f\n", mediaFinal);
                }
            } else if (media < 5) {
                System.out.printf("Aluno reprovado.\n");
            }

        } else {
            System.out.printf("Media: %.1f\n", media);
            System.out.printf("Aluno aprovado.\n");
        }

        sc.close();

    }

}















