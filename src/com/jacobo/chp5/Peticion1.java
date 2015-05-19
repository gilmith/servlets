package com.jacobo.chp5;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Peticion1
 */
@WebServlet("/Peticion1.do")
public class Peticion1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		HttpSession sesionActual = request.getSession();
		if(sesionActual.isNew()){
			System.out.println("sesion nueva, ahora tengo que llamar al jsp");
			sesionActual.setAttribute("usuario", request.getParameter("usuario"));
			sesionActual.setAttribute("password", request.getParameter("password"));
			RequestDispatcher view = request.getRequestDispatcher("/Beer/JSPs/Peticion1.jsp");
			view.forward(request, response);
		}else{
			System.out.println("la sesion no es nueva");
			sesionActual.setAttribute("usuario", request.getParameter("usuario"));
			sesionActual.setAttribute("password", request.getParameter("password"));
			RequestDispatcher view = request.getRequestDispatcher("/Beer/JSPs/Peticion1.jsp");
			view.forward(request, response);
		}
		
		
		
	}

}
