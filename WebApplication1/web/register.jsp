<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Successfully Registered!</h1>
          <%
                 String s=request.getParameter("nm");
            String g=request.getParameter("ps");
            String r=request.getParameter("rno");
            int rno=Integer.parseInt(r);
            String branch=request.getParameter("branch");
            if(s.equals(""))
            {
                out.print("");
            }
            else
            {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","root");
            /*if(con!=null)
            {
                out.println("Connected");
            }*/
            String que="INSERT INTO abcd(name,passwrd,rno,branch) values(?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(que);
            ps.setString(1, s);
            ps.setString(2,g);
            ps.setInt(3, rno);
            ps.setString(4, branch);
            int i=ps.executeUpdate();
            if(i!=0)
            {
                out.println("<script>alert('Succesfully Registered');</script>");
            }
            else
            {
                out.println("Not Registered");
            }
            }
                %>
    </body>
</html>