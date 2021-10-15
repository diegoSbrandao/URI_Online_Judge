#include <stdio.h>
#include <stdlib.h>

int main()
{

        int tempo = 0, velocidade = 0;

        scanf("%d %d",&tempo,&velocidade);

        printf("%.3f\n",((velocidade/12.0)*tempo));

        return 0;
}
