package br.com.urionlinejudge;
import java.util.Scanner;

/*
URI Online Judge | 1070
Seis Números Ímpares
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia um valor inteiro X. Em seguida apresente os 6 valores
ímpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.

Exemplo de Entrada
8
Exemplo de Saída
9
11
13
15
17
19
 */
public class UriOnlineJudge1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int cont = 0;

        while (cont <6){
            if(x%2!=0){
                cont++;
                System.out.println(x);
            }
        x++;
        }
        sc.close();
    }
}
