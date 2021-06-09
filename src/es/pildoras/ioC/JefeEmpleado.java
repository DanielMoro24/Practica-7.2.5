package es.pildoras.ioC;

public class JefeEmpleado implements Empleados {
	
	private CrearcionInformes informeNuevo;
	

	public JefeEmpleado(CrearcionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {

		return "Gestiono las cuestiones relativas a mis empleados";

	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "informe presentado por el jefe con arreglos: " + informeNuevo.getInforme();
	}
}
