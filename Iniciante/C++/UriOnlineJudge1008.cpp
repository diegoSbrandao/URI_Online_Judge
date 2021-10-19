#include <iostream>

using namespace std;

int main() {

        int id=0, horasTrabalhdas=0;
        double valorHoras = 0;

        cin >> id >> horasTrabalhdas >> valorHoras;

        cout<<"NUMBER = " << id << endl;
        printf("SALARY = U$ %.2lf\n", horasTrabalhdas*valorHoras);

   return 0;

}
