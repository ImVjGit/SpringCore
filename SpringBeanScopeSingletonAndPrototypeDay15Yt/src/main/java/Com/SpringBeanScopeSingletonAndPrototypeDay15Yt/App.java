package Com.SpringBeanScopeSingletonAndPrototypeDay15Yt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext cont = new ClassPathXmlApplicationContext("config.xml");
		Student s = (Student) cont.getBean("ob");
		Student s1 = (Student) cont.getBean("ob");
		System.out.println(s);
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());

		Teacher t = (Teacher) cont.getBean("tea1");
		System.out.println("teacher 1 obj : " + t.hashCode());
		Teacher t1 = (Teacher) cont.getBean("tea1");
		System.out.println("teacher 2 obj : " + t1.hashCode());
	}
}
