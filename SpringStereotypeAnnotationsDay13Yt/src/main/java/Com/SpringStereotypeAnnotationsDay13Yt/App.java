package Com.SpringStereotypeAnnotationsDay13Yt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext cont=
       new ClassPathXmlApplicationContext("config.xml");
    	Student s =(Student)cont.getBean("ob");
    	System.out.println(s);
    }
}
