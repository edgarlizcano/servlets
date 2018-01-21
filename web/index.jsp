<%-- 
    Document   : index
    Created on : 21-ene-2018, 12:07:38
    Author     : Edgar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/styles.css"/>
        <script src="js/script.js"></script> 
        <title>Inicio JSP</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="LoginServlet" method="POST">
            <input type="text" name="user" id=""> <br>
            <input type="password" name="pass" id=""> <br>
            <input type="submit" name="entrar" value="Entrar" id="">
        </form>
    </body>
</html>
