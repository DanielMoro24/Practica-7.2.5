package es.pildoras.ioC;

public class SecretarioEmpleado implements Empleados {

	private CrearcionInformes informeNuevo;

	public void setInformeNuevo(CrearcionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {

		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {

		return "Informe generado por el secretario: " + informeNuevo.getInforme();
	}

}
