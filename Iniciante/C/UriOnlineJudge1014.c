#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
        int X = 0;
        double Y = 0;

        scanf("%d %lf", &X, &Y);
        double km = X/Y;
        printf("%.3lf km/l\n",km);

        return 0;
}
