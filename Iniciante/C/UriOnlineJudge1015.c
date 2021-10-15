#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
        double x1 = 0, y1 = 0, x2 = 0, y2 = 0;

        scanf("%lf %lf %lf %lf",&x1,&y1,&x2,&y2);

        double distancia = (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1);
        double res = sqrt(distancia);
        printf("%.4lf\n",res);

        return 0;
}
