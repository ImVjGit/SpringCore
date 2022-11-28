package Com.SpringInjectingReferenceTypeDay3Yt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext cont = new ClassPathXmlApplicationContext("config.xml");

//		Person p = (Person) cont.getBean("perObj");
//		//Student s =(Student)cont.getBean("studObj");
//		System.out.println(p);
//		
//		System.out.println("\n data two");
		
		Person p1 = (Person) cont.getBean("perObj2");
		//Student s1 =(Student)cont.getBean("studObj2");
		System.out.println(p1);

	}

}
