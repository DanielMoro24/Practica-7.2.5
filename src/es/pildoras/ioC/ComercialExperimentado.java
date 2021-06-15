package es.pildoras.ioC;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ComercialExperimentado implements Empleados {

	public ComercialExperimentado() {

	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "comercial";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "experimentado";
	}

}
