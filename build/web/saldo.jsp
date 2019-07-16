<%-- 
    Document   : saldo
    Created on : 08/07/2019, 16:47:55
    Author     : DOUGLAS
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Buscar"%>
<!DOCTYPE html>
<html>
    <head>
        <% Buscar buscas = new Buscar();%>
        <% DecimalFormat df = new DecimalFormat("#,###.00");%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Saldo</title>
    </head>
    <body>
        <h1>Você possui em conta : R$<%=df.format(buscas.buscavaloremconta())%></h1>
        <br /><br />
        <h3><a href="areaCliente.jsp">Voltar</a></h3>
    </body>
</html>
