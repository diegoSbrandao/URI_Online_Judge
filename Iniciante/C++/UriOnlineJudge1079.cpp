#include <iostream>

using namespace std;

int main(){

    float nota1,nota2,nota3,total,media;
    int n;
    cin>>n;

    for(int i=1; i<=n; i++){
        cin>>nota1>>nota2>>nota3;
        total=nota1*2.0+nota2*3.0+nota3*5.0;
        media=total/10.0;
        printf("%.1f\n",media);
    }
    return 0;

}



