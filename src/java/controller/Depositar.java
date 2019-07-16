/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Buscar;
import java.io.IOException;
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
public class Depositar extends HttpServlet {
    Login log = new Login();
    Update update = new Update();
    Buscar buscas = new Buscar();
    public float valorParaDeposito;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        valorParaDeposito = Float.parseFloat(req.getParameter("deposito"));
        try{
        update.updateSaldoLogadoMais(valorParaDeposito);
        update.updateTransacao("Deposito","+ "+valorParaDeposito, log.codlogado);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro:"+e);
        }
        
        req.getRequestDispatcher("areaCliente.jsp").forward(req, resp);
    }
    
}
