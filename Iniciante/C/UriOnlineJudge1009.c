#include <stdio.h>
#include <stdlib.h>

int main() {
        
        char nome;
	double salario = 0, totalVendas = 0;

        scanf("%s %lf %lf",&nome,&salario,&totalVendas);
        printf("TOTAL = R$ %.2lf\n", (salario + (totalVendas*0.15)));

    return 0;
}
