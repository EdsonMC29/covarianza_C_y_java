package to;

public class Main {

	public static void main(String[] args) {
		Scooter sctr = new Scooter("Edson",6,1);
		Movilidad m = new Movilidad("Juan");
		Bicicleta b = new Scooter("Fulano",8,3);
		
		Joven j1 = new Joven("Percy", sctr);
		Joven j2 = new Joven("Jhon", m);
		Joven j3 = new Joven("Frank", b);
		
		j1.mostrarCovarianza();
		j2.mostrarContraCovarianza();
		j3.mostrarCovarianza2();
	}

}
