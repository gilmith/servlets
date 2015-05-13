<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.List"
    import="java.util.Iterator"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vamos a ver si me sale </title>
</head>
<body>
	<h1 align="center">el resultado del jsp es...</h1>
	<%
		Iterator it = ((List)request.getAttribute("styles")).iterator();
		while(it.hasNext()){
			out.println("<br> " + it.next());
		}	
	%>
	<br> El mensaje es ...
	<br>
	<%
		String mensaje = (String)request.getAttribute("tamanho");
		out.println("<br> " + mensaje);
	%>
</body>
</html>