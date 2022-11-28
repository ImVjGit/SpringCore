package Com.SpringImplementingBeanLifeCycleUsingInterfacesDay7Yt;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *using interface 
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// automatically call both method bcz interface

		Toy t = (Toy) context.getBean("toy1");
		System.out.println(t);

		context.registerShutdownHook();

	}
}
