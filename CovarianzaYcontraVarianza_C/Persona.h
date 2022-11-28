#ifndef PERSONA_H
#define PERSONA_H
#include<iostream>
#include<string>
using namespace std;
class Persona{
  public:
    Persona();
    Persona(string);
    virtual void avanzar()=0;
  protected:
    string nombre;
};
#endif
