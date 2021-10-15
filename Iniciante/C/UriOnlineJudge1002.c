#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main() {

    double PI = 3.14159;
    double raio=0, area=0;

    scanf("%lf",&raio);

    area = PI * pow(raio,2);

    printf("A=%.4lf\n", area);

    return 0;
}
