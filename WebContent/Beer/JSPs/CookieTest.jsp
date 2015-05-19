<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="javax.servlet.http.Cookie"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Seguimiento de una cookie entre webs</title>
</head>
<body>
	<h1 aign="center">
		vamos a ver los valores de la cookie
		<%
			Cookie[] arrayCookies = request.getCookies();
			for(Cookie cookieActual : arrayCookies){
				out.println("<br> el nombre de la cookie actual es " + cookieActual.getName() +
						" el valor es " + cookieActual.getValue() + " esta en la ruta " + cookieActual.getPath());
			}
		%>
		<%= arrayCookies[0].getName() %>
	</h1>

</body>
</html>