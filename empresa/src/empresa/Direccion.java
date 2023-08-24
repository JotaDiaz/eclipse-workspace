package empresa;

public class Direccion {
	private String localidad;
	private String calle;
	private int altura;
	private String codigoPostal;

	

	public Direccion(String localidad, String calle, int altura, String codigoPostal) {
		this.localidad = localidad;
		this.calle = calle;
		this.altura = altura;
		this.codigoPostal = codigoPostal;
	}

	@Override
	public String toString() {
		return "Direccion [localidad=" + localidad + ", calle=" + calle + ", altura=" + altura + ", codigoPostal="
				+ codigoPostal + "]";
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

}
