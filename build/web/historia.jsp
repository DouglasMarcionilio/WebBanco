<%-- 
    Document   : historia
    Created on : 16/07/2019, 16:46:18
    Author     : DOUGLAS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quem sou eu</title>
    </head>
    <body style="background-image: url(IMAGENS/bg.jpg); background-repeat: no-repeat; background-position: center; background-size: cover;">
        <div class="container" style="background-color: white; width: 100%; height: 100%">
            <div class="pb-2 mt-4 mb-2 border-bottom">
        <h2 style="text-align: center; font-family:Cornerstone">BANCO DE INVESTIMENTOS GOHAN</h2>
    </div>
</div>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="index.html">Início</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="historia.jsp">História<span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Parceiros</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Contate-nos</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Login
        </a>
        <div class="dropdown-menu">
            <form class="px-4 py-3" action="Login" method="post">
    <div class="form-group">
      <label for="exampleDropdownFormEmail1">Usuario</label>
      <input type="text" class="form-control" id="exampleDropdownFormEmail1" placeholder="Exemplo: ABCDE" name="usuario">
    </div>
    <div class="form-group">
      <label for="exampleDropdownFormPassword1">Senha</label>
      <input type="password" class="form-control" id="exampleDropdownFormPassword1" placeholder="Senha" name="senha">
    </div>
    <div class="form-group">
      <div class="form-check">
      </div>
    </div>
    <button type="submit" class="btn btn-primary">Entrar</button>
  </form>
  <div class="dropdown-divider"></div>
  <a class="dropdown-item" href="cadastro.jsp">É novo aqui? Cadastre-se</a>
</div>
      </li>
    </ul>
  </div>
</nav>
        
        <div>
        <div class="w-50 p-3" style="margin-left: 350px">
            <h3 style="text-align: center; color: white">SOBRE MIM</h3>
        <p class="shadow p-3 mb-5 bg-white rounded" style="text-align: justify">
        Me chamo Douglas Marcionilio, tenho 21 anos, sou de Betim - Minas Gerais.<br />
        Desde pequeno sempre fui fascinado por tecnologia, quando eu tinha mais ou menos 
        uns 7 anos. <br />
        Curioso por natureza, sempre tive a vontade de descobrir como fazer softwares e
        ficava deslumbrado ao ver que, um conjunto de palavras (que na época não faziam sentido para mim)
        criava telas, formas e botões.<br />
        Aos 12 anos tive meu primeiro contato com a programação em si, ganhei um livro de python e foi lendo
        aquele livro que eu descobri o que queria fazer. Desde então obtive conhecimentos em outras linguagens
        como java, c# e php, obtive também conhecimentos em HTML, css, mysql, bootstrap etc.<br />
        Com 19 anos tive vontade de desenvolver aplicativos e foi ai que desenvolvi meu primeiro app
        para uma igreja, foi um app básico mas que me motivou a pesquisar mais e mais.<br /></p></div></div>
 
        
        
        
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </body>
</html>
