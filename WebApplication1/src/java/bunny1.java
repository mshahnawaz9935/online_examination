
import java.io.IOException;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class bunny1 {
    
    void p(HttpServletRequest request, HttpServletResponse response) throws IOException, ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd", "root", "root");
        PreparedStatement pstmt = con.prepareStatement("select * from chem");
        pstmt.executeQuery();
        ResultSet rs = pstmt.getResultSet();
        int x = 0;
        while (rs.next()) {
            x++;
        }
        out.println(x);
    
    
    }
}
