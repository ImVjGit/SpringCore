package com.SpringAutoWiringusingAnnotationOfAutowiredDay10Yt;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context =
    	new ClassPathXmlApplicationContext("config.xml");
        
        Emp e = (Emp)context.getBean("emp1");
        System.out.println(e);
    }
}
