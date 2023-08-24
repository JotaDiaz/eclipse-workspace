package entregable;

public class Automovil {
	private String marca;
	private String modelo;
	private int año;
	private String patente;
	private Color color;
	private int velocidadMaxima;

	public Automovil() {

	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		if (velocidadMaxima < 0)
			velocidadMaxima = 0;
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public String toString() {
		return marca + " " + modelo + " - " + "patente " + patente;
	}

	public void arrancar() {
		System.out.println("Encendiendo el " + toString());
	}

	public void acelerar(int velocidadMaxima) {
		if (velocidadMaxima < 0)
			velocidadMaxima = 0;
		System.out.println("Avanzando a " + velocidadMaxima + " km/h");

	}

	public void frenar() {
		System.out.println("Frenando");
	}

}
