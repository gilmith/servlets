package com.jacobo.chp4;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Beer8
 */
@WebServlet(description = "Este servlet no hara nada mas que llamar a un jsp con un mensaje", 
urlPatterns = { "/Beer8.do" })
public class Beer8 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("al dar el boton ya se cosca de que se le han pasado unos atributos");
		request.setAttribute("usuario", request.getParameter("usuario"));
		RequestDispatcher view = request.getRequestDispatcher("/Beer/JSPs/result5.jsp");
		view.forward(request, response);

	}

}
