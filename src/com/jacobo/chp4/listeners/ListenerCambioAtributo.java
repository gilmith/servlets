package com.jacobo.chp4.listeners;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import com.jacobo.chp4.InicioSession;

/**
 * Application Lifecycle Listener implementation class ListenerCambioAtributo
 *
 */
@WebListener
public class ListenerCambioAtributo implements HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public ListenerCambioAtributo() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0) {
    	if((arg0.getSession().getAttribute("usuario") != null) && (arg0.getSession().getAttribute("password") != null)){
    		System.out.println("la web se ha coscado de que han cambiado los atributos ");
    	}
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
         System.out.println("si estas leyendo esto es que esta reeemplanzando atributos");
    }
	
}
