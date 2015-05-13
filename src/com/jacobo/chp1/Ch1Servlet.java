package com.jacobo.chp1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ch1Servlet
 */
@WebServlet("/Ch1Servlet")
public class Ch1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ch1Servlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * a ser subclase de HttpServlet hereda directamente este metodo.
	 * El objeto de respuesta a la peticion puede devolver un singleton PrintWriter
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PrintWriter out  = response.getWriter();
		Date today = new Date();
		out.println("<html>" + "<body>" +
					"<h1 align=center> Capitulo 1 mostrar la hora como un servlet </h1>" +
					"<br>" + today + "</body>" + "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
