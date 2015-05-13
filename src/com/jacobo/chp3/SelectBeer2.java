package com.jacobo.chp3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jacobo.chp3.model.BeerExpert;

/**
 * Servlet implementation class SelectBeer2
 */
@WebServlet(description = "Este es el servlet que usa el pojo", 
urlPatterns = { "/SelectBeer2.do" })
public class SelectBeer2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectBeer2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String c = request.getParameter("color");
		
		//si no le digo que el contenido de la respuesta es un html te devuelve cualquier cosa
		response.setContentType("text/html");
		BeerExpert be =  new BeerExpert();
		PrintWriter out = response.getWriter();
		List<String> resultado = be.getBrands(c);
		out.println("Beer Select Advice <br>");
		
		Iterator<String> it = resultado.iterator();
		while(it.hasNext()){
			out.println("<br> try : " + it.next());
		}
	}

}
