/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.AdminDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author danil
 */
public class AdminDAO {
    Connection conn;
    
    public boolean existeAdmin(AdminDTO objadmindto) throws Exception {
        String sql = "SELECT *FROM tb_admin WHERE nome_admin = ? AND senha_admin = ?";
        conn = new ConexaoDAO().conectaBD();
                
        try ( PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, objadmindto.getNome_admin());
            pstm.setString(2, objadmindto.getSenha_admin());
            try ( ResultSet rs = pstm.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,"UsuarioDAO: " + e);
            return false;
        }
    }
}
