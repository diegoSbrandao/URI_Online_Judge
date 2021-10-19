#include <iostream>

using namespace std;

int main() {

        int idPeca1, quantPeca1, idPeca2,quantPeca2;
        double valorUnitario1, valorUnitario2;

        cin >> idPeca1 >> quantPeca1 >> valorUnitario1;
        cin >> idPeca2 >> quantPeca2 >> valorUnitario2;

        double total = (quantPeca1*valorUnitario1) + (quantPeca2*valorUnitario2);
        printf("VALOR A PAGAR: R$ %.2lf\n",total);

   return 0;

}
