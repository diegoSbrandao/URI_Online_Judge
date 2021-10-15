#include <stdio.h>
#include <stdlib.h>

int main()

{

    double valor,D,E;

    int nota,b,d,f,h,j,B,m,o,q,s;

    int cem,cinquenta,vinte,dez,cinco,dois;

    int m_um,m_cinquenta,m_vintecinco,m_dez,m_cinco,m_umcent;

    scanf ("%lf",&valor);

    nota=valor;

    cem=nota/100;

    b=nota%100;

    cinquenta=b/50;

    d=b%50;

    vinte=d/20;

    f=d%20;

    dez=f/10;

    h=f%10;

    cinco=h/5;

    j=h%5;

    dois=j/2;

    m_um=j%2;

    E=valor*100;

    B=(int) E;

    m=B%100;

    m_cinquenta=m/50;

    o=m%50;

    m_vintecinco=o/25;

    q=o%25;

    m_dez=q/10;

    s=q%10;

    m_cinco=s/5;

    m_umcent=s%5;

    printf ("NOTAS:\n");

    printf ("%d nota(s) de R$ 100.00\n",cem);

    printf ("%d nota(s) de R$ 50.00\n",cinquenta);

    printf ("%d nota(s) de R$ 20.00\n",vinte);

    printf ("%d nota(s) de R$ 10.00\n",dez);

    printf ("%d nota(s) de R$ 5.00\n",cinco);

    printf ("%d nota(s) de R$ 2.00\n",dois);

    printf ("MOEDAS:\n");

    printf ("%d moeda(s) de R$ 1.00\n",m_um);

    printf ("%d moeda(s) de R$ 0.50\n",m_cinquenta);

    printf ("%d moeda(s) de R$ 0.25\n",m_vintecinco);

    printf ("%d moeda(s) de R$ 0.10\n",m_dez);

    printf ("%d moeda(s) de R$ 0.05\n",m_cinco);

    printf ("%d moeda(s) de R$ 0.01\n",m_umcent);

    return 0;

}
