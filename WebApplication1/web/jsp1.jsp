<%-- 
    Document   : jsp1
    Created on : Jul 3, 2014, 3:10:47 AM
    Author     : CODER
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <!--%!String s="",g="";%-->
        <%
            String s=request.getParameter("nm");
            String g=request.getParameter("ps");
            Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","root");
            if(con!=null)
            {
                out.println("Connected");
            }
            String que="INSERT INTO abcd(name,passwrd) values(?,?)";
            PreparedStatement ps=con.prepareStatement(que);
            ps.setString(1, s);
            ps.setString(2,g);
            int i=ps.executeUpdate();
            if(i!=0)
            {
                out.println("succesfully inserted");
            }
            else
            {
                out.println("not inserted");
            }
            %>
    </body>
</html>
