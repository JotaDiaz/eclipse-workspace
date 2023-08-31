package tour;

public class Lugares {
	private String nombre;
	private String ubicacion;
	private double costoEntrada;

	public Lugares(String nombre, String ubicacion, double costoEntrada) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.costoEntrada = costoEntrada;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public double getCostoEntrada() {
		return costoEntrada;
	}

	public void setCostoEntrada(double costoEntrada) {
		this.costoEntrada = costoEntrada;
	}

}
