<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            HttpSession ses1=request.getSession(false);
            ses1=request.getSession();
            if(ses1.getAttribute("login")==null)
                response.sendRedirect("student.html");
            
        %>
         <form action="try.jsp">
            <br>
            <br>
     
            First Choose your Subject :<br>  <br>  
            <select name="branch">
                <%
                    Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","root");
                DatabaseMetaData md = con.getMetaData();
                ResultSet rs = md.getTables(null, null, "%", null);
                while (rs.next()) 
                {
                    if((rs.getString(3).equals("abcd"))||(rs.getString(3).equals("result1")))
                    continue;
                    out.println("<option>"+rs.getString(3)+"</option>");
                }
                %>
            </select><br><br>
            
        <br><input type="submit" value="OK"></form>
    </body>
</html>
