#include <iostream>

using namespace std;

int main(){

        int positivos;

         for(int i = 0; i < 6; i++){

            double numeros = 0;
            cin>>numeros;

            if(numeros > 0){
               positivos++;
            }
        }
        cout<<positivos<<" valores positivos"<<endl;

    return 0;

}



