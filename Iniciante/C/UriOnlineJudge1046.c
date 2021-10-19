#include<stdio.h>

int main(){

        int duracao = 0;
        int horaInicial = 0, horaFinal = 0;

       scanf("%d %d",&horaInicial,&horaFinal);

        if(horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
            printf("O JOGO DUROU %d HORA(S)\n",duracao);
        }
        else{
            duracao = 24 - horaInicial + horaFinal;
            printf("O JOGO DUROU %d HORA(S)\n",duracao);
        }

    return 0;
}
