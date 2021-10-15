#include <stdio.h>
#include <stdlib.h>

int main()
{

        int N = 0;
        scanf("%d",&N);

        int X100 = 0;
        int X50 = 0;
        int X20 = 0;
        int X10 = 0;
        int X5 = 0;
        int X2 = 0;
        int X1 = 0;
        int RES = N;

        while (RES != 0) {
            X100 = RES / 100;
            RES -= (X100 * 100);

            X50 = RES / 50;
            RES -= (X50 * 50);

            X20 = RES / 20;
            RES -= (X20 * 20);

            X10 = RES / 10;
            RES -= (X10 * 10);

            X5 = RES / 5;
            RES -= (X5 * 5);

            X2 = RES / 2;
            RES -= (X2 * 2);

            X1 = RES / 1;
            RES -= (X1 * 1);
        }

        printf("%d\n",N);
        printf("%d nota(s) de R$ 100,00\n",X100);
        printf("%d nota(s) de R$ 50,00\n",X50);
        printf("%d nota(s) de R$ 20,00\n",X20);
        printf("%d nota(s) de R$ 10,00\n",X10);
        printf("%d nota(s) de R$ 5,00\n",X5);
        printf("%d nota(s) de R$ 2,00\n",X2);
        printf("%d nota(s) de R$ 1,00\n",X1);

        return 0;
}
