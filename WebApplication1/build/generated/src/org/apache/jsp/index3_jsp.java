package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-color: lightgrey;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #c {\n");
      out.write("            margin-top: 30px;\n");
      out.write("            margin-left: 200px;\n");
      out.write("            margin-bottom: 0px;\n");
      out.write("            color:black;\n");
      out.write("            font-family:'Bookman Old Style';\n");
      out.write("            font-size:30px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        ul {\n");
      out.write("            list-style: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("            ul li {\n");
      out.write("                float: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        .menu {\n");
      out.write("            display: inline-block;\n");
      out.write("            width: 120px;\n");
      out.write("            height: 120px;\n");
      out.write("            border-radius: 60px;\n");
      out.write("            font-family:Tahoma;\n");
      out.write("            font-size: 14px;\n");
      out.write("            color: #fff;\n");
      out.write("            line-height: 120px;\n");
      out.write("            text-align: center;\n");
      out.write("            text-decoration: none;\n");
      out.write("            background: #000;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("            .menu:hover {\n");
      out.write("                color: #ccc;\n");
      out.write("                text-decoration: none;\n");
      out.write("                background: #333;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        #aa.menu {\n");
      out.write("            background-color: red;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("            #aa.menu:hover {\n");
      out.write("                background-color:yellowgreen;\n");
      out.write("            }\n");
      out.write("            #bb.menu:hover {\n");
      out.write("                background-color:skyblue;\n");
      out.write("                color:grey;\n");
      out.write("            }\n");
      out.write("            #cc.menu:hover {\n");
      out.write("                background-color: yellow;\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        #bb.menu {\n");
      out.write("            background-color: blue;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #cc.menu {\n");
      out.write("            background-color: cyan;\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("        a {\n");
      out.write("            font-family:'Bookman Old Style';\n");
      out.write("            font-style:normal;\n");
      out.write("            font-weight:lighter;\n");
      out.write("        }\n");
      out.write("            a:hover {\n");
      out.write("                color:cyan;\n");
      out.write("            }\n");
      out.write("        #call {\n");
      out.write("            width:49px;\n");
      out.write("            height:45px;\n");
      out.write("            color:white;\n");
      out.write("            background-color:blue;\n");
      out.write("            border-radius:22px;\n");
      out.write("            line-height:45px;\n");
      out.write("            text-align:center;\n");
      out.write("            margin-left: 202px;\n");
      out.write("            float:left;\n");
      out.write("        }\n");
      out.write("        #call1 {\n");
      out.write("            width:49px;\n");
      out.write("            height:45px;\n");
      out.write("            color:white;\n");
      out.write("            background-color:blue;\n");
      out.write("            border-radius:22px;\n");
      out.write("            line-height:45px;\n");
      out.write("            text-align:center;\n");
      out.write("            margin-left: 30px;\n");
      out.write("            float:left;\n");
      out.write("        }\n");
      out.write("        #call2 {\n");
      out.write("            width:49px;\n");
      out.write("            height:45px;\n");
      out.write("            color:white;\n");
      out.write("            background-color:blue;\n");
      out.write("            border-radius:22px;\n");
      out.write("            line-height:45px;\n");
      out.write("            text-align:center;\n");
      out.write("            margin-left: 30px;\n");
      out.write("            float:left;\n");
      out.write("        }\n");
      out.write("        #call3 {\n");
      out.write("            width:49px;\n");
      out.write("            height:45px;\n");
      out.write("            color:white;\n");
      out.write("            background-color:blue;\n");
      out.write("            border-radius:22px;\n");
      out.write("            line-height:45px;\n");
      out.write("            text-align:center;\n");
      out.write("            margin-left: 30px;\n");
      out.write("            float:left;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("        <h1 style=\"font-size: 65px;font-family:'Bookman Old Style'\">Online,</h1>\n");
      out.write("        <h1 style=\"font-size: 40px; margin-top: -35px;font-family:'Bookman Old Style'\">semesters exam :</h1>\n");
      out.write("        <a href=\"exams.jsp\" class=\"menu\" id=\"aa\">EXAMS</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n");
      out.write("        <a href=\"result.jsp\" class=\"menu\" id=\"bb\">RESULTS</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        <a href=\"#\" class=\"menu\" id=\"cc\">INFO</a>\n");
      out.write("\n");
      out.write("        <p>\n");
      out.write("           \n");
      out.write("             ");
 
              
            /*Cookie cookie=null;
            Cookie[] cookies = request.getCookies();
            for(int i=0;i<cookies.length;i++)
            {
                cookie=cookies[i];
                String p=cookie.getName();
                p=p.toString();
            if(cookie!=null)
                if(p.equals("c"))
            {
                out.print("welcome ");
                out.println(cookie.getValue());
        
           }
            }*/
            
      out.write(" \n");
      out.write("           <!-- I m a paragraph.Click here to add your own text and edit me.It's easy.\n");
      out.write("Just click \"Edit Text\" or double click me and you can start adding your own content.-->\n");
      out.write("        </p>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
