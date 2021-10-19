#include <iostream>
#include <math.h>

using namespace std;

int main() {

        double raio = 0;
        double pi = 3.14159;

        cin >> raio;

        double volume = (4.0/3) * pi * pow(raio,3);

        printf("VOLUME = %.3lf\n",volume);

   return 0;

}
