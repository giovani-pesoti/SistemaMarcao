/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.GpfFornecedor;
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
public class DaoGpfFornecedor extends DaoAbstract {

    @Override
    public void insert(Object object) {
        GpfFornecedor bean = (GpfFornecedor) object;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://localhost/db_giovani_pesoti";
            user = "root";
            password = "";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into gpf_fornecedor (gpf_razaoSocial, gpf_nomeFantasia, gpf_cnpj, gpf_inscricaoEstadual, gpf_email, gpf_telefone, gpf_celular, gpf_cep, gpf_endereco, gpf_numero, gpf_bairro, gpf_cidade, gpf_estado, gpf_contatoResponsavel, gpf_ativo) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setString(1, bean.getGpfRazaoSocial());
            pst.setString(2, bean.getGpfNomeFantasia());
            pst.setString(3, bean.getGpfCnpj());
            pst.setString(4, bean.getGpfInscricaoEstadual());
            pst.setString(5, bean.getGpfEmail());
            pst.setString(6, bean.getGpfTelefone());
            pst.setString(7, bean.getGpfCelular());
            pst.setString(8, bean.getGpfCep());
            pst.setString(9, bean.getGpfEndereco());
            pst.setString(10, bean.getGpfNumero());
            pst.setString(11, bean.getGpfBairro());
            pst.setString(12, bean.getGpfCidade());
            pst.setString(13, bean.getGpfEstado());
            pst.setString(14, bean.getGpfContatoResponsavel());
            pst.setString(15, bean.getGpfAtivo());
            pst.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoGpfFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoGpfFornecedor.class.getName()).log(Level.SEVERE, null, ex);
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
