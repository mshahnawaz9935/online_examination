<%-- 
    Document   : index3
    Created on : Jul 6, 2014, 4:36:37 PM
    Author     : CODER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <style>
        body {
            background-color: lightgrey;
        }

        #c {
            margin-top: 30px;
            margin-left: 200px;
            margin-bottom: 0px;
            color:black;
            font-family:'Bookman Old Style';
            font-size:30px;
        }

        ul {
            list-style: none;
        }

            ul li {
                float: none;
            }

        .menu {
            display: inline-block;
            width: 120px;
            height: 120px;
            border-radius: 60px;
            font-family:Tahoma;
            font-size: 14px;
            color: #fff;
            line-height: 120px;
            text-align: center;
            text-decoration: none;
            background: #000;
        }

            .menu:hover {
                color: #ccc;
                text-decoration: none;
                background: #333;
            }

        #aa.menu {
            background-color: red;
        }

            #aa.menu:hover {
                background-color:yellowgreen;
            }
            #bb.menu:hover {
                background-color:skyblue;
                color:grey;
            }
            #cc.menu:hover {
                background-color: yellow;
                color:white;
            }

        #bb.menu {
            background-color: blue;
        }

        #cc.menu {
            background-color: cyan;
            color: black;
        }
        a {
            font-family:'Bookman Old Style';
            font-style:normal;
            font-weight:lighter;
        }
            a:hover {
                color:cyan;
            }
        #call {
            width:49px;
            height:45px;
            color:white;
            background-color:blue;
            border-radius:22px;
            line-height:45px;
            text-align:center;
            margin-left: 202px;
            float:left;
        }
        #call1 {
            width:49px;
            height:45px;
            color:white;
            background-color:blue;
            border-radius:22px;
            line-height:45px;
            text-align:center;
            margin-left: 30px;
            float:left;
        }
        #call2 {
            width:49px;
            height:45px;
            color:white;
            background-color:blue;
            border-radius:22px;
            line-height:45px;
            text-align:center;
            margin-left: 30px;
            float:left;
        }
        #call3 {
            width:49px;
            height:45px;
            color:white;
            background-color:blue;
            border-radius:22px;
            line-height:45px;
            text-align:center;
            margin-left: 30px;
            float:left;
        }
    </style>
</head>
<body>
        <h1 style="font-size: 65px;font-family:'Bookman Old Style'">Online,</h1>
        <h1 style="font-size: 40px; margin-top: -35px;font-family:'Bookman Old Style'">semesters exam :</h1>
        <a href="exams.jsp" class="menu" id="aa">EXAMS</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
        <a href="result.jsp" class="menu" id="bb">RESULTS</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="#" class="menu" id="cc">INFO</a>

        <p>
           
             <% 
              
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
            %> 
           <!-- I m a paragraph.Click here to add your own text and edit me.It's easy.
Just click "Edit Text" or double click me and you can start adding your own content.-->
        </p>

</body>
</html>

