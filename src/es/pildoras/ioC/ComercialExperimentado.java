package es.pildoras.ioC;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados {

	// ejecuci�n de c�digo despu�s de craci�n del Bean

	@PostConstruct
	public void ejecutaDespuesCreacion() {
		System.out.println("ejecuta tras creacion del bean");
	}

	// ejecuci�n de c�digo despu�s de apagado contenedor Spring

	@PreDestroy
	public void ejecutaAntesDestruccion() {
		System.out.println("ejecutando antes de la destruccion");
	}

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
