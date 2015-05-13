package com.jacobo.chp3;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SelectBeer
 */
@WebServlet(description = "Servlet modelo para realizar la respuesta con un jsp extrayendo los datos con un pojo", 
urlPatterns = { "/SelectBeer.do" })
public class SelectBeer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectBeer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * request es la peticion que recoge de un formulario web
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Beer Selection Advice <br>");
		//en el request pido lo que se he marcado en el formulario
		String c = request.getParameter("color");
		out.println("<br>Got Beer color " + c);
	}

}
