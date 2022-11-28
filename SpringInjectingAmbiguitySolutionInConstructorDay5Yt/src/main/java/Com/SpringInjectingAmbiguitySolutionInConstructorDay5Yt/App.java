package Com.SpringInjectingAmbiguitySolutionInConstructorDay5Yt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *solutoin is here : 
 *1 in construtor what ever we mention 1st datatype 
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Addtion ad = (Addtion) context.getBean("add");
		ad.dosum();

	}
}
