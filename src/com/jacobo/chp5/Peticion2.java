package com.jacobo.chp5;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Peticion2
 */
@WebServlet("/Peticion2.do")
public class Peticion2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Peticion2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		HttpSession sesionActual = request.getSession();
		if(sesionActual.isNew()){
			System.out.println("es nueva");
			sesionActual.getAttribute("usuario");
		} else{
			System.out.println("no es nueva" + sesionActual.getAttribute("usuario"));
		}
	}

}
