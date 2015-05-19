package com.jacobo.chp4.listeners;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ListenerRequestCambio
 *
 */
@WebListener
public class ListenerRequestCambio implements ServletRequestAttributeListener {

    /**
     * Default constructor. 
     */
    public ListenerRequestCambio() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent arg0)  { 
    	System.out.println("inicializada la peticion aqui tendra que tener"
    			+ "una logica de proceso o un objeto");
    	ServletRequest peticion = arg0.getServletRequest();
    	System.out.println(peticion.getAttribute("usuario"));

    }

	/**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(ServletRequestAttributeEvent arg0)  { 
         // TODO Auto-generated method stub
    }
	
}
