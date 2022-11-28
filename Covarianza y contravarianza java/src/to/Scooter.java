package to;

public class Scooter extends Bicicleta implements Rueda{
    private int antiguedad;
    
	public Scooter(String propietario, int tamRuedas,int antiguedad) {
		super(propietario, tamRuedas);
		this.antiguedad = antiguedad;
	}
	
	@Override
	public void avanzar() {
		System.out.println("El Scooter avanza!");
	}

	@Override
	public String toString() {
		return "Scooter [antiguedad= " + antiguedad + ", tamanio de ruedas=" + numRuedas + "cm, propietario= " + propietario + "]";
	}
}
