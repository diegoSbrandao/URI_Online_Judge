#include <iostream>

using namespace std;

int main(){

        int n,quantia,somaC=0, somaR=0, somaS=0;
        double total, perC, perR, perS;
        char tipo;

        cin>>n;

        for(int i =0; i < n; i++){

        cin>>quantia>>tipo;

            if (tipo == 'c' || tipo == 'C'){
                somaC = somaC + quantia;
            }
            else if  (tipo == 'r' || tipo == 'R'){
                somaR = somaR + quantia;
            }
            else if  (tipo == 's' || tipo == 'S'){
                somaS = somaS + quantia;
            }

        }

        total = somaC + somaR + somaS;
        perC = somaC * 100 / total;
        perR = somaR * 100 / total;
        perS = somaS * 100 / total;

        printf("Total: %.0f cobaias\n",total);
        cout<<"Total de coelhos: "<<somaC<<endl;
        cout<<"Total de ratos: "<<somaR<<endl;
        cout<<"Total de sapos: "<<somaS<<endl;
        printf("Percentual de coelhos: %.2f %%\n",perC);
        printf("Percentual de ratos: %.2f %%\n",perR);
        printf("Percentual de sapos: %.2f %%\n",perS);
    return 0;

}



