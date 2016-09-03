<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Page</title>
    </head>
    <body>
        <%
            HttpSession ses=request.getSession(false);
            ses=request.getSession();
        if((ses.getAttribute("table"))!=null)
            {
            out.println("<h1>"+ses.getAttribute("table")+"</h1>");
            }
        else
            out.println("<h1>"+request.getParameter("branch").toString()+"</h1>");
        %>
        <h2>Questions!
        <%
            String ta=request.getParameter("branch");
            ses=request.getSession();
            if((ses.getAttribute("counter"))==null)
            {
            ses.setAttribute("counter", "1");
            ses.setAttribute("table", ta);
            out.println(ses.getAttribute("counter"));
            }
            else
            out.println(ses.getAttribute("counter"));
            %> </h1>
        <form action="demo1">
            <input type="submit" value="Submit" name="a">
        </form>
    </body>
</html>