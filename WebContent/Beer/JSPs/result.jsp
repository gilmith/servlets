<!-- con esto lo que hago es configurar la pagina para que sea web y tenga un lenguaje adecuado -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Beer advice</title>
</head>
<body>
<h1 align="center">Beer Recomendations</h1>
<!-- aqui le incrusto el codigo java -->
<%
	List styles = (List)request.getAttribute("styles");
	Iterator it = styles.iterator();
	while(it.hasNext()){
		out.println("<br> try : " + it.next());
	}

%>

</body>
</html>