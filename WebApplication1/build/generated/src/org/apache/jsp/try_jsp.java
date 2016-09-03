package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import pp.bunny2;
import javax.servlet.RequestDispatcher;

public final class try_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static int i=1;int p=0;static String po="";
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1> ");

            HttpSession ses2=request.getSession(false);
            ses2=request.getSession();
        if((ses2.getAttribute("table"))!=null)
            {
            out.println("<h1>"+ses2.getAttribute("table")+"</h1>");
            }
        else
            out.println("<h1>"+request.getParameter("branch").toString()+"</h1>");
        
      out.write("</h1>\n");
      out.write("        ");
      out.write("\n");
      out.write("         ");

            
            if(request.getParameter("b")!=null)
            { 
              
                String g=request.getParameter("b");
                if(g.equals("next"))
                {
                    HttpSession ses=request.getSession();
           // out.println("i="+i);
            Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd", "root", "root");
                PreparedStatement pstmt = con.prepareStatement("select * from chemistry");
                pstmt.executeQuery();
                ResultSet rs = pstmt.getResultSet();
                bunny2 b=new bunny2();
                int x=b.p(request, response);
                while (rs.next()) 
                    {
                        p = rs.getRow();
                        if(i>x)
                        {
                            out.println("Exam completed");
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
            
      out.write("\n");
      out.write("            <form action=\"try.jsp\">\n");
      out.write("            <input type=\"submit\" name=\"b\" value=\"ok\">\n");
      out.write("            <input type=\"submit\" name=\"b\" value=\"next\">\n");
      out.write("            <select name=\"drp\">\n");
      out.write("                <option>a</option>\n");
      out.write("                <option>b</option>\n");
      out.write("                <option>c</option>\n");
      out.write("                <option>d</option>\n");
      out.write("            </select></form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
