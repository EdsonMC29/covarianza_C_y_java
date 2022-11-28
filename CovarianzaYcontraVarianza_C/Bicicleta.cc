#include"Bicicleta.h"
#include<iostream>
#include<string>
using namespace std;

Bicicleta::Bicicleta(string p,int r):Movilidad(p){
  tamRuedas = r;
}

void Bicicleta::avanzar(){
  cout<<"La bicicleta de "<<propietario<<" con ruedas de tamanio "<<tamRuedas<<"cm. Avanza!"<<endl;
}
