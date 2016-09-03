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
        <%
            Class.forName("com.mysql.jdbc.Driver");
            String que="SELECT * FROM result1";
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","root");
            PreparedStatement ps=con.prepareStatement(que);
              ResultSet rs = ps.executeQuery();
              int t=0;
              int score=0,row=0;
              while(rs.next())
              {          
              String p=rs.getString("ans");
              String go=rs.getString("rans");
                     if((p.equals(go)))
                     {
                            score++;
                     }
                     row++;
            } 
              int total=row*10;
              score=score*10;
              out.println("<h2>You scored"+score+"out of"+total+"</h2>");
              
            %>
    </body>
</html>
