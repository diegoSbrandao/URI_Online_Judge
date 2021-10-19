#include <iostream>

using namespace std;

int main() {

    double valor,D,E;

    int nota,b,d,f,h,j,B,m,o,q,s;

    int cem,cinquenta,vinte,dez,cinco,dois,m_um,m_cinquenta,m_vintecinco,m_dez,m_cinco,m_umcent;

    cin>>valor;

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

    cout<<"NOTAS:"<<endl;
    cout<<cem<<" nota(s) de R$ 100.00"<<endl;
    cout<<cinquenta<<" nota(s) de R$ 50.00"<<endl;
    cout<<vinte<<" nota(s) de R$ 20.00"<<endl;
    cout<<dez<<" nota(s) de R$ 10.00"<<endl;
    cout<<cinco<<" nota(s) de R$ 5.00"<<endl;
    cout<<dois<<" nota(s) de R$ 2.00"<<endl;

    cout<<"MOEDAS:"<<endl;
    cout<<m_um<<" moeda(s) de R$ 1.00"<<endl;
    cout<<m_cinquenta<<" moeda(s) de R$ 0.50"<<endl;
    cout<<m_vintecinco<<" moeda(s) de R$ 0.25"<<endl;
    cout<<m_dez<<" moeda(s) de R$ 0.10"<<endl;
    cout<<m_cinco<<" moeda(s) de R$ 0.05"<<endl;
    cout<<m_umcent<<" moeda(s) de R$ 0.01"<<endl;

   return 0;
}



