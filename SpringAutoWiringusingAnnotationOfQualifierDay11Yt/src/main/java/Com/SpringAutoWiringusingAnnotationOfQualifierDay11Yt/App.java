package Com.SpringAutoWiringusingAnnotationOfQualifierDay11Yt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Emp e = (Emp) context.getBean("emp1");
		System.out.println(e);
	}
}
