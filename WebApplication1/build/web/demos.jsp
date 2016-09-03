<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pp.bunny" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!static int i=1;int p=0;%>
        Question : <%
            bunny bo=new bunny();
                bo.p(request,response);
            if(request.getParameter("a")!=null)
            {
              
                String g=request.getParameter("a");
                if(g.equals("next"))
                {
           // out.println("i="+i);
            Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd", "root", "root");
                PreparedStatement pstmt = con.prepareStatement("select * from chemistry");
                pstmt.executeQuery();
                ResultSet rs = pstmt.getResultSet();
                
                while (rs.next()) 
                    {
                        p = rs.getRow();
                        if (p == i) 
                        {
                            out.println("<h1>" + rs.getString(1) + "</h1>");
                            out.println("<b>" + rs.getString(2));
                            out.println(rs.getString(3));
                            out.println(rs.getString(4));
                            out.println(rs.getString(5) + "</b>");
                            i++;
                           break;
                        }
                    }
                }
                else
                {
                    i--;
                    Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd", "root", "root");
                PreparedStatement pstmt = con.prepareStatement("select * from chemistry");
                pstmt.executeQuery();
                ResultSet rs = pstmt.getResultSet();
                
                while (rs.next()) 
                    {
                        p = rs.getRow();
                        if (p == i) 
                        {
                            out.println("<h1>" + rs.getString(1) + "</h1>");
                            out.println("<b>" + rs.getString(2));
                            out.println(rs.getString(3));
                            out.println(rs.getString(4));
                            out.println(rs.getString(5) + "</b>");
                           break;
                        }
                    }
                }
            }
                        %>
                        <form action="demos.jsp" method="post">
                            <input type="submit" name="a" value="prev">
                            <input type="submit" name="a" value="next"></form>
    </body>
</html>
