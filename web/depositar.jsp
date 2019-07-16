<%-- 
    Document   : depositar
    Created on : 09/07/2019, 15:11:29
    Author     : DOUGLAS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Faça um depósito</h1>
        <form action="Depositar" method="post">
            <input type="text" name="deposito" placeholder="Valor para depósito"><br /><br />
            <input type="submit" value="Depositar">
        </form>
    </body>
</html>
