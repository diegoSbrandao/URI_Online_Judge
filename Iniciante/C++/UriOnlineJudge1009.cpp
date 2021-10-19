#include <iostream>

using namespace std;

int main() {

    string nome;
	double salario = 0, totalVendas = 0;

        cin >> nome >> salario >> totalVendas;

        printf("TOTAL = R$ %.2lf\n", (salario + (totalVendas*0.15)));

   return 0;

}
