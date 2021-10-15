#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(){

        double X1 = 0, X2 = 0, delta = 0;
        double A = 0, B = 0, C = 0;

        scanf("%lf %lf %lf",&A,&B,&C);

        delta = pow(B, 2) - 4 * A * C;

        if (delta >= 0 && A != 0) {
            X1 = (-B +  sqrt(delta)) / (2 * A);
            X2 = (-B -  sqrt(delta)) / (2 * A);
            printf("R1 = %.5f\n", X1);
            printf("R2 = %.5f\n", X2);
        } else {
            printf("Impossivel calcular\n");
        }

    return 0;

}
