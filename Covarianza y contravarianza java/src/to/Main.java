package to;

public class Main {

	public static void main(String[] args) {
		Movilidad mov = new Movilidad("Edson");
		Bicicleta bici = new Bicicleta();
		Scooter sctr = new Scooter();
		
		mov.mostrarPropietario();
		bici.avanzar();
		sctr.avanzar();
	}

}
