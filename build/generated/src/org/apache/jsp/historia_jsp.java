package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class historia_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Quem sou eu</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url(IMAGENS/bg.jpg); background-repeat: no-repeat; background-position: center; background-size: cover; margin-top: 100px\">\n");
      out.write("        <div class=\"container\" style=\"background-color: white\">\n");
      out.write("            <div class=\"pb-2 mt-4 mb-2 border-bottom\">\n");
      out.write("        <h2 style=\"text-align: center; font-family:Cornerstone\">BANCO DE INVESTIMENTOS GOHAN</h2>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("  <a class=\"navbar-brand\" href=\"index.html\">Início</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\n");
      out.write("    <ul class=\"navbar-nav\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"historia.jsp\">História<span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\">Parceiros</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\">Contate-nos</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item dropdown\">\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("          Login\n");
      out.write("        </a>\n");
      out.write("        <div class=\"dropdown-menu\">\n");
      out.write("            <form class=\"px-4 py-3\" action=\"Login\" method=\"post\">\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"exampleDropdownFormEmail1\">Usuario</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"exampleDropdownFormEmail1\" placeholder=\"Exemplo: ABCDE\" name=\"usuario\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"exampleDropdownFormPassword1\">Senha</label>\n");
      out.write("      <input type=\"password\" class=\"form-control\" id=\"exampleDropdownFormPassword1\" placeholder=\"Senha\" name=\"senha\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <div class=\"form-check\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <button type=\"submit\" class=\"btn btn-primary\">Entrar</button>\n");
      out.write("  </form>\n");
      out.write("  <div class=\"dropdown-divider\"></div>\n");
      out.write("  <a class=\"dropdown-item\" href=\"cadastro.jsp\">É novo aqui? Cadastre-se</a>\n");
      out.write("</div>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("        <div class=\"w-50 p-3\" style=\"margin-left: 350px\">\n");
      out.write("            <h3 style=\"text-align: center; color: white\">SOBRE MIM</h3>\n");
      out.write("        <p class=\"shadow p-3 mb-5 bg-white rounded\" style=\"text-align: justify\">\n");
      out.write("        Me chamo Douglas Marcionilio, tenho 21 anos, sou de Betim - Minas Gerais.<br />\n");
      out.write("        Desde pequeno sempre fui fascinado por tecnologia, quando eu tinha mais ou menos \n");
      out.write("        uns 7 anos. <br />\n");
      out.write("        Curioso por natureza, sempre tive a vontade de descobrir como fazer softwares e\n");
      out.write("        ficava deslumbrado ao ver que, um conjunto de palavras (que na época não faziam sentido para mim)\n");
      out.write("        criava telas, formas e botões.<br />\n");
      out.write("        Aos 12 anos tive meu primeiro contato com a programação em si, ganhei um livro de python e foi lendo\n");
      out.write("        aquele livro que eu descobri o que queria fazer. Desde então obtive conhecimentos em outras linguagens\n");
      out.write("        como java, c# e php, obtive também conhecimentos em HTML, css, mysql, bootstrap etc.<br />\n");
      out.write("        Com 19 anos tive vontade de desenvolver aplicativos e foi ai que desenvolvi meu primeiro app\n");
      out.write("        para uma igreja, foi um app básico mas que me motivou a pesquisar mais e mais.<br /></p></div></div>\n");
      out.write(" \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
