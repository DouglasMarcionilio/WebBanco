package controller;

import conexao.Conexao;
import model.Inserir;
import model.NovaConta;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DOUGLASMARCIONILIO
 */
public class Cadastro extends HttpServlet {
    public String name;
    int neo;
    String ccpf;

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //Instanciando um obj do tipo Conexão
        Conexao conn = new Conexao();
        
        //Instanciando um obj do tipo Inserir
        Inserir insert = new Inserir();
        
        //Instanciando um obj do tipo NovaConta
        NovaConta nc = new NovaConta();
        
        //Recebendo dados enviados do jsp
        String nome = req.getParameter("nome");
        String usuario = req.getParameter("usuario");
        String senha = req.getParameter("senha");
        
        //Mudando os espaços do nome para /
        name = nome.replaceAll(" ", "/");
        
        //recebendo os dados do jsp e transformando-os em inteiros
        int idade = Integer.parseInt(req.getParameter("idade"));
        String cpf = req.getParameter("cpf");
        
        //try para tentar inserir os dados do formulario no banco de dados;
        try{
            conn.conectar();
            
            //Realizando buca do cpf inserido
            String sqlBusca1 = "select cpf from dadoscad where cpf= ?";
            conn.pstm1 = conn.conn.prepareStatement(sqlBusca1);
            conn.pstm1.setString(1, cpf);
            conn.rs =conn.pstm1.executeQuery();

            //Verificando se o cpf ja esta cadastrado no DB
            if(conn.rs.next()){
                req.getRequestDispatcher("existe.jsp").forward(req, resp);
            }else{

                insert.inserir(name, idade, cpf);
                insert.inserirLog(usuario, senha, name);
            }

            //Inicio do codigo de busca, para localizar o id da conta recem inserida
            //Variaveis para receber o Result Set
            int neo = 0, num;

            //String SQL de busca
            String sqlBusca = "select coddados from dadoscad where nome= ?";
            conn.pstm1 = conn.conn.prepareStatement(sqlBusca);
            conn.pstm1.setString(1, name);
            conn.rs =conn.pstm1.executeQuery();

            while(conn.rs.next()){
                neo = conn.rs.getInt("coddados");
            }
            num = neo;

            //Inicio do codigo de inserção da nova conta com base no id do cliente recem cadastrado
            Random aleat = new Random();
            int aleatorio = 0;
            float saldo = 0;
            boolean ativa = true;

            //Gerando um numero aleatorio de 7 digitos para o id da conta
            for(int x = 0; x<1; x++){
                aleatorio = aleat.nextInt(1000000);
            }
            
            //String SQL para abertuda de um conta
            String sqlcadconta = "insert into conta (idconta, saldo, ativa, coddadosconta) values(?,?,?,?)";
            conn.pstm2 = conn.conn.prepareStatement(sqlcadconta);
            conn.pstm2.setInt(1, aleatorio);
            conn.pstm2.setFloat(2, saldo);
            conn.pstm2.setBoolean(3, ativa);
            conn.pstm2.setInt(4, num);

            conn.pstm2.execute();


        //captura de Exceções
        }catch(ClassNotFoundException r){
            
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Direcionando para a pagina inicial
        if (!resp.isCommitted()){
        req.getRequestDispatcher("index.html").forward(req, resp);}
    }
    
}
