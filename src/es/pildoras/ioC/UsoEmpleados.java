package es.pildoras.ioC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {

		// creacion empleados

		// Empleados Empleado1 = new DirectorEmpleado();

		// uso objeto

		// System.out.println(Empleado1.getTareas());

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		//Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);

		//System.out.println(Juan.getTareas());
		//System.out.println(Juan.getInforme());
		
		Empleados Maria = contexto.getBean("miSecretario", Empleados.class);
		
		System.out.println(Maria.getTareas());
		System.out.println(Maria.getInforme());

		contexto.close();

	}

}
