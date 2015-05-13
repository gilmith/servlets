<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ahora me va a dar la hora con un jsp</title>
</head>
<body>
	<p align="center">
		<br>
		ahora me va a dar la hora con un jsp que es un java integrado en un html
		<br>
		<%= new Date() %>
	</p>

</body>
</html>