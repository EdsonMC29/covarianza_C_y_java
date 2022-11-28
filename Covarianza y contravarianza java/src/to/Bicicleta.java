package to;

public class Bicicleta extends Movilidad implements Rueda{
	protected int numRuedas;
	
	public Bicicleta(String propietario, int numRuedas) {
		super(propietario);
		this.numRuedas = numRuedas;
	}

	@Override
	public void avanzar() {
		System.out.println("La Bicicleta avanza!");
	}
}
