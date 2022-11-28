package Com.SpringImplementingLifecyclemethodsUsingXMLDay6Yt;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * using interface of AbstractApplicationContext to all init and destroy method 
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Device d =(Device)context.getBean("dev1");
		System.out.println(d);
		
		context.registerShutdownHook();//its called destroy method(or enable the destroy method ) 
		
	}
}
