#include <stdio.h>
#include <stdlib.h>

int main(){

        double X = 0, Y = 0;
        scanf("%lf %lf",&X,&Y);

        if (X > 0.0 && Y < 0.0) {
            printf("Q4\n");

        } else if (X > 0.0 && Y > 0.0) {
            printf("Q1\n");

        } else if (X < 0.0 && Y < 0.0) {
            printf("Q3\n");

        }else if (X < 0.0 && Y > 0.0) {
            printf("Q2\n");
        }
        else if (X < 0.0 || X > 0.0 && Y == 0.0) {
            printf("Eixo X\n");
        }
        else if (Y < 0.0 || Y > 0.0 && X == 0.0) {
            printf("Eixo Y\n");
        }

        else{
            printf("Origem\n");
        }

    return 0;

}
