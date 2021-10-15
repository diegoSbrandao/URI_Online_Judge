#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
        double raio = 0;
        double pi = 3.14159;

        scanf("%lf",&raio);

        double volume = (4.0/3) * pi * pow(raio,3);

        printf("VOLUME = %.3lf\n",volume);

        return 0;
}
