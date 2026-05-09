/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.GpfVendasProdutos;
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
public class DaoGpfVendasProdutos extends DaoAbstract {

    @Override
    public void insert(Object object) {
        GpfVendasProdutos bean = (GpfVendasProdutos) object;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://localhost/db_giovani_pesoti";
            user = "root";
            password = "";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into gpf_vendas_produtos (gpf_idVenda, gpf_idProduto, gpf_quantidade, gpf_valorUnitario, gpf_subtotal, gpf_descontoItem) values (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, bean.getGpfIdVenda());
            pst.setInt(2, bean.getGpfIdProduto());
            pst.setInt(3, bean.getGpfQuantidade());
            pst.setDouble(4, bean.getGpfValorUnitario());
            pst.setDouble(5, bean.getGpfSubtotal());
            pst.setDouble(6, bean.getGpfDescontoItem());
            pst.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoGpfVendasProdutos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoGpfVendasProdutos.class.getName()).log(Level.SEVERE, null, ex);
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
    public void list(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void listAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
