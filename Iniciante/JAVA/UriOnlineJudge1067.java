package br.com.urionlinejudge;
import java.util.Scanner;

/*
URI Online Judge | 1067
Números Ímpares
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia um valor inteiro X (1 <= X <= 1000).
 Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

Entrada
O arquivo de entrada contém 1 valor inteiro qualquer.

Saída
Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.

Exemplo de Entrada
8
Exemplo de Saída
1
3
5
7
 */

public class UriOnlineJudge1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 0; i <= x ; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
