/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Login;
import conexao.Conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DOUGLAS
 */
public class Buscar {
    Conexao conn = new Conexao();
    Login log = new Login();
    public static int codigoparasaldo;
    
    public boolean buscaCPFcomcod(String cpfdest){
        boolean existe = false;
        String cpfexiste = null;
        
        try{
            //Conectando ao banco de dados
            conn.conectar();
            //Pesquisar no banco de dados se o cpf do destinatario existe no DB
            String sqlcpfDest = "select cpf, coddados from dadoscad where cpf = ?";
            
            conn.pstm1 = conn.conn.prepareStatement(sqlcpfDest);
            conn.pstm1.setString(1, cpfdest);
            conn.rs = conn.pstm1.executeQuery();
            
            while(conn.rs.next()){
                codigoparasaldo = conn.rs.getInt("coddados");
                cpfexiste = conn.rs.getString("cpf");
            }
            
            if(cpfexiste.equals(cpfdest)){
                existe = true;
            }else{
                existe = false;
            }
            
            //conn.desconectar(conn.pstm1);
        }catch(ClassNotFoundException | SQLException e){
            
        }
        return existe;
    }
    
    public float buscavaloremconta(){
        float fundo = 0;
        
        try{
            //Conectando ao banco de dados
            conn.conectar();
            
            //Pesquisar saldo em conta do usuario
            String sqlSaldo = "select saldo from conta where coddadosconta = ?";
            
            conn.pstm1 = conn.conn.prepareStatement(sqlSaldo);
            conn.pstm1.setInt(1, log.codlogado);
            conn.rs = conn.pstm1.executeQuery();
            
            while(conn.rs.next()){
                fundo = conn.rs.getFloat("saldo");
            }
            //conn.desconectar(conn.pstm1);
        }catch(SQLException | ClassNotFoundException ec){
            JOptionPane.showMessageDialog(null, "Busca valor em conta: "+ec);
        }
        
        return fundo;
    }
    
    public String senhacorresponde(){
        String senha = null;
        
        try{
            //conectando ao banco de dados
            conn.conectar();
            
            //Pesquisando a senha do usuario logado
            String sqlsenha = "select senha from login where codlogin = ?";
            
            conn.pstm1 = conn.conn.prepareStatement(sqlsenha);
            conn.pstm1.setInt(1, log.codlogado);
            conn.rs = conn.pstm1.executeQuery();
            
            while(conn.rs.next()){
                senha = conn.rs.getString("senha");
            }
            
            //conn.desconectar(conn.pstm1);
        }catch(SQLException | ClassNotFoundException sc){
            JOptionPane.showMessageDialog(null, "senhacorresponde: "+sc);
        }
        
        
        
        return senha;
    }
    
    public int BuscaCodLog(String usuarioLogin){
        int codigo = 0;
        try{
            conn.conectar();
            
            String sql = "select codlogdados from login where usuario =?";
            conn.pstm1 = conn.conn.prepareStatement(sql);
            conn.pstm1.setString(1, usuarioLogin);
            conn.rs = conn.pstm1.executeQuery();
            
            while(conn.rs.next()){
                codigo = conn.rs.getInt("codlogdados");
            }
        }catch(SQLException | ClassNotFoundException sc){
            JOptionPane.showMessageDialog(null, sc);
        }
        
        return codigo;
    }
    
    public double buscaSaldoDest(){
        double saldo = 10000;
        
        try{
            conn.conectar();
            String sql = "select saldo from conta where coddadosconta = ?";
            
            conn.pstm1 = conn.conn.prepareStatement(sql);
            conn.pstm1.setInt(1, codigoparasaldo);
            conn.rs = conn.pstm1.executeQuery();
            
            while(conn.rs.next()){
                saldo = conn.rs.getDouble("saldo");
            }
        }catch(SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "ERRO BUSCA SALDO DEST:" +e);
        }
        
        return saldo;
    }
    
}
