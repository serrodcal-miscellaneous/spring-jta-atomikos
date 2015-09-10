package org.sergio.jtaSpringProject;

import java.util.LinkedList;
import java.util.List;

import org.sergio.jtaSpringProject.entities.Person;
import org.sergio.jtaSpringProject.services.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static final Logger logger = Logger.getLogger(App.class);
	
    public static void main( String[] args ) throws InterruptedException
    {
		if(logger.isTraceEnabled()){
			logger.trace("BEGIN MAIN: main( String[] args )");
		}
//        System.out.println( "Test Execution" );
//        System.out.println("---------------");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        if(context != null){
        	if(logger.isTraceEnabled()){
    			logger.trace("context");
    		}
	        PersonService personService = (PersonService) context.getBean("personService");
	        
	        Person person = new Person();
	        person.setName("Sergio");
	        
	        personService.save(person);
        }else{
        	logger.error("Cannot get context");
        }
        
//        System.out.println("---------------");
//        System.out.println( "End Test Execution" );
        if(logger.isTraceEnabled()){
			logger.trace("END MAIN");
		}
    }
	
	
}
