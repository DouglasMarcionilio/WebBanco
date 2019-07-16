package conexao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author DOUGLASMARCIONILIO
 */
public class Conexao{
    
    //Criando variaveis
    public Connection conn;
    public PreparedStatement pstm1, pstm2, pstm3;
    public ResultSet rs, rs2;
    public String erro;
    
    //Criando metodo para conectar ao banco de dados
    public void conectar() throws ClassNotFoundException{
    String url = "jdbc:mysql://localhost:3306/bancogohan?useTimezone=true&serverTimezone=UTC";
    String user = "root";
    String pass = "root";
    
    
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url,user,pass);
    }catch(SQLException e){
        erro = "Erro(conectar) SQLException: "+e;
    }
    }
    
    //Criando metodo para fechar conexoes
    public void desconectar(PreparedStatement stm1){
        try{
            conn.close();
            stm1.close();
        }catch(SQLException e){
            erro = "Erro(Desconctar) SQLException: "+e;
        }
    }
    public void desconectar(PreparedStatement stm1, PreparedStatement stm2 ){
        try{
            conn.close();
            stm1.close();
            stm2.close();
        }catch(SQLException e){
            erro = "Erro(Desconctar) SQLException: "+e;
        }
    }
    public void desconectar(PreparedStatement stm1, PreparedStatement stm2, PreparedStatement stm3){
        try{
            conn.close();
            stm1.close();
            stm2.close();
            stm3.close();
        }catch(SQLException e){
            erro = "Erro(Desconctar) SQLException: "+e;
        }
    }
    public void desconectar(PreparedStatement stm1, PreparedStatement stm2, PreparedStatement stm3, ResultSet rst){
        try{
            conn.close();
            stm1.close();
            stm2.close();
            stm3.close();
            rst.close();
        }catch(SQLException e){
            erro = "Erro(Desconctar) SQLException: "+e;
        }
    }
    public void desconectar(PreparedStatement stm1, ResultSet rst){
        try{
            conn.close();
            stm1.close();
        }catch(SQLException e){
            erro = "Erro(Desconctar) SQLException: "+e;
        }
    }
    public void desconectar(PreparedStatement stm1, PreparedStatement stm2, ResultSet rst ){
        try{
            conn.close();
            stm1.close();
            stm2.close();
        }catch(SQLException e){
            erro = "Erro(Desconctar) SQLException: "+e;
        }
    }
    
    
}