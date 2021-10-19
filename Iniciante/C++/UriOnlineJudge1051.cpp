#include <iostream>

using namespace std;

int main(){

    double salario;
    cin>>salario;

    if(salario <= 2000.00){
        cout<<"Isento"<<endl;
    }else if (salario >= 2000.01 && salario <= 3000.00){
          printf("R$ %.2f\n", (salario - 2000.00)*0.08);
    }else if (salario >= 3000.01 && salario <= 4500.00){
          printf("R$ %.2f\n", ((salario - 3000.00)*0.18 + 1000.00*0.08));
    }else if (salario >= 4500.01){
          printf("R$ %.2f\n", ((salario - 4500.00)*0.28 + 1500.00*0.18 + 1000.00*0.08));
    }
    return 0;

}



