<%-- 
    Document   : LogHome
    Created on : Jul 11, 2014, 2:46:57 AM
    Author     : CODER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
       HttpSession ses1=request.getSession();
       out.println("<h2>Welcome "+ses1.getAttribute("login")+"</h2>");
       %>
       <%@include file="index3.jsp" %>
    </body>
</html>
