#include <stdio.h>
#include <stdlib.h>

int main()
{

        int N = 0;
        scanf("%d",&N);
        int RES = N;
        int hora=0, minutos=0, segundos=0;

        while (RES != 0) {
            hora = RES / 3600;
            RES = RES - (hora * 3600);

            minutos = RES / 60;
            RES = RES - (minutos * 60);

            segundos = RES / 1;
            RES = RES - (segundos * 1);

        }

        printf("%d:%d:%d\n",hora,minutos,segundos);

        return 0;
}
