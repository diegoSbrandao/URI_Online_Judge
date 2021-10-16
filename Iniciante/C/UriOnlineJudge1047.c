#include<stdio.h>
#include <stdlib.h>
#define dia 1440

int main(){

    int horaInicial, minutoInicial, horaFinal, minutoFinal;

    scanf("%d %d %d %d",&horaInicial,&minutoInicial, &horaFinal, &minutoFinal);

    horaInicial *= 60;
    horaFinal *= 60;
    minutoInicial +=horaInicial;
    minutoFinal +=horaFinal;

    if (minutoFinal<= minutoInicial){
        minutoFinal+= dia;
    }
    printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (minutoFinal-minutoInicial)/60, (minutoFinal-minutoInicial)%60);
    return 0;
}
