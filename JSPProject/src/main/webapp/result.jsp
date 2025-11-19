<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int num1 = Integer.parseInt( request.getParameter("a"));
	int num2 = Integer.parseInt(request.getParameter("b"));
	
%>
Sum of two values : <% out.println(num1+num2); %>


</body>
</html>