#include <stdio.h>
#include <stdlib.h>

int main(){

        float n1 = 0, n2 = 0, n3 = 0, n4 = 0;
        scanf("%f %f %f %f",&n1,&n2,&n3,&n4);
        n1 = n1*2;
        n2 = n2*3;
        n3 = n3*4;
        float media = (n1 + n2 + n3 + n4) / 10;
        float mediaFinal = media;
        float exame = 0;

        if (media < 7) {
            printf("Media: %.1f\n", media);

            if (media >= 5 && media <= 6.9) {
                printf("Aluno em exame.\n");
                scanf("%f",&exame);
                printf("Nota do exame: %.1f\n", exame);
                mediaFinal = (mediaFinal + exame) / 2;

                if (mediaFinal >= 5) {
                    printf("Aluno aprovado.\n");
                    printf("Media final: %.1f\n", mediaFinal);
                } else {
                    printf("Aluno reprovado.\n");
                    printf("Media final: %.1f\n", mediaFinal);
                }
            } else if (media < 5) {
                printf("Aluno reprovado.\n");
            }

        } else {
            printf("Media: %.1f\n", media);
            printf("Aluno aprovado.\n");
        }

    return 0;

}
