package com.jacobo.chp4;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.jacobo.chp4.model.Dog;

/**
 * Application Lifecycle Listener implementation class DogListener
 *
 */
@WebListener
public class DogListener implements ServletContextListener {

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
    	ServletContext sc = arg0.getServletContext();
    	String dogBreed = sc.getInitParameter("breed");
    	Dog dog = new Dog(dogBreed);
    	sc.setAttribute("dog", dog);
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }
	
}
