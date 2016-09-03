<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Result</h2>
        Name : <%
            HttpSession ses1=request.getSession(false);
            ses1=request.getSession();
            if(ses1.getAttribute("login")==null)
                response.sendRedirect("student.html");
            else
                out.print(ses1.getAttribute("login"));
            
        %>
        <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Roll No: <br>
        <b>Subjects</b>
        
        
    </body>
</html>
