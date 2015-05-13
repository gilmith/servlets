package com.jacobo.chp4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jacobo.chp4.model.Dog;

/**
 * Servlet implementation class ParametroInicio
 */
//@WebServlet("/ParametroInicio.do")
public class ParametroInicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static String parametro;
    private static ServletConfig config;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		this.config = config;
		parametro = config.getInitParameter("inicio1");
		System.out.println("ha extraido solo una vez el parametro de inicio " + parametro);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Dog dog =(Dog) getServletContext().getAttribute("dog");
		out.println("<html><body><br>" + parametro + "<br>" + dog.getBreed() + "</body></html>");
		
	}

}
