/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Buscar;
import conexao.Conexao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import model.Update;

/**
 *
 * @author DOUGLAS
 */
public class Transferencia extends HttpServlet {
    
    public double valortransf;
    public static String senhasua;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String cpfdest;
        
        //Instanciando obj
        Conexao conn = new Conexao();
        Login log = new Login();
        Buscar buscas = new Buscar();
        Update update = new Update();
        
        //Recebendo dados enviados do formulario
        cpfdest = req.getParameter("cpfdest");
        valortransf = Float.parseFloat(req.getParameter("valortransf"));
        senhasua = req.getParameter("suasenha");
        
        if(!buscas.buscaCPFcomcod(cpfdest)){
            JOptionPane.showConfirmDialog(null, "DESTINATÁRIO NÃO POSSUI CADASTRO NESTE BANCO");
            req.getRequestDispatcher("transferir.jsp").forward(req, resp);
        }else{
        
            if(!senhasua.equals(buscas.senhacorresponde())){
                JOptionPane.showMessageDialog(null, "SENHA INCORRETA!");
                if(!resp.isCommitted()){
                req.getRequestDispatcher("areaCliente.jsp").forward(req, resp);
                }
            }else{

                if(buscas.buscavaloremconta() >= valortransf){
                    update.updateSaldoLogadoMenos(valortransf, buscas.buscavaloremconta(), log.codlogado);
                    update.updateSaldoDest(valortransf, buscas.codigoparasaldo);
                    update.updateTransacao("Transferência", "-"+valortransf, log.codlogado);
                    update.updateTransacao("Trensferência recebida", "+"+valortransf, buscas.codigoparasaldo);
                    JOptionPane.showMessageDialog(null, "TRANSFERÊNCIA BEM SUCEDIDA!!! POR SEGURANÇA SERÁ REDIRECIONADO PARA A PAGINA DE LOGIN");
                    if(!resp.isCommitted()){
                        req.getRequestDispatcher("index.html").forward(req, resp);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "VOCÊ NÃO POSSUI SALDO SUFICIENTE PARA ESSA TRANSAÇÃO!!! POR SEGURANÇA SERÁ REDIRECIONADO PARA A PAGINA DE LOGIN");
                    if(!resp.isCommitted()){
                        req.getRequestDispatcher("transferir.jsp").forward(req, resp);
                    }
                }
            }
        }
    }
}
