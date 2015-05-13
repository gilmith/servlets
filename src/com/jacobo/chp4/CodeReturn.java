package com.jacobo.chp4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CodeReturn
 */
@WebServlet(description = "Este es el servlet de una descarga de un archivo zip", 
urlPatterns = { "/CodeReturn.do" })
public class CodeReturn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CodeReturn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("application/x-zip");
		ServletContext contexto = this.getServletContext();
		//la descarga de un fichero es un stream de entrada de lectura del fichero la entrada se le pide 
		//al contexto
		FileInputStream fis = new FileInputStream(new File("/home/jake/practicaJacoboGeada.zip"));
		int read = 0;
		byte[] bytes = new byte[1024];
		//y un stream de salida del fichero
		OutputStream out = response.getOutputStream();
		while((read = fis.read(bytes)) != -1){
			out.write(bytes, 0, read);
		}
		out.flush();
		out.close();
	}

}
