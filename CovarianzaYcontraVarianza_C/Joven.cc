#include "Joven.h"
#include <iostream>
#include<string>
using namespace std;

Joven::Joven(string n,Movilidad mov):Persona(n){
  m  = mov;
}

Joven::Joven(string n,Bicicleta bic):Persona(n){
  b  = bic;
}

Joven::Joven(string n,Scooter sct):Persona(n){
  s  = sct;
}

void Joven::avanzar(){
  cout<<"El joven "<<nombre<<" avanza"<<endl;
}

void Joven::mostrarCovarianza(){
  cout<<"COVARIANZA"<<endl;
  //s.avanzar();
}

