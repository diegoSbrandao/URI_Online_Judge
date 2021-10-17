#include<stdio.h>
int main()
{
    int dia, diafim, hora, horafim, minuto, minutofinal, segundo, segundofinal;
    char aux [4], c;

    scanf("%s %d", &aux, &dia);
    scanf("%d %c %d %c %d", &hora, &c, &minuto, &c, &segundo);
    scanf("%s %d", &aux, &diafim);
    scanf("%d %c %d %c %d", &horafim, &c, &minutofinal, &c, &segundofinal);


    segundo = segundofinal - segundo;
    minuto = minutofinal - minuto;
    hora = horafim - hora;
    dia = diafim - dia;

    if (segundo < 0)
    {
        segundo += 60;
        minuto--;
    }

    if (minuto < 0)
    {
        minuto += 60;
        hora--;
    }

    if (hora < 0)
    {
        hora += 24;
        dia--;
    }

    printf("%d dia(s)\n", dia);
    printf("%d hora(s)\n", hora);
    printf("%d minuto(s)\n", minuto);
    printf("%d segundo(s)\n", segundo);
}
