<%-- 
    Document   : homee
    Created on : Jul 6, 2014, 4:25:21 PM
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
    <h1 id="c">Integral University</h1>
    <div style="width: 1300px; height: 36px;">
        <div style="float: left; margin-left: 200px; width: 250px; height: 30px; margin-top: -20px;">
            <h3 style="color:grey;font-weight:normal">&nbsp;&nbsp; Web Designer / Art Director</h3>
        </div>
        <div style="float: left; width: 529px; margin-left: 30px; height: 30px;">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="index3.jsp" target="abc"><b>HOME</b></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;
            <a href="adminlog.html" target="abc"><b>ADMIN</b></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;
            <a href="student.html" target="abc"><b>STUDENT</b></a>
        </div>
    </div>
    <br />
    <div style="float: left; width: 260px; height: 447px; margin-left: 200px;margin-top:50px;">
        <img src="download(1).jpg" style="width: 278px; height: 300px;border-radius:139px" />
    </div>
    <div style="float: left; width: 480px; height: 477px; margin-left: 85px;">
        <iframe height="477" width="480" name="abc" frameborder="0" src="index3.jsp"></iframe>
    </div>
    <div style="clear:both;background-color:red;height:200px;width:1366px;margin-left:-10px;">
        <br />
        <br />
<div id="call">C</div>
        <div style="width:137px; float:left; margin-left: 16px;"><span style="color:white;font-family:'Book Antiqua'">Call me<br />7897354273<br />8896714311</span></div>
        <div id="call1">E</div><div style="width:229px; float:left; margin-left: 16px;"><span style="color:white;font-family:'Book Antiqua'">Email<br />mshahnawaz9935@gmail.com</span></div>
        <div id="call2">P</div><div style="width:128px; float:left; margin-left: 16px;"><span style="color:white;font-family:'Book Antiqua'">Phone<br />123456789</span></div>
        <div id="call3">A</div><div style="width:100px;float:left; margin-left: 16px;"><span style="color:white;font-family:'Book Antiqua'">Address<br />California,San Fierro</span></div>
    </div>
</body>
</html>

