package Com.SpringAddingDependDay1Yt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * setter injection 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        Student stud =(Student)context.getBean("studnet1");
        Student studwithValue = (Student)context.getBean("studnet2");
        Student studwithPScahema = (Student)context.getBean("studnet3");
        
        System.out.println("nomral 1 :"+ stud);
        System.out.println("2nd with Value attribute : "+studwithValue);
        System.out.println("#rd with pScahema : "+ studwithPScahema);
        
    }
}
