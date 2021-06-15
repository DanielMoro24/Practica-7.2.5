package es.pildoras.ioC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("es.pildoras.ioC")
public class EmpleadosConfig {

	// definir el bean para InformeFinancieroDtoCompras

	@Bean
	public CrearcionInformes informeFinancieroDtoCompras() { // id del bean inyectado
		return new InformeFinancieroDtoCompras();

	}

	// definir el bean para DirectorFinanciero e inyectar dependencias

	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDtoCompras());

	}

}
