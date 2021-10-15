#include <stdio.h>
#include <stdlib.h>

int main() {

        int idPeca1, quantPeca1, idPeca2,quantPeca2;
        double valorUnitario1, valorUnitario2;

        scanf("%d %d %lf", &idPeca1, &quantPeca1, &valorUnitario1);
        scanf("%d %d %lf", &idPeca2, &quantPeca2, &valorUnitario2);

        double total = (quantPeca1*valorUnitario1) + (quantPeca2*valorUnitario2);
        printf("VALOR A PAGAR: R$ %.2lf\n",total);

    return 0;
}
