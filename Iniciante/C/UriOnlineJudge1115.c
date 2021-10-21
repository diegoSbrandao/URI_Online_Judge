#include <stdio.h>

int main(){

      double X, Y;
      scanf("%lf %lf",&X,&Y);

        while (1) {
            if (X > 0.0 && Y < 0.0) {
                printf("quarto\n");

            } else if (X > 0.0 && Y > 0.0) {
                printf("primeiro\n");

            } else if (X < 0.0 && Y < 0.0) {
                printf("terceiro\n");

            } else if (X < 0.0 && Y > 0.0) {
                printf("segundo\n");
            }

            scanf("%lf %lf",&X,&Y);

            if(X==0 || Y==0)break;
        }
    return 0;
}
