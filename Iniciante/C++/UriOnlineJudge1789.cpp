#include <iostream>

using namespace std;

int main(){

              int L = 0, V = 0, velocidade = 0 ;

             while(scanf("%d",&L)!=EOF)  {

                velocidade = 0;

                for (int i = 0; i < L; i++) {
                    cin>>V;

                    if (velocidade < V) {
                        velocidade = V;
                    }
                }
                if (velocidade < 10) {
                    velocidade = 1;
                } else if (velocidade < 20) {
                    velocidade = 2;
                } else {
                    velocidade = 3;
                }
                cout<<velocidade<<endl;
            }
    return 0;

}



