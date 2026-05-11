/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.GpfVendas;
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
public class DaoGpfVendas extends DaoAbstract {

    @Override
    public void insert(Object object) {
        GpfVendas bean = (GpfVendas) object;
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
            String sql = "insert into gpf_vendas (gpf_dataVenda, gpf_idCliente, gpf_idUsuario, gpf_idFormaPagamento, gpf_total, gpf_status) values (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setDate(1, new java.sql.Date(bean.getGpfDataVenda().getTime()));
            pst.setInt(2, bean.getGpfIdCliente());
            pst.setInt(3, bean.getGpfIdUsuario());
            pst.setInt(4, bean.getGpfIdFormaPagamento());
            pst.setDouble(5, bean.getGpfTotal());
            pst.setString(6, bean.getGpfStatus());
            pst.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoGpfVendas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoGpfVendas.class.getName()).log(Level.SEVERE, null, ex);
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
