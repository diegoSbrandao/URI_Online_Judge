#include <iostream>

using namespace std;

int main(){

    float salario;
    cin>>salario;

    if (salario <= 400.0)
        printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 15 %%\n", salario * 1.15, salario * 1.15 - salario);
    else if (salario <= 800.0)
        printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 12 %%\n", salario * 1.12, salario * 1.12 - salario);
    else if (salario <= 1200.0)
        printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 10 %%\n", salario * 1.10, salario * 1.10 - salario);
    else if (salario <= 2000.0)
        printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 7 %%\n", salario * 1.07, salario * 1.07 - salario);
    else
        printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 4 %%\n", salario * 1.04, salario * 1.04 - salario);

    return 0;

}



