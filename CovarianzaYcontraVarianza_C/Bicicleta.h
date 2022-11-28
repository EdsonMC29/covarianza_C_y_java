#ifndef BICICLETA_H
#define BICICLETA_H
#include<iostream>
#include"Movilidad.h"
using namespace std;
class Bicicleta:public Movilidad{
  public:
    Bicicleta(string, int);
    void avanzar() override;
  protected:
    int tamRuedas;
};
#endif
