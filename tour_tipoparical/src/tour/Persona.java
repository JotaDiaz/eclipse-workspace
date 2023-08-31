package tour;

import java.util.Objects;

public abstract class Persona {
	private String nombre;
	private String apellido;
	private int documento;
	private int edad;

	public Persona(String apellido, int documento) {
		super();
		this.apellido = apellido;
		this.documento = documento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", edad=" + edad
				+ "]";
	}


	
}
	
