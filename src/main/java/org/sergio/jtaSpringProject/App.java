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
	
    public static void main( String[] args )
    {
		if(logger.isDebugEnabled()){
			logger.debug("Init POC");
		}
        System.out.println( "Test Execution" );
        System.out.println("---------------");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        if(context != null){
        	if(logger.isDebugEnabled()){
    			logger.debug("Get context");
    		}
	        PersonService personService = (PersonService) context.getBean("personService");
	        
	        Person person = new Person();
	        person.setName("Sergio");
	        
	        personService.save(person);
        }else{
        	logger.error("Cannot get context");
        }
        
        System.out.println("---------------");
        System.out.println( "End Test Execution" );
        if(logger.isDebugEnabled()){
			logger.debug("EndPoc");
		}
    }
	
	
}
