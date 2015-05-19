package com.jacobo.chp4.listeners;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ListenerRequest
 *
 */
@WebListener
public class ListenerRequest implements ServletRequestListener {

    /**
     * Default constructor. 
     */
    public ListenerRequest() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent arg0)  { 
    	System.out.println("inicializada la peticion aqui tendra que tener"
    			+ "una logica de proceso o un objeto");
    	ServletRequest peticion = arg0.getServletRequest();
    	System.out.println(peticion.getAttribute("usuario"));
    }
}
