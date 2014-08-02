<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- Expression Language Example (no need to write scriplet tags)
Name is - ${param.name}
Age is - ${param.age} 
-->

<!-- jstl tag  -->
<c:out value="${param.name}"></c:out>
<c:out value="${param.age}"></c:out>

<%

//Request
//out.println("Name is " + request.getParameter("name") +  " age is " + request.getParameter("age"));

//Session
//out.println("Name is " + session.getAttribute("name") +  " age is " + session.getAttribute("age"));

%>

</body>
</html>