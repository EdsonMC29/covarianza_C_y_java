package to;

public class Joven extends Persona{
	private Movilidad movilidad;
	private Bicicleta bicicleta;
	private Scooter scooter;
	
	Joven(String nombre, Movilidad movilidad) {
		super(nombre);
		this.movilidad = movilidad;
	}
	
	Joven(String nombre, Scooter scooter) {
		super(nombre);
		this.scooter = scooter;
	}
	
	Joven(String nombre, Bicicleta bicicleta) {
		super(nombre);
		this.bicicleta = bicicleta;
	}
	
	public void mostrarContraCovarianza() {
		System.out.println("CONTRACOVARIANZA");
		System.out.print(nombre +" usa la " + movilidad.toString() + "asi que: ");
		movilidad.avanzar();
	}
	
	public void mostrarCovarianza() {
		System.out.println("COVARIANZA");
		System.out.print(nombre +" usa un(a) " + scooter.toString() + " asi que: ");
		scooter.avanzar();
	}
	public void mostrarCovarianza2() {
		System.out.println("COVARIANZA");
		System.out.print(nombre +" usa un(a) " + bicicleta.toString() + " asi que: ");
		bicicleta.avanzar();
	}
}
