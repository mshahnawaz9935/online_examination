<%-- 
    Document   : questions
    Created on : Jul 11, 2014, 11:14:57 PM
    Author     : CODER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        >Enter Questions:
        <form action="addquestions">
        <textarea name="ques" rows="4" cols="20">
        </textarea>
            <br>
            Enter Option1:<br><textarea name="opt1" rows="4" cols="20">
            </textarea><br>
            Enter Option 2:<br><textarea name="opt2" rows="4" cols="20">
            </textarea><br>
            Enter Option 3:<br><textarea name="opt3" rows="4" cols="20">
            </textarea><br>
            Enter Option 4:<br><textarea name="opt4" rows="4" cols="20">
            </textarea>
            <select name="drp">
                <option>a</option>
                <option>b</option>
                <option>c</option>
                <option>d</option>
            </select>
            
            <input type="hidden" name="hide" value=<% request.getAttribute("paper").toString(); %> >
            <input type="submit" value="ok"></form>
    </body>
</html>
