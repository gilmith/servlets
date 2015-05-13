package com.jacobo.chp3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SelectBeer5
 */
@WebServlet(description = "vamos a ver con otro selector", urlPatterns = { "/SelectBeer5.do" })
public class SelectBeer5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectBeer5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String[] one = request.getParameterValues("size");
		request.setAttribute("lista", one);
		RequestDispatcher view = request.getRequestDispatcher("/Beer/JSPs/result3.jsp");
		view.forward(request, response);
	}

}
