#include <iostream>
#include <math.h>

using namespace std;

int main() {

        double x1, y1, x2, y2;

        cin >> x1>>y1>> x2>>y2;

        double distancia = (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1);
        double res = sqrt(distancia);

        printf("%.4lf\n",res);

   return 0;

}
