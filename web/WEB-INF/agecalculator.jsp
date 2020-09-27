<%-- 
    Document   : agecalculator
    Created on : Sep 27, 2020, 3:25:56 PM
    Author     : 726772
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            <label for="age">Enter your age: </label><input type="text" id="age" name="age"><br>
            <input type="submit" value="Age next birthday"><br>
        </form>
        <p>${message}</p>
        <a href="arithmetic">Arithmetic Calculator</a>
        
    </body>
</html>
