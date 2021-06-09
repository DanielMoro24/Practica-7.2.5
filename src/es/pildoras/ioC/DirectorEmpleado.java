package es.pildoras.ioC;

public class DirectorEmpleado implements Empleados {

	// creacion de campo CrecionInforme

	private CrearcionInformes informeNuevo;

	// creacion de constructor que inyecta la dependencia

	public DirectorEmpleado(CrearcionInformes informeNuevo) {

		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {

		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {

		return "informe creado por el director: " + informeNuevo.getInforme();
	}

}
