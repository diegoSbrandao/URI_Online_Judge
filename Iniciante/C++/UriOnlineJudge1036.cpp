#include <iostream>
#include <math.h>

using namespace std;

int main() {

        double X1, X2, delta, A, B, C;

        cin>>A>>B>>C;

        delta = pow(B, 2) - 4 * A * C;

        if (delta >= 0 && A != 0) {
            X1 = (-B +  sqrt(delta)) / (2 * A);
            X2 = (-B -  sqrt(delta)) / (2 * A);
            printf("R1 = %.5f\n", X1);
            printf("R2 = %.5f\n", X2);
        } else {
             cout<<"Impossivel calcular"<<endl;
        }

   return 0;
}



