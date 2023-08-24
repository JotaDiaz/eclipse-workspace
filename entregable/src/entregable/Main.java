package entregable;

public class Main {
	public static void main(String[] args) {

		Automovil auto = new Automovil();
		auto.setMarca("Ford");
		auto.setModelo("Focus");
		auto.setAño(2015);
		auto.setPatente("AA2645HH");
		auto.setColor(Color.negro);
		auto.setVelocidadMaxima(180);
		auto.toString();
		auto.arrancar();
		auto.acelerar(60);
		auto.frenar();

	}

}
