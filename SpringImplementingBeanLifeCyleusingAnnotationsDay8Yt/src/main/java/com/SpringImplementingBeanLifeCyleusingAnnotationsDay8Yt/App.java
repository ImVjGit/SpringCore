package com.SpringImplementingBeanLifeCyleusingAnnotationsDay8Yt;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * how to use and create 
 * 1 add dependency of Annotation 
 * 2 create method in .java class and mention Annotation
 * 3 active configuration Annotation tag simple go to config.xml file and mention tag  
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext  context= new ClassPathXmlApplicationContext("config.xml");
        GameBox g =(GameBox)context.getBean("gm1");
        System.out.println(g);
        
        context.registerShutdownHook();
    }
}
