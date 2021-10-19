#include <iostream>

using namespace std;

int main(){

       int positivos;
      double somaPositivos;


         for(int i = 0; i < 6; i++){
            double numeros = 0;

            cin>>numeros;

            if(numeros > 0){
               positivos++;
               somaPositivos += numeros;
            }
        }

        double media = somaPositivos / positivos;

        cout<<positivos<<" valores positivos"<<endl;
        printf("%.1lf\n", media);

    return 0;

}



