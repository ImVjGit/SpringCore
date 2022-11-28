package Com.SpringSpELSpringExpressionLanguageDay16Yt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext cont = new ClassPathXmlApplicationContext("config.xml");

			Demo d =cont.getBean("demo",Demo.class);
			System.out.println(d);
	}
}
