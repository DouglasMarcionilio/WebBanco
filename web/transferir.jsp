<%-- 
    Document   : transferir
    Created on : 08/07/2019, 16:48:10
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
        <h1>REALIZAR TRANSFERÊNCIA</h1>
        <form action="Transferencia" method="post">
            
            <input type="text" name="cpfdest" placeholder="CPF do Destinatário"><br /><br />
            <input type="text" name="valortransf" placeholder="Valor para Transferência"><br /><br />
            <input type="password" name="suasenha" placeholder="Insira sua senha novamente"><br /><br />
            <input type="submit" value="Transferir">
            
        </form>
    </body>
</html>
