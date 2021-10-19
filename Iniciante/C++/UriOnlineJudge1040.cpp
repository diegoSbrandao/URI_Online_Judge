#include <iostream>

using namespace std;

int main() {

        float n1, n2, n3, n4;
        cin>>n1>>n2>>n3>>n4;
        n1 = n1*2;
        n2 = n2*3;
        n3 = n3*4;
        float media = (n1 + n2 + n3 + n4) / 10;
        float mediaFinal = media;
        float exame = 0;

        if (media < 7) {
            printf("Media: %.1f\n", media);

            if (media >= 5 && media <= 6.9) {
                cout<<"Aluno em exame."<<endl;
                cin>>exame;
                printf("Nota do exame: %.1f\n", exame);
                mediaFinal = (mediaFinal + exame) / 2;

                if (mediaFinal >= 5) {
                    cout<<"Aluno aprovado."<<endl;
                    printf("Media final: %.1f\n", mediaFinal);
                } else {
                    cout<<"Aluno reprovado."<<endl;
                    printf("Media final: %.1f\n", mediaFinal);
                }
            } else if (media < 5) {
                cout<<"Aluno reprovado."<<endl;
            }

        } else {
            printf("Media: %.1f\n", media);
            cout<<"Aluno aprovado."<<endl;
        }
    return 0;
}



