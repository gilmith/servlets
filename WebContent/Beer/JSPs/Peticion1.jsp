<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Este es el resultado de la primera peticion</title>
</head>
<body>
	<h1 align="center">
		El usuario y la password son <br>
		<%
			HttpSession sesionActual = request.getSession();
			out.println("<br>" + sesionActual.getAttribute("usuario"));
			out.println("<br>" + sesionActual.getAttribute("password"));
		%>
	</h1>
	Ahora viene la nueva peticion que tiene que conservar la anterior.
	<h1 align="center">
	<form action="/HeadFirst/Peticion2.do" method="post">
		selector :<br>
		<select>
			<option value="valor1">valor1</option>
			<option value="valor2">valor2</option> 
		</select>
		<input type="submit">
	</form>
	</h1>


</body>
</html>