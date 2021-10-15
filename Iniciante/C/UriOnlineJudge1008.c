#include <stdio.h>
#include <stdlib.h>

int main() {

        int id=0, horasTrabalhdas=0;
        double valorHoras = 0;

        scanf("%d %d",&id, &horasTrabalhdas);
        scanf("%lf",&valorHoras);

        printf("NUMBER = %d\n", id);
        printf("SALARY = U$ %.2lf\n", horasTrabalhdas*valorHoras);

    return 0;
}
