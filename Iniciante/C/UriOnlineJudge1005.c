#include <stdio.h>
#include <stdlib.h>

int main() {

    double A,B;

    scanf("%lf",&A);
    scanf("%lf",&B);

    double media = (A*3.5 + B*7.5) / 11;
    printf("MEDIA = %.5lf\n", media);

    return 0;
}
