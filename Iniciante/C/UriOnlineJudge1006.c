#include <stdio.h>
#include <stdlib.h>

int main() {

    double A,B,C;

    scanf("%lf",&A);
    scanf("%lf",&B);
    scanf("%lf",&C);

    double media = (A*2 + B*3 + C*5) /10;
    printf("MEDIA = %.1lf\n", media);

    return 0;
}
