import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;
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
public class addquestions extends HttpServlet {
    static int k=0;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet addquestions</title>");            
            out.println("</head>");
            out.println("<body>");
            HttpSession ses=request.getSession();
            String p=ses.getAttribute("paper").toString();
            String ques=request.getParameter("ques");
            String opt1=request.getParameter("opt1");
            String opt2=request.getParameter("opt2");
            String opt3=request.getParameter("opt3");
            String opt4=request.getParameter("opt4");
            String ans=request.getParameter("drp");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","root");
            /*if(con!=null)
            {
                out.println("Connected");
            }*/
            String _btn=request.getParameter("a");
            if(_btn.equals("ok")){
            String que="INSERT INTO "+p+"(no,ques,opt1,opt2,opt3,opt4,ans) values(?,?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(que);
            ps.setInt(1, k);
            ps.setString(2, ques);
            ps.setString(3,opt1);
            ps.setString(4, opt2);
            ps.setString(5, opt3);
            ps.setString(6, opt4);
            ps.setString(7, ans);
            int i=ps.executeUpdate();
            if(i!=0)
            {
                i++;
                out.println("<b>One question Inserted</b><br>");
                RequestDispatcher rd=request.getRequestDispatcher("questions.html");
                rd.include(request, response);
            }
            else
            {
                out.println("Not Entered");
            }
            }
            else
            {
                
                out.println("Questions inserted");
                RequestDispatcher rd=request.getRequestDispatcher("adminlog.html");
                rd.include(request,response);
            }
           
          //  out.println("<h1>Servlet addquestions at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addquestions.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addquestions.class.getName()).log(Level.SEVERE, null, ex);
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
