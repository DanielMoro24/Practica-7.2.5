package es.pildoras.ioC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {

		// creacion empleados

		// Empleados Empleado1 = new DirectorEmpleado();

		// uso objeto

		// System.out.println(Empleado1.getTareas());

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);

		// System.out.println(Juan.getTareas());
		// System.out.println(Juan.getInforme());

		/*
		 * SecretarioEmpleado Maria = contexto.getBean("miSecretario",
		 * SecretarioEmpleado.class); SecretarioEmpleado Pablo =
		 * contexto.getBean("miSecretario", SecretarioEmpleado.class);
		 * 
		 * System.out.println(Maria.getTareas());
		 * System.out.println(Maria.getInforme());
		 * 
		 * System.out.println("Email: "+Maria.getEmail());
		 * System.out.println(Maria.getNomEmpresa());
		 * 
		 * System.out.println("Email Pablo: "+Pablo.getEmail());
		 */

		DirectorEmpleado Juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);

		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
		System.out.println(Juan.getEmail());
		System.out.println(Juan.getNomEmpresa());

		contexto.close();

	}

}
