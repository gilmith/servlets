package com.jacobo.chp3;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jacobo.chp3.model.BeerExpert;
import com.jacobo.chp3.model.BeerExpert2;

/**
 * Servlet implementation class SelectBeer4
 */
@WebServlet(description = "este es con dos opciones para que pille las dos",
	urlPatterns = { "/SelectBeer4.do" })
public class SelectBeer4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectBeer4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//extraigo los datos de la web
		String color = request.getParameter("color");
		String tamanho = request.getParameter("tamanho");
		BeerExpert be = new BeerExpert();
		BeerExpert2 be2 = new BeerExpert2(tamanho);
		List result = be.getBrands(color);
		String mensaje = be2.getPedo();
		request.setAttribute("styles", result);
		request.setAttribute("tamanho",mensaje);
		//una seteado y extraido los atributos tengo que llamar al jsp
		RequestDispatcher view = request.getRequestDispatcher("/Beer/JSPs/result2.jsp");
		view.forward(request, response);
	}

}
