/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Depositar;
import controller.Login;
import controller.Transferencia;
import conexao.Conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DOUGLAS
 */
public class Update {
    Conexao conn = new Conexao();
    Transferencia transferencia = new Transferencia();
    Buscar buscas = new Buscar();
    Login log = new Login();
    
    public void updateSaldoDest(double valorTransferencia, int codigoParaSaldo){
        
        try{
            //conectando ao DB
            conn.conectar();
            
            //Fazendo update de valor
            String sql = "update conta set saldo = ? where coddadosconta = ?";        
            conn.pstm1 = conn.conn.prepareStatement(sql);
            conn.pstm1.setDouble(1, (buscas.buscaSaldoDest() + valorTransferencia));
            conn.pstm1.setInt(2, codigoParaSaldo);
            conn.pstm1.executeUpdate();
            
            conn.desconectar(conn.pstm1);
        }catch(SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "updateSaldoDest: "+e);
        }
        
    }
    public void updateSaldoLogadoMenos(double valorTransferencia, float saldoConta, int codigoLog){
        
        try{
            //conectando ao DB
            conn.conectar();
            
            //Fazendo update de valor
            String sql = "update conta set saldo = ? where coddadosconta = ?";        
            conn.pstm1 = conn.conn.prepareStatement(sql);
            conn.pstm1.setDouble(1, (saldoConta - valorTransferencia));
            conn.pstm1.setInt(2, codigoLog);
            conn.pstm1.executeUpdate();
            
            conn.desconectar(conn.pstm1);
        }catch(SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "updateSaldoDest: "+e);
        }
        
    }
    
    public void updateSaldoLogadoMais(double valorDeposito){
        
        try{
            //conectando ao DB
            conn.conectar();
            
            //Fazendo update de valor
            String sql = "update conta set saldo = ? where coddadosconta = ?";        
            conn.pstm1 = conn.conn.prepareStatement(sql);
            conn.pstm1.setDouble(1, (buscas.buscaSaldoDest() + valorDeposito));
            conn.pstm1.setInt(2, log.codlogado);
            conn.pstm1.executeUpdate();
            
            conn.desconectar(conn.pstm1);
        }catch(SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "updateSaldoDest: "+e);
        }
        
    }
    
    public void updateTransacao(String tipo, String valor, int codigoconta){
        
        try{
            //conectando ao DB
            conn.conectar();
            
            //Fazendo update de valor
            String sql = "insert into transacoes(tipo, valor, coddadoscad) values(?,?,?)";
            conn.pstm1 = conn.conn.prepareStatement(sql);
            conn.pstm1.setString(1, tipo);
            conn.pstm1.setString(2, valor);
            conn.pstm1.setInt(3, codigoconta);
            
            conn.desconectar(conn.pstm1);
        }catch(SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "ERRO UPDATETRANSACAO: "+e);
        }
    }
}
