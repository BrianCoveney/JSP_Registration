<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

int number1 = Integer.parseInt(request.getParameter("n1"));
int number2 = Integer.parseInt(request.getParameter("n2"));

out.println(" Sum is " + (number1 + number2));

%>


</body>
</html>