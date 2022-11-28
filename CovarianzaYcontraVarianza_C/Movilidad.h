#ifndef MOVILIDAD_H
#define MOVILIDAD_H
#include<iostream>
#include<string>
using namespace std;
class Movilidad{
  public:
    Movilidad();
    Movilidad(string);
    virtual void avanzar()=0;
  protected:
    string propietario;
};
#endif
