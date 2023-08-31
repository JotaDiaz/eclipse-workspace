package tour;

public class Guia extends Persona {
	private String nombre;
	private int dni;
	private int cuil;
	private String fechaIngreso;
	private int numeroMatricula;
	
	
	public Guia(String apellido, int documento, int cuil) {
		super(apellido, documento);
		this.cuil = cuil;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public int getCuil() {
		return cuil;
	}


	public void setCuil(int cuil) {
		this.cuil = cuil;
	}


	public String getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	public int getNumeroMatricula() {
		return numeroMatricula;
	}


	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
}


	


