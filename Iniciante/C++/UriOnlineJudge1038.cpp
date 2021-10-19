#include <iostream>

using namespace std;

int main() {

        int codigo, quantidade;
        double total;

        cin>>codigo>>quantidade;

        if(codigo==1){
            total = quantidade * 4;
        }
        else if(codigo==2){
            total = quantidade * 4.50;
        }
        else if(codigo==3){
            total = quantidade * 5;
        }
        else if(codigo==4){
            total = quantidade * 2;
        }
        else if(codigo==5){
            total = quantidade * 1.50;
        }

        printf("Total: R$ %.2lf\n",total);

    return 0;
}



