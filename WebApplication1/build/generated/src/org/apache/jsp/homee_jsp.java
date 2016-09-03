package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homee_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <h1 id=\"c\">Integral University</h1>\n");
      out.write("    <div style=\"width: 1300px; height: 36px;\">\n");
      out.write("        <div style=\"float: left; margin-left: 200px; width: 250px; height: 30px; margin-top: -20px;\">\n");
      out.write("            <h3 style=\"color:grey;font-weight:normal\">&nbsp;&nbsp; Web Designer / Art Director</h3>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"float: left; width: 529px; margin-left: 30px; height: 30px;\">\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href=\"index3.jsp\" target=\"abc\"><b>HOME</b></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;\n");
      out.write("            <a href=\"adminlog.html\" target=\"abc\"><b>ADMIN</b></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;\n");
      out.write("            <a href=\"student.html\" target=\"abc\"><b>STUDENT</b></a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <br />\n");
      out.write("    <div style=\"float: left; width: 260px; height: 447px; margin-left: 200px;margin-top:50px;\">\n");
      out.write("        <img src=\"download(1).jpg\" style=\"width: 278px; height: 300px;border-radius:139px\" />\n");
      out.write("    </div>\n");
      out.write("    <div style=\"float: left; width: 480px; height: 477px; margin-left: 85px;\">\n");
      out.write("        <iframe height=\"477\" width=\"480\" id=\"abc\" frameborder=\"0\" src=\"index3.jsp\"></iframe>\n");
      out.write("    </div>\n");
      out.write("    <div style=\"clear:both;background-color:red;height:200px;width:1366px;margin-left:-10px;\">\n");
      out.write("        <br />\n");
      out.write("        <br />\n");
      out.write("<div id=\"call\">C</div>\n");
      out.write("        <div style=\"width:137px; float:left; margin-left: 16px;\"><span style=\"color:white;font-family:'Book Antiqua'\">Call me<br />7897354273<br />8896714311</span></div>\n");
      out.write("        <div id=\"call1\">E</div><div style=\"width:229px; float:left; margin-left: 16px;\"><span style=\"color:white;font-family:'Book Antiqua'\">Email<br />mshahnawaz9935@gmail.com</span></div>\n");
      out.write("        <div id=\"call2\">P</div><div style=\"width:128px; float:left; margin-left: 16px;\"><span style=\"color:white;font-family:'Book Antiqua'\">Phone<br />123456789</span></div>\n");
      out.write("        <div id=\"call3\">A</div><div style=\"width:100px;float:left; margin-left: 16px;\"><span style=\"color:white;font-family:'Book Antiqua'\">Address<br />California,San Fierro</span></div>\n");
      out.write("    </div>\n");
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
