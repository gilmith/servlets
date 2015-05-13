<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>vamos a ver </title>
</head>
<body>

<%
	String resultadoExtraido = request.getAttribute("lista").toString();
	out.println("<br>" + resultadoExtraido);
%>

<br> ahora voy a pedir un parametro de contexto que es accesible desde cualquier punto

<%
	ServletContext contexto = getServletContext();
	String cadenaContexto = contexto.getInitParameter("parametroContexto1");
	out.println("<br> he extrado el parametro de contexto = " + cadenaContexto);
%>


</body>
</html>