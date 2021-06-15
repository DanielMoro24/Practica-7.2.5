package es.pildoras.ioC;

public class DirectorFinanciero implements Empleados {

	private CrearcionInformes InformeFinanciero;

	public DirectorFinanciero(CrearcionInformes informeFinanciero) {
		InformeFinanciero = informeFinanciero;
	}

	@Override
	public String getTareas() {

		return "Gestion y direccion financiera";
	}

	@Override
	public String getInforme() {

		return InformeFinanciero.getInforme();
	}

}
