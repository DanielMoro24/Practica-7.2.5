package es.pildoras.ioC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseAnnotation2 {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		Empleados Antonio = contexto.getBean("comercialExperimentado", Empleados.class);
		Empleados Lucia = contexto.getBean("comercialExperimentado", Empleados.class);

		// ¿apuntan al mismo objetto en memoria?

		if (Antonio == Lucia) {
			System.out.println("Apuntan al mismo lugar en memoria");
			System.out.println(Antonio + "\n" + Lucia);
		} else {
			System.out.println("No apuntan al mismo lugar en memoria");
			System.out.println(Antonio + "\n" + Lucia);
		}

		contexto.close();

	}

}
