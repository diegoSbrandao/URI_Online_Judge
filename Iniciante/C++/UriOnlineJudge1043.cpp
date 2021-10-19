#include <iostream>

using namespace std;

int main() {

        double a, b, c;
        bool triangulo = false;

        cin>>a>>b>>c;

        if(b-c < a && a < b + c && a-c < b && b < a + c && a-b < c && c < a + b){
          triangulo = true;
            printf("Perimetro = %.1lf\n", (a+b+c));
        }

       if(!triangulo){
           double area = ((a+b) * c ) / 2;
           printf("Area = %.1lf\n",area);
       }
    return 0;
}



