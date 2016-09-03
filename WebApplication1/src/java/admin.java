/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author CODER
 */
public class admin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet admin</title>");            
            out.println("</head>");
            out.println("<body>");
            String s=request.getParameter("abc");
            String g=request.getParameter("cab");
            int t=0;
                     if((s.equals("admin"))&&(g.equals("1234")))
                     {
                         t=1;
                           // out.println("<h3>welcome " +" " + s +"</h3>");
                            
                         //   HttpSession ses=request.getSession(false);
                         //   ses.setAttribute("c", s);
                            //Cookie cook=new Cookie("c",s);
                            //cook.setValue(s);
                            //cook.setMaxAge(180);
                            //response.addCookie(cook);
                            RequestDispatcher rd1=request.getRequestDispatcher("task.html");
                            rd1.include(request,response);
                            //response.sendRedirect("index3.jsp");

                     }
                            //out.println("<center><h3>invalid username/password Enter Correct username/password</h3></center>");
                            //RequestDispatcher rd2=request.getRequestDispatcher("student.html");
                            //rd2.include(request,response);
                            //or
                            //response.sendRedirect("./Login.html");
                       
              if(t==0)
              {
             out.println("<center><h3>invalid username/password Enter Correct username/password</h3></center>");
                          RequestDispatcher rd2=request.getRequestDispatcher(".html");
                            rd2.include(request,response);
              }
            
            out.println("</body>");
            out.println("</html>");
        }    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
