/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.GpfUsuarios;
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
public class DaoGpfUsuarios extends DaoAbstract {

    @Override
    public void insert(Object object) {
        GpfUsuarios bean = (GpfUsuarios) object;
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
            String sql = "insert into gpf_usuarios (gpf_nome, gpf_apelido, gpf_cpf, gpf_dataNascimento, gpf_senha, gpf_nivel, gpf_ativo) values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setString(1, bean.getGpfNome());
            pst.setString(2, bean.getGpfApelido());
            pst.setString(3, bean.getGpfCpf());
            pst.setDate(4, new java.sql.Date(bean.getGpfDataNascimento().getTime()));
            pst.setString(5, bean.getGpfSenha());
            pst.setInt(6, bean.getGpfNivel());
            pst.setString(7, bean.getGpfAtivo());
            pst.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoGpfUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoGpfUsuarios.class.getName()).log(Level.SEVERE, null, ex);
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
