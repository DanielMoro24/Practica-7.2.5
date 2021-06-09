package es.pildoras.ioC;

public class DirectorEmpleado implements Empleados {

	// creacion de campo CrecionInforme

	private CrearcionInformes informeNuevo;
	private String email;
	private String nomEmpresa;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomEmpresa() {
		return nomEmpresa;
	}

	public void setNomEmpresa(String nomEmpresa) {
		this.nomEmpresa = nomEmpresa;
	}

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
