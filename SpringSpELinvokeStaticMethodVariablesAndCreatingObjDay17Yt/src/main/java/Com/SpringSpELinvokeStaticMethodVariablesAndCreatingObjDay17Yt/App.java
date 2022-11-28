package Com.SpringSpELinvokeStaticMethodVariablesAndCreatingObjDay17Yt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext cont = new ClassPathXmlApplicationContext("config.xml");

			Demo d =(Demo)cont.getBean("ob");
			System.out.println(d);
	}
}
