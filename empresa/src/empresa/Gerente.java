package empresa;

public class Gerente extends Empleado {
	private String areaGerenciada;
	private int comision;

	public Gerente(int documento, String nombre, Direccion direccion) {
		super(documento, nombre, direccion);
		// TODO Auto-generated constructor stub
	}

	public Gerente(int documento, String nombre, Direccion direccion, String areaGerenciada, int comision) {
		super(documento, nombre, direccion);
		this.areaGerenciada = areaGerenciada;
		this.comision = comision;
	}

	public String getAreaGerenciada() {
		return areaGerenciada;
	}

	public void setAreaGerenciada(String areaGerenciada) {
		this.areaGerenciada = areaGerenciada;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(int comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return "Gerente [areaGerenciada=" + areaGerenciada + ", comision=" + comision + "]";
	}
	
	@Override 
	public double calculoSueldo() {
		return super.calculoSueldo() + (super.calculoSueldo()* comision);
	}

}
