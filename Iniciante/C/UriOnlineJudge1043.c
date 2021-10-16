#include<stdio.h>
#include<stdbool.h>

int main(){
        double a = 0, b = 0, c = 0;
        bool triangulo = false;

        scanf("%lf %lf %lf",&a,&b,&c);


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
