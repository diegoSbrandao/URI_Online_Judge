#include <stdio.h>
#include <stdlib.h>

int main()
{

        int N = 0;
        scanf("%d",&N);
        int RES = N;
        int ano=0, mes=0, dias=0;

        while (RES != 0) {
            ano = RES / 365;
            RES = RES - (ano * 365);

            mes = RES / 30;
            RES = RES - (mes * 30);

            dias = RES / 1;
            RES = RES - (dias * 1);

        }

        printf("%d ano(s)\n",ano);
        printf("%d mes(es)\n",mes);
        printf("%d dia(s)\n",dias);

        return 0;
}
