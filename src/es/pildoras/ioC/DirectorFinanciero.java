package es.pildoras.ioC;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {

	private CrearcionInformes InformeFinanciero;

	@Value("${email}")
	private String email;

	@Value("${nombreEmpresa}")
	private String nombreEmpresa;

	public DirectorFinanciero(CrearcionInformes informeFinanciero) {
		InformeFinanciero = informeFinanciero;
	}

	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
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
