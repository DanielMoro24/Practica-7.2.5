package es.pildoras.ioC;

public class SecretarioEmpleado implements Empleados {

	private CrearcionInformes informeNuevo;
	private String email;
	private String nomEmpresa;

	public void setInformeNuevo(CrearcionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

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

	@Override
	public String getTareas() {

		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {

		return "Informe generado por el secretario: " + informeNuevo.getInforme();
	}

}
