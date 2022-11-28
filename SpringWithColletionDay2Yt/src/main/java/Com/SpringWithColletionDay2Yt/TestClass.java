package Com.SpringWithColletionDay2Yt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main(String[] args) {
		 ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
	System.out.println("Run .....");
	Emp emp = (Emp)context.getBean("emp1");
	System.out.println(emp);
	
	
	
	}
}
