package empresa;

public class Supervisor extends Empleado {
	private String area;
	private int cantEmpleados;

	public Supervisor(int documento, String nombre, Direccion direccion) {
		super(documento, nombre, direccion);
		// TODO Auto-generated constructor stub
	}

	public Supervisor(int documento, String nombre, Direccion direccion, int legajo, int antiguedad, int sueldoBasico) {
		super(documento, nombre, direccion, legajo, antiguedad, sueldoBasico);
		// TODO Auto-generated constructor stub
	}

	public Supervisor(int documento, String nombre, Direccion direccion, String area, int cantEmpleados) {
		super(documento, nombre, direccion);
		this.area = area;
		this.cantEmpleados = cantEmpleados;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getCantEmpleados() {
		return cantEmpleados;
	}

	public void setCantEmpleados(int cantEmpleados) {
		this.cantEmpleados = cantEmpleados;
	}

	@Override
	public String toString() {
		return "Supervisor [area=" + area + ", cantEmpleados=" + cantEmpleados + "]";
	}

	@Override
	public double calculoSueldo() {
		if (cantEmpleados >= 1 && cantEmpleados <= 10) {
			return super.calculoSueldo() + (super.calculoSueldo() * 0.05);
		} else if (cantEmpleados >= 11 && cantEmpleados <= 20) {
			return super.calculoSueldo() + (super.calculoSueldo() * 0.2);
		} else {
			return super.calculoSueldo() + (super.calculoSueldo() * 0.3);
		}
	}

}
