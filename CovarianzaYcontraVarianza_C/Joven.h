#ifndef JOVEN_H
#define JOVEN_H
#include<iostream>
#include "Persona.h"
#include "Movilidad.h"
#include "Bicicleta.h"
#include "Scooter.h"

using namespace std;
class Joven:public Persona{
  public:
    Joven(string, Movilidad);
    Joven(string, Bicicleta);
    Joven(string, Scooter);
    void avanzar() override;
    void mostrarCovarianza();
    
  private:
    Movilidad m =null;
    Bicicleta b=null;
    Scooter s=null;
};
#endif
