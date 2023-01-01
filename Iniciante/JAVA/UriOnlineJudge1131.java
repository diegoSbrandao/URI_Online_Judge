package br.com.urionlinejudge;

import java.util.Scanner;

/*
beecrowd | 1131
Grenais
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
A Federação Gaúcha de Futebol contratou você para escrever um programa para fazer uma estatística do resultado de vários GRENAIS.
 Escreva um programa para ler o número de gols marcados pelo Inter e pelo Grêmio em um GRENAL.
 Logo após escrever a mensagem "Novo grenal (1-sim 2-nao)" e solicitar uma resposta.
 Se a resposta for 1, o algoritmo deve ser executado novamente solicitando o número de gols marcados pelos times em uma nova partida,
 caso contrário deve ser encerrado imprimindo:

- Quantos GRENAIS fizeram parte da estatística.
- O número de vitórias do Inter.
- O número de vitórias do Grêmio.
- O número de Empates.
- Uma mensagem indicando qual o time que venceu o maior número de GRENAIS (ou "Nao houve vencedor", caso termine empatado).

Entrada
O arquivo de entrada contém 2 valores inteiros, correspondentes aos gols marcados pelo Inter e pelo Grêmio respectivamente.
Em seguida háverá um inteiro (1 ou 2), correspondente à repetição do programa.

Saída
Após cada leitura dos gols, deve ser impressa a mensagem "Novo grenal (1-sim 2-nao)".
 Quando o algoritmo for encerrado devem ser mostradas as estatísticas conforme a descrição apresentada acima.
 Obs: a palavra "Gremio" deve ser impressa sem acento, conforme o exemplo abaixo.

Exemplo de Entrada
3 2
1
2 3
1
3 1
2

Exemplo de Saída
Novo grenal (1-sim 2-nao)
Novo grenal (1-sim 2-nao)
Novo grenal (1-sim 2-nao)
3 grenais
Inter:2
Gremio:1
Empates:0
Inter venceu mais

 */
public class UriOnlineJudge1131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int inter = 0;
        int gremio = 0;
        int grenais = 0;
        int empate = 0;
        int VitoriaInter = 0;
        int VitoriaGremio = 0;

        do {
            inter = sc.nextInt();
            gremio = sc.nextInt();
            grenais++;
            VitoriaInter += (inter > gremio) ? 1 : 0;
            VitoriaGremio += (inter < gremio) ? 1 : 0;
            empate += (inter == gremio) ? 1 : 0;

            System.out.println("Novo grenal (1-sim 2-nao)");
            answer = sc.nextInt();

            if (answer == 2) {
                String vencedor = "";

                if (VitoriaGremio == VitoriaInter) {
                    vencedor = "Ninguém";
                } else {
                    vencedor = (VitoriaInter > VitoriaGremio) ? "Inter" : "Gremio";
                }
                System.out.println(grenais + " grenais" + "\n" +
                        "Inter:" + VitoriaInter + "\n" +
                        "Gremio:" + VitoriaGremio + "\n" +
                        "Empates:" + empate + "\n" +
                        vencedor + " venceu mais"
                );

            }
        } while (answer == 1);


    }
}
