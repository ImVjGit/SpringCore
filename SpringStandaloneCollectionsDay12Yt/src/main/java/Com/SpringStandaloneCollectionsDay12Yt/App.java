package Com.SpringStandaloneCollectionsDay12Yt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");

		Person p = (Person) con.getBean("person1");
		System.out.println(p);
		System.out.println(p.getFriends().getClass().getName());

		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(p.getFeestructre());
		System.out.println(p.getFeestructre().getClass().getName());

		System.out.println("++++++++++++++++++++++++++++++++++++++++");

		System.out.println(p.getPropertiesInClass());
	}
}
