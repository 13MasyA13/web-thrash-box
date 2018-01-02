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
String userName = request.getParameter("name");
if (userName != null && userName != "") {
	pageContext.setAttribute("sessionUserName", userName, PageContext.SESSION_SCOPE);
	pageContext.setAttribute("appUserName", userName, PageContext.APPLICATION_SCOPE);
	pageContext.setAttribute("contextUserName", userName);
}
%>

<br>

The user name in the request object is : <%= userName %>

<br>
The user name in the session object is : <%= session.getAttribute("sessionUserName") %>
<br>
The user name in the app contecst object is : <%= application.getAttribute("appUserName") %>

<br>
The user name in the context contecst object is : <%= pageContext.getAttribute("contextUserName") %>
</body>
</html>