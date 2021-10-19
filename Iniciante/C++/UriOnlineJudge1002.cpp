#include <iostream>
#include <math.h>

using namespace std;

int main() {

    double PI = 3.14159;
    double raio=0, area=0;

   cin >> raio;
   area = PI * pow(raio,2);
   printf("A=%.4lf\n", area);


   return 0;
}
