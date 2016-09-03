import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class view extends HttpServlet {
static String ans="";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet view</title>");            
            out.println("</head>");
            out.println("<body>");
            int k=0;int p=0;
            String ok=request.getParameter("a");
            if(ok.equals("Submit"))
            {
              HttpSession ses=request.getSession();
              ses=request.getSession();
              String l=ses.getAttribute("counter").toString();
              k=Integer.parseInt(l);
              String ta=ses.getAttribute("table").toString();
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","root");
            PreparedStatement pstmt=con.prepareStatement("select * from "+ta+"");    
            pstmt.executeQuery();  
            ResultSet rs=pstmt.getResultSet();
            boolean f=true;
            fun a=new fun();
            int g=a.p(request, response);
            if(k<=g)
            {
            while(rs.next())  
            {
                p=rs.getRow();
                if(p==k)
                {
                out.println("<h1>"+rs.getString(1)+"</h1>");
                out.println("<b>"+rs.getString(2));  
                out.println(rs.getString(3));  
                out.println(rs.getString(4));
                out.println(rs.getString(5)+"</b>");
                ans=rs.getString(6);
                //out.println("Choose Answer:<select name=\"a\">\n" + "<option>a</option>\n" +"<option>b</option>\n" +"<option>c</option>\n" +"<option>d</option>\n"+ "</select>");
                out.println("<form action=view><select name=\"drp\">\n" +
                        "    <option>a</option>\n" +
                        "    <option>b</option>\n" +"    <option>c</option>\n" +"    <option>d</option>\n" +
                        "</select><input type=\"submit\" value=\"ok\" name=\"a\" /></form>");
                out.println(rs.getString(1)+"<input type=\"radio\" name=\"\" value=\"\" />");
                p++;
                ses.setAttribute("counter",p);
                RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
                rd.include(request, response);
                break;
                }
                
            }
            }
            else{
                
            
                out.println("<h2>Exam Completed</h2>");
                RequestDispatcher rd=request.getRequestDispatcher("index3.jsp");
                rd.include(request, response);
            }
                
               
          
             //sess.setAttribute("qlist",qlist);  
            }
            if(ok.equals("ok"))
            {
                fun b=new fun();
                b.calc(request,response);
            }
            out.println("</body>");
            out.println("</html>");
        } catch (SQLException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
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
class fun
{
int p(HttpServletRequest request, HttpServletResponse response) throws IOException, ClassNotFoundException, SQLException
{
    
    Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","root");
            HttpSession ses=request.getSession();
            String la=ses.getAttribute("table").toString();
            PreparedStatement pstmt=con.prepareStatement("select * from "+la+"");          
            pstmt.executeQuery();  
            ResultSet rs=pstmt.getResultSet();
            int x=0;
            while(rs.next())
            {  
                x++;
            }
            return(x);

}
void calc(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException
{
    PrintWriter out = response.getWriter();
    view v=new view();
    String g=v.ans;
    out.println("g="+g);
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","root");
            String que="INSERT INTO result1(ans,rans) values(?,?)";
            PreparedStatement ps=con.prepareStatement(que);
            String s=request.getParameter("drp");
            ps.setString(1, s);
            ps.setString(2, g);
            int i=ps.executeUpdate();
            if(i!=0)
            {
               out.println("Answered");
               RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
                rd.include(request, response);
            }
            else
               out.println("Not Registered");
}
}