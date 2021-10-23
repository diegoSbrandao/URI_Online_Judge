#include <stdio.h>

int main(){

double notas, media = 0, cont = 0;

        while (1) {

            scanf("%lf",&notas);

            if (notas < 0.0 || notas > 10.0) {
                printf("nota invalida\n");
            } else {
                media += notas;
                cont++;
                if (cont == 2) {
                    printf("media = %.2lf\n",media / cont);
                    break;
                }
            }
        }

    return 0;
}
