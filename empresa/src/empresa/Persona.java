package empresa;

import java.util.Objects;

public class Persona {
	private int documento;
	private String nombre;
	private Direccion direccion;

	public Persona(int documento, String nombre, Direccion direccion) {
		this.documento = documento;
		this.nombre = nombre;
		this.direccion = direccion;

	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	
	

	@Override
	public int hashCode() {
		return Objects.hash(documento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return documento == other.documento;
	}

	@Override
	public String toString() {
		return "Persona [documento=" + documento + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
}
