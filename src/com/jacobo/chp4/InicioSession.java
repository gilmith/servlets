package com.jacobo.chp4;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class InicioSession
 */
@WebServlet("/InicioSession.do")
public class InicioSession extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private HttpServletRequest peticion;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InicioSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		System.out.println(usuario + " " + password);
		//le pido a la respuesta el inicio de sesion
		HttpSession sesionActual = request.getSession();
		//aqui tiene que disparar el evento y lo dispara
		synchronized(sesionActual){
			sesionActual.setAttribute("usuario", usuario);
			sesionActual.setAttribute("password", password);
		}
		
	}
	
	public HttpServletRequest getRequest(){
		return peticion;
	}

}
