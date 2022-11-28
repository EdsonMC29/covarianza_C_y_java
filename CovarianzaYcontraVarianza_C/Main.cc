#include "Movilidad.h"
#include "Bicicleta.h"
#include "Scooter.h"
#include "Persona.h"
#include "Joven.h"
#include <iostream>

using namespace std;

int main(int argc, char *argv[]){

  Bicicleta *b = new Bicicleta("Juan", 6);
  b->avanzar();
  
  Scooter *s = new Scooter("Fulano", 6, 2);
  s->avanzar();
  
  Joven *j = new Joven("Edson",*b);
  j->mostrarCovarianza();
  return 0;
};
