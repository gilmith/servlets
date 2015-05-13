package com.jacobo.chp3;

import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jacobo.chp3.model.BeerExpert;

/**
 * Servlet implementation class SelectBeer3
 * esta es la version que llama internamente a un jsp
 */
@WebServlet("/SelectBeer3.do")
public class SelectBeer3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Logger log;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectBeer3() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init(){
    	log = Logger.getLogger(this.getClass().getName());
    	try {
			log.addHandler(new FileHandler("/tmp/SelectBeer3.log"));
			log.info("inicializado el servlet");
		} catch (SecurityException | IOException e) {
			System.out.println("error al inicialiar el log");
			e.printStackTrace();
		}
    }
    
 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String color = request.getParameter("color");
		/**
		 * objeto modelo
		 */
		log.info("inicializado el pojo plain old java object");
		BeerExpert be = new BeerExpert();
		List result = be.getBrands(color);
		
		/**
		 * hasta aqui es igual que llamar todo con un servlet pero el servlet tiene que gestionar la peticion
		 * ahora es cuando tengo que llamar a un objeto vista
		 * El atributo que usa el jsp se le marca en el request le doy un nombre y un objeto que manejar
		 * sytles es el nombre que tomara en el jsp el List  
		 */
		request.setAttribute("styles", result);
		/**
		 * ahora le marco un manejador de peticion con el jsp asociado, ojo que las rutas tienen que cuadrar
		 * sino te da un error 404 que quiere decir que no encuentra el archivo
		 */
		RequestDispatcher view = request.getRequestDispatcher("/Beer/JSPs/result.jsp");
		/**
		 * le indico la respuesta y la peticion
		 */
		log.info("lanzando el jsp");
		view.forward(request, response);
	}

}
