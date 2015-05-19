package com.jacobo.chp5;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SigueCookie
 */
@WebServlet("/SigueCookie.do")
public class SigueCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Cookie[] arrayCookies = request.getCookies();
		Cookie nueva = new Cookie("valor", request.getParameter("valor"));
		for(Cookie cookieActual : arrayCookies){
			System.out.println("analizando el valor de la cookie en la peticion "
					+ cookieActual.getName() + " = " + cookieActual.getValue());
		}
		
		nueva.setMaxAge(80);
		response.addCookie(nueva);
		
		RequestDispatcher view  = request.getRequestDispatcher("/Beer/JSPs/CookieTest.jsp");
		view.forward(request, response);
		
	
	
	}

}
