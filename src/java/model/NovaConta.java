/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Cadastro;
import com.mysql.cj.protocol.Resultset;
import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

/**
 *
 * @author DOUGLAS
 */
public class NovaConta {
    
    
    public int buscar() throws SQLException, ClassNotFoundException{
        Conexao conn = new Conexao();
        Cadastro cad = new Cadastro();
        int neo = 0, num;
        conn.conectar();
        String sqlBusca = "select coddados from dadoscad where nome= ?";
        conn.pstm1 = conn.conn.prepareStatement(sqlBusca);
        conn.pstm1.setString(1, cad.name);
        conn.rs =conn.pstm1.executeQuery();
        
        while(conn.rs.next()){
            neo = conn.rs.getInt("coddados");
        }
        num = neo;
        
        return num;
    }
    
    public void inserirContaNova() throws ClassNotFoundException, SQLException{
        Conexao conn = new Conexao();
        Random aleat = new Random();
        int aleatorio = 0;
        float saldo = 0;
        boolean ativa = true;
        
        
        for(int x = 0; x<1; x++){
            aleatorio = aleat.nextInt(1000000);
        }
        String sqlcadconta = "insert into conta (idconta, saldo, ativa, coddadosconta) values(?,?,?,?)";
        
        conn.conectar();
        conn.pstm2 = conn.conn.prepareStatement(sqlcadconta);
        conn.pstm2.setInt(1, aleatorio);
        conn.pstm2.setFloat(2, saldo);
        conn.pstm2.setBoolean(3, ativa);
        conn.pstm2.setInt(4, buscar());
        
        conn.pstm2.execute();
    }
}

    

