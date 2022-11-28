package to;

public class Movilidad implements Rueda{
	protected String propietario;
	
	public Movilidad(String propietario) {
		this.propietario = propietario;
	}

	@Override
	public void avanzar() {
		System.out.println("La Movilidad Avanza");	
	}
	@Override
	public String toString() {
		return "Movilidad [propietario=" + propietario + "]";
	}
	
}
