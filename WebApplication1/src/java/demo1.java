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
public class demo1 extends HttpServlet {

    static String ans = "";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet view</title>");
            out.println("</head>");
            out.println("<body>");
            int k = 1;
            int p = 0;
            String ok = request.getParameter("a");
            if (ok.equals("Submit")) 
            {
                HttpSession ses = request.getSession();
                ses = request.getSession();
                String l = ses.getAttribute("counter").toString();
                k = Integer.parseInt(l);
                String ta = ses.getAttribute("table").toString();
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd", "root", "root");
                PreparedStatement pstmt = con.prepareStatement("select * from " + ta +"");
                pstmt.executeQuery();
                ResultSet rs = pstmt.getResultSet();
                boolean f = true;
                funi a = new funi();
                int g = a.p(request, response);
                if (k <= g) {
                    while (rs.next()) 
                    {
                    
                        p = rs.getRow();
                        
                        if (p == k) 
                        {
                          
                            out.println("<b>" + rs.getString(1));
                            out.println("<h1>" + rs.getString(2)+"</h1>");
                            out.println(rs.getString(3));
                            out.println(rs.getString(4));
                            out.println(rs.getString(5));
                            out.println(rs.getString(6)+ "</b>");
                            ans = rs.getString(7);
                          
                            //out.println("Choose Answer:<select name=\"a\">\n" + "<option>a</option>\n" +"<option>b</option>\n" +"<option>c</option>\n" +"<option>d</option>\n"+ "</select>");
                            out.println("<form action=demo1><select name=\"drp\">\n"
                                    + "    <option>a</option>\n"
                                    + "    <option>b</option>\n" + "    <option>c</option>\n" + "    <option>d</option>\n"
                                    + "</select><input type=\"submit\" value=\"ok\" name=\"a\" /></form>");
                            p++;
                            ses.setAttribute("counter", p);
                            RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
                            rd.include(request, response);
                            break;
                        }
                    
                    }
                } else {
                    out.println("<h2>Exam Completed</h2>");
                    funi c=new funi();
                    c.calc1(request, response);
                    c.result(request, response);
                                  ses.invalidate();
                    RequestDispatcher rd = request.getRequestDispatcher("index3.jsp");
                    rd.include(request, response);
                }
            }
            if (ok.equals("ok")) {
                funi b = new funi();
                b.calc(request, response);
            }
            out.println("</body>");
            out.println("</html>");
        } catch (SQLException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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

class funi {
int score=0;
String g="";
    int p(HttpServletRequest request, HttpServletResponse response) throws IOException, ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd", "root", "root");
        HttpSession ses1 = request.getSession();
        String ta = ses1.getAttribute("table").toString();
        PreparedStatement pstmt = con.prepareStatement("select * from "+ta+"");
        pstmt.executeQuery();
        ResultSet rs = pstmt.getResultSet();
        int x = 0;
        while (rs.next()) {
            x++;
        }
        return (x);

    }

    void calc(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException 
    {
        PrintWriter out = response.getWriter();
        demo1 v = new demo1();
        String g = v.ans;
        out.println("g=" + g);
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd", "root", "root");
        String que = "INSERT INTO result1(ans,rans) values(?,?)";
        PreparedStatement ps = con.prepareStatement(que);
        String s = request.getParameter("drp");
        ps.setString(1, s);
        ps.setString(2, g);
        int i = ps.executeUpdate();
        if (i != 0) 
        {
            out.println("Answered");
            RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
            rd.include(request, response);
        } else {
            out.println("Not Registered");
        }
    }
    void calc1(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException, ClassNotFoundException 
    {
        PrintWriter out = response.getWriter();
            Class.forName("com.mysql.jdbc.Driver");
            String que="SELECT * FROM result1";
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","root");
            PreparedStatement ps=con.prepareStatement(que);
              ResultSet rs = ps.executeQuery();
              int t=0;
              int row=0;
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
              out.println(score);
      //        out.println("<h2>You scored"+score+"out of"+total+"</h2>");
    }
    void result(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException 
    {
        HttpSession sese=request.getSession();
        sese=request.getSession();
        g=sese.getAttribute("rno").toString();
        int go=Integer.parseInt(g);
        PrintWriter out = response.getWriter();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd", "root", "root");
        String que = "INSERT INTO cse(rno,"+sese.getAttribute("table").toString()+") values(?,?)"; 
        String qup="UPDATE CSE SET "+sese.getAttribute("table").toString()+"=(?) WHERE RNO=(?)";
        int i=0,j=0;
           try 
           {
            PreparedStatement ps = con.prepareStatement(que);
            ps.setInt(1, go);
            ps.setInt(2, score);
            i = ps.executeUpdate();
        }
            catch(Exception e)
            {
                PreparedStatement ps = con.prepareStatement(qup);
            ps.setInt(1, score);
            ps.setInt(2, go);
            j = ps.executeUpdate();
            }
        if (i != 0|| j!=0) 
        {
            out.println("Done");
           
        }
        else 
        {
            out.println("Not Done");
        }
    }
}
