package br.com.urionlinejudge;

import java.util.Scanner;

/*
URI Online Judge | 1117
Validação de Nota
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Faça um programa que leia as notas referentes às duas avaliações de um aluno.
Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas válidas
(uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.

Entrada
A entrada contém vários valores reais, positivos ou negativos.
 O programa deve ser encerrado quando forem lidas duas notas válidas.

Saída
Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
Quando duas notas válidas forem lidas,
deve ser impressa a mensagem "media = " seguido do valor do cálculo.
O valor deve ser apresentado com duas casas após o ponto decimal.

Exemplo de Entrada
-3.5
3.5
11.0
10.0
Exemplo de Saída
nota invalida
nota invalida
media = 6.75
 */
public class UriOnlineJudge1117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double notas, media = 0, cont = 0;

        while (true) {

            notas = sc.nextDouble();

            if (notas < 0.0 || notas > 10.0) {
                System.out.println("nota invalida");
            } else {
                media += notas;
                cont++;
                if (cont == 2) {
                    System.out.println("media = " + media / cont);
                    break;
                }
            }
        }
    }
}
