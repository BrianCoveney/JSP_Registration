<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Tutorial</title>
</head>
<body>

<!-- Scriptlet for writing java -->
<% 
int a = 3;
out.println("<b>the value of a is </b>" + a + "<br>");
%>

<!-- Scriptlet declaration tag (takes methods) -->
<%! 
int b = 4;
void show(){
	System.out.println("the value of b is " + b);
}
%>

<%=
"sum is " + (3+2)
%>

</body>
</html>