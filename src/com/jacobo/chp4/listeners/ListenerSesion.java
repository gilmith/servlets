package com.jacobo.chp4.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class ListenerSesion
 *
 */
@WebListener
public class ListenerSesion implements HttpSessionListener {

	private int contadorSesiones;
	
	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  {
    	contadorSesiones++;
    	System.out.println("sesion creada id = " + arg0.getSession().getId());
    	System.out.println("numero de sesiones actuales en el apache = " + contadorSesiones);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  {
    	contadorSesiones--;
    	System.out.println("sesion finalizada  = " + arg0.getSession().getLastAccessedTime() + " "
    			+ arg0.getSession().getId());
    }
	
}
