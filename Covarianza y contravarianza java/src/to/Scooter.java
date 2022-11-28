package to;

public class Scooter extends Bicicleta implements Rueda{
	public Scooter(){}
    private int antiguedad;
    
	public Scooter(int antiguedad) {
		super();
		this.antiguedad = antiguedad;
	}
	
	@Override
	public void avanzar() {
		System.out.println("El Scooter avanza!");
	}

	@Override
	public void detener() {
		System.out.println("El Scooter se detuvo!");	
	}
	
}
