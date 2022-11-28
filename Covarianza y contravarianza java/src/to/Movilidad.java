package to;

public class Movilidad {
	protected String propietario;
	
	public Movilidad(String propietario) {
		this.propietario = propietario;
	}
	public Movilidad() {}
	public void mostrarPropietario() {
		System.out.println("Propietario: " + propietario);
	}
}
