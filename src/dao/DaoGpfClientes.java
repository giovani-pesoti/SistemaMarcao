/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.GpfClientes;
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
public class DaoGpfClientes extends DaoAbstract {

    @Override
    public void insert(Object object) {
        GpfClientes bean = (GpfClientes) object;
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
            String sql = "insert into gpf_cliente (gpf_nome, gpf_cpf, gpf_rg, gpf_dataNascimento, gpf_email, gpf_telefone, gpf_celular, gpf_cep, gpf_endereco, gpf_numero, gpf_bairro, gpf_cidade, gpf_estado, gpf_complemento, gpf_ativo) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setString(1, bean.getGpfNome());
            pst.setString(2, bean.getGpfCpf());
            pst.setString(3, bean.getGpfRg());
            pst.setDate(4, new java.sql.Date(bean.getGpfDataNascimento().getTime()));
            pst.setString(5, bean.getGpfEmail());
            pst.setString(6, bean.getGpfTelefone());
            pst.setString(7, bean.getGpfCelular());
            pst.setString(8, bean.getGpfCep());
            pst.setString(9, bean.getGpfEndereco());
            pst.setString(10, bean.getGpfNumero());
            pst.setString(11, bean.getGpfBairro());
            pst.setString(12, bean.getGpfCidade());
            pst.setString(13, bean.getGpfEstado());
            pst.setString(14, bean.getGpfComplemento());
            pst.setString(15, bean.getGpfAtivo());
            pst.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoGpfClientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoGpfClientes.class.getName()).log(Level.SEVERE, null, ex);
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
