/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.GpfFormaPagamento;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giovani
 */
public class DaoGpfFormaPagamento extends DaoAbstract {

    @Override
    public void insert(Object object) {
        GpfFormaPagamento bean = (GpfFormaPagamento) object;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url, user, password;
//            url = "jdbc:mysql://10.7.0.51:33062/db_giovani_feltrin";
//            user = "giovani_feltrin";
//            password = "giovani_feltrin";
            url = "jdbc:mysql://localhost/db_giovani_pesoti";
            user = "root";
            password = "";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into gpf_forma_pagamento (gpf_descricao, gpf_numeroParcelas, gpf_taxaJuros, gpf_prazoDias, gpf_ativo, gpf_tipo) values (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setString(1, bean.getGpfDescricao());
            pst.setInt(2, bean.getGpfNumeroParcelas());
            pst.setDouble(3, bean.getGpfTaxaJuros());
            pst.setInt(4, bean.getGpfPrazoDias());
            pst.setString(5, bean.getGpfAtivo());
            pst.setString(6, bean.getGpfTipo());
            pst.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoGpfFormaPagamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoGpfFormaPagamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Object object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object list(int id) {
        return null;
    }

    @Override
    public Object listAll() {
        return null;
    }
}
