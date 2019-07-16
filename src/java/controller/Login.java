package controller;

import model.Buscar;
import conexao.Conexao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author DOUGLASMARCIONILIO
 */
public class Login extends HttpServlet {

    public static int codlogado;
    public static String userario;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Criação das Variaveis
        String usuario, senha, user1, pass1;
        String neo = "a", password = null;
        
        //Recebendo os dados do formulario
        String user = req.getParameter("usuario");
        String pass = req.getParameter("senha");
        userario = user;
        
        //Deixando o usuario em caixa alta para pesquisa no DB
        usuario = user.toUpperCase();
        
        //Instnciando obj
        Conexao conn = new Conexao();
        Cadastro cad = new Cadastro();
        Buscar buscas = new Buscar();
        
        
        
        try{
            //Iniciando a conexão
            conn.conectar();
            //SQL Sintaxe
            String sqlBusca1 = "select usuario, senha, codlogdados from login where usuario= ?";
            conn.pstm1 = conn.conn.prepareStatement(sqlBusca1);
            conn.pstm1.setString(1, usuario);
            conn.rs =conn.pstm1.executeQuery();
            
            //Pegando o valor do banco e armazenando na variavel neo
            while(conn.rs.next()){
                neo = conn.rs.getString("senha");
            }
            
            codlogado = buscas.BuscaCodLog(usuario);
        //Pegando exceções
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }catch(ClassNotFoundException r){
            
        }
        
        
        try{
            //Testando a senha do banco com a inserida pelo usuario
            if(pass.equals(neo)){
                JOptionPane.showMessageDialog(null, codlogado);
                req.getRequestDispatcher("areaCliente.jsp").forward(req, resp);
            }else{
                try (PrintWriter out = resp.getWriter()) {
                    out.print("<h1>SENHA INCORRETA!!</h1>");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
