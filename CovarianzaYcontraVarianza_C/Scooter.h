#ifndef SCOOTER_H
#define SCOOTER_H
#include<iostream>
#include"Bicicleta.h"
using namespace std;
class Scooter:public Bicicleta{
  public:
    Scooter(string, int,int);
    void avanzar() override;
  protected:
    int antiguedad;
};
#endif
