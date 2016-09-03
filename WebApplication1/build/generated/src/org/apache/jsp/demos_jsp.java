package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.*;
import pp.bunny;

public final class demos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static int i=1;int p=0;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        Question : ");

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
                        
      out.write("\n");
      out.write("                        <form action=\"demos.jsp\" method=\"post\">\n");
      out.write("                            <input type=\"submit\" name=\"a\" value=\"prev\">\n");
      out.write("                            <input type=\"submit\" name=\"a\" value=\"next\"></form>\n");
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
