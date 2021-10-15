#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
        int a = 0, b = 0, c = 0;      

        scanf("%d %d %d",&a, &b, &c);

        int maiorAB = (a+b+ abs(a-b))/2;
        int maiorC = (maiorAB+c+ abs(maiorAB-c))/2;

        printf("%d eh o maior\n",maiorC);

        return 0;
}
