<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pp.bunny2" %>
<%@page import="javax.servlet.RequestDispatcher" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <h1> <%
            HttpSession ses2 = request.getSession(false);
            ses2 = request.getSession();
            if ((ses2.getAttribute("table")) != null) {
                out.println("<h1>" + ses2.getAttribute("table") + "</h1>");
            } else {
                out.println("<h1>" + request.getParameter("branch").toString() + "</h1>");
                String ta = request.getParameter("branch");
                ses2.setAttribute("table", ta);

            }
            %></h1>
        <%!static int i=1;int p=0;static String po="";%>
         <%
           out.println("i="+i);
            if(request.getParameter("b")!=null)
            { 
            String n="";
                String g=request.getParameter("b");
                if(g.equals("next"))
                {
                    HttpSession ses=request.getSession();
           // out.println("i="+i);
            Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd", "root", "root");
                if ((ses.getAttribute("table")) != null) {
                    n = ses.getAttribute("table").toString();
                }
        else
                {
            n=request.getParameter("branch").toString();
                }
                String ad="select * from "+n;
               // out.println(ad);
                PreparedStatement pstmt = con.prepareStatement(ad);
                pstmt.executeQuery();
                ResultSet rs = pstmt.getResultSet();
                bunny2 b=new bunny2();
                int x=b.p(request, response,n);
                while (rs.next()) 
                    {
                        p = rs.getRow();
                        if(i>x)
                        {
                            out.println("<script>alert(' Exam completed ')</script>");
                            String ho=ses.getAttribute("rno").toString();
                            bunny2 hi=new bunny2();
                            int go=hi.calc1(request, response);
                            int sc=Integer.parseInt(ho);
                            hi.calc2(request, response,n,sc,go);
                            i=1;
                            ses.invalidate();
                            response.sendRedirect("index3.jsp");
                         //   ses2.invalidate();
                            break;
                        }
                        if (p == i) 
                        {
                            out.println("Questions "+i);
                            out.println("<h1><b>" + rs.getString(2)+"</h1></b>");
                            out.println("a) "+rs.getString(3));
                            out.println("b) "+rs.getString(4));
                            out.println("c) "+rs.getString(5));
                            out.println("d) "+rs.getString(6)+"</b>");
                           
                            po=rs.getString(7);
                             ses.setAttribute("ans", po);
                            i++;
                           break;
                        }
                    }
                }
          /*      if(g.equals("prev"))
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
                            out.println(rs.getString(1));
                            out.println("<h1><b>" + rs.getString(2)+"</h1></b>");
                            out.println(rs.getString(3));
                            out.println(rs.getString(4));
                            out.println(rs.getString(5) + "</b>");
                           break;
                        }
                    }
                } */
                if(g.equals("ok"))
                {
                    HttpSession ses1=request.getSession();
                    String ab=ses1.getAttribute("ans").toString();
                    String s=request.getParameter("drp");
      //      RequestDispatcher rd = request.getRequestDispatcher("try.jsp");
      //      rd.include(request, response);
                    bunny2 bun=new bunny2();
                    bun.calc(request, response, ab,s);
                }
            }
          /*  else
            {
               i=1;
                     Class.forName("com.mysql.jdbc.Driver");
                         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd", "root", "root");
                         PreparedStatement pstmt = con.prepareStatement("select * from chemistry");
                         pstmt.executeQuery();
                         ResultSet rs = pstmt.getResultSet();
                         while(rs.next())
                         {
                          
                         out.println(rs.getString(1));
                         out.println("<h1><b>" + rs.getString(2) + "</h1></b>");
                         out.println(rs.getString(3));
                         out.println(rs.getString(4));
                         out.println(rs.getString(5));
                         out.println(rs.getString(6) + "</b>");
                         po = rs.getString(7);
                         out.println("po="+po);
                         i++;
                         break;
                         }
               
                        
                    
                
            }*/
            %>
            <form action="try.jsp">
            <input type="submit" name="b" value="ok">
            <input type="submit" name="b" value="next">
            <select name="drp">
                <option>a</option>
                <option>b</option>
                <option>c</option>
                <option>d</option>
            </select></form>
    </body>
</html>
