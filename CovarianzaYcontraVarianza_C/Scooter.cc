#include "Scooter.h"
#include<iostream>
#include<string>
using namespace std;

Scooter::Scooter(string p,int r,int a):Bicicleta(p,r){
  antiguedad = a;
}

void Scooter::avanzar(){
  cout<<"El Scooter de "<<propietario<<" con ruedas de tamanio "<<tamRuedas<<"cm."
  <<"de antiguedad de "<<antiguedad<<" año(s) Avanza!"<<endl;
}
