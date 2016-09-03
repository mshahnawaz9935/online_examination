package pp;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class bunny2 {
    public String table="";
    public int p(HttpServletRequest request, HttpServletResponse response,String k) throws IOException, ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd", "root", "root");
        table=k;
        k="select * from "+k;
        PreparedStatement pstmt = con.prepareStatement(k);
        pstmt.executeQuery();
        ResultSet rs = pstmt.getResultSet();
        int x = 0;
        while (rs.next()) {
            x++;
        }
        return(x);
    
    
    }
    public void calc(HttpServletRequest request, HttpServletResponse response,String n,String s) throws SQLException, IOException, ServletException 
    {
        PrintWriter out = response.getWriter();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd", "root", "root");
        String que = "INSERT INTO result1(ans,rans) values(?,?)";
        PreparedStatement ps = con.prepareStatement(que);
        ps.setString(1, s);
        ps.setString(2, n);
        int i = ps.executeUpdate();
        if (i != 0) 
        {
            out.println("Answered");
      //      RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
      //      rd.include(request, response);
        } else {
            out.println("Not Registered");
        }
    }
    public int calc1(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException, ClassNotFoundException 
    {
        PrintWriter out = response.getWriter();
            Class.forName("com.mysql.jdbc.Driver");
            String que="SELECT * FROM result1";
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","root");
            PreparedStatement ps=con.prepareStatement(que);
              ResultSet rs = ps.executeQuery();
              int t=0;
              int row=0;int score=0;
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
              return(score);
      //        out.println("<h2>You scored"+score+"out of"+total+"</h2>");
    }
        public void calc2(HttpServletRequest request, HttpServletResponse response,String ta,int id,int sc) throws SQLException, IOException, ServletException, ClassNotFoundException 
    {
        int i=0,j=0;
        PrintWriter out = response.getWriter();
        Class.forName("com.mysql.jdbc.Driver");
        String que = "UPDATE score SET id=12,chemistry=64";
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd", "root", "root");
        PreparedStatement ps = con.prepareStatement(que);
        //ps.setInt(1, id);
        //ps.setInt(2, sc);
        i = ps.executeUpdate();
            
           
            if(i!=0)
            {
                i++;
                out.println("<b>One question Inserted</b><br>");
            }
            else
            {
                out.println("Not Entered");
            }
      //        out.println("<h2>You scored"+score+"out of"+total+"</h2>");
    }
    
    
}
