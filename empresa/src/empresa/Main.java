package empresa;

public class Main {

	public static void main(String[] args) {
		Direccion dir1 = new Direccion("trelew", "cambrin", 260,"9100");
		Direccion dir2 = new Direccion("trelew", "cambrin", 260,"9100");
		
		
		Empleado empleado1 = new Empleado(42316302,"joaquin", dir1,11990,10,15000 );
		
		Supervisor supervisor1 = new Supervisor(20541833,"julia",dir2,11954,25,18000);
		supervisor1.setArea("RRHH");
		supervisor1.setCantEmpleados(8);

	}

}
