/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import conexao.Conexao;
import java.sql.SQLException;

/**
 *
 * @author DOUGLAS
 */
public class Inserir {
    
    public void inserir(String nomecad, int idadecad, String cpfcad){
        Conexao conn = new Conexao();
        String sql = "insert into dadoscad(nome, idade, cpf) values(?,?,?)";
        
        
        try{
            conn.conectar();
            conn.pstm1 = conn.conn.prepareStatement(sql);
            conn.pstm1.setString(1, nomecad.toUpperCase());
            conn.pstm1.setInt(2, idadecad);
            conn.pstm1.setString(3, cpfcad);
            
            
            conn.pstm1.execute();
            
            conn.desconectar(conn.pstm1);
        }catch(SQLException e){
            conn.erro = "Erro SQLException: "+e;
        }catch(ClassNotFoundException c){
            conn.erro = "Erro SQLException: "+c;
        }
    }
    
    public void inserirLog(String usuariocad, String senhacad, String nomecad){
        Conexao conn = new Conexao();
        String sqlbuscid = "select coddados from dadoscad where nome= ?";
        String sql1 = "insert into login(usuario, senha, codlogdados) values(?,?,?)";
        int codigo = 0;
        try{
            conn.conectar();
            
            conn.pstm3 = conn.conn.prepareStatement(sqlbuscid);
            conn.pstm3.setString(1, nomecad);
            conn.rs = conn.pstm3.executeQuery();
            
            while(conn.rs.next()){
                codigo = conn.rs.getInt("coddados");
            }
            
            conn.pstm2 = conn.conn.prepareStatement(sql1);
            conn.pstm2.setString(1, usuariocad.toUpperCase());
            conn.pstm2.setString(2, senhacad);
            conn.pstm2.setInt(3, codigo);
            
            conn.pstm2.execute();
            
            conn.desconectar(conn.pstm2, conn.pstm3);
        }catch(ClassNotFoundException | SQLException e){
            
        }
    }
}
