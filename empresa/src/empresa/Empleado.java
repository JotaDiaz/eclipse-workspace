package empresa;

public class Empleado extends Persona {
	private int legajo;
	private int antiguedad;
	private int sueldoBasico;
	
	

	public Empleado(int documento, String nombre, Direccion direccion) {
		super(documento, nombre, direccion);
		
	}

	public Empleado(int documento, String nombre, Direccion direccion, int legajo, int antiguedad,int sueldoBasico) {
        super(documento, nombre, direccion); 
        this.legajo = legajo;
        this.antiguedad = antiguedad;
        this.sueldoBasico = sueldoBasico;
      
}

public double calculoSueldo () {
	return sueldoBasico * antiguedad;
}

public int getLegajo() {
	return legajo;
}

public void setLegajo(int legajo) {
	this.legajo = legajo;
}

public int getAntiguedad() {
	return antiguedad;
}

public void setAntiguedad(int antiguedad) {
	this.antiguedad = antiguedad;
}

public int getSueldoBasico() {
	return sueldoBasico;
}

public void setSueldoBasico(int sueldoBasico) {
	this.sueldoBasico = sueldoBasico;
}

@Override
public String toString() {
	return "Empleado [legajo=" + legajo + ", antiguedad=" + antiguedad + ", sueldoBasico=" + sueldoBasico + "]";
}


}
