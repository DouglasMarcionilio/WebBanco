<%-- 
    Document   : cadastro
    Created on : 05/07/2019, 14:09:24
    Author     : DOUGLAS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastre-se</title>
    </head>
    <body>
        <h2>Realize o cadastro</h2>
        <form action="Cadastro" method="post">
            <input type="text" name="nome" placeholder="Nome completo"><br /><br />
            <input type="text" name="idade" placeholder="Idade"><br /><br />
            <input type="text" name="cpf" placeholder="CPF"><br /><br />
            <input type="text" name="usuario" placeholder="Usuario"><br /><br />
            <input type="password" name="senha" placeholder="Senha"><br /><br />
            <input type="submit" value="Cadastrar">
        </form>
    </body>
</html>
