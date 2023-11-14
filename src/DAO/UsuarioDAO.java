/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author 822166164
 */
public class UsuarioDAO {
    Connection conn;
    
    public boolean existeUsuario(UsuarioDTO objusuariodto) throws Exception {
        
        String sql = "SELECT *FROM tb_usuarios WHERE email_usuario = ? AND senha_usuario = ?";
        conn = new ConexaoDAO().conectaBD();
                
        try ( PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, objusuariodto.getEmail_usuario());
            pstm.setString(2, objusuariodto.getSenha_usuario());
            try ( ResultSet rs = pstm.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,"UsuarioDAO: " + e);
            return false;
        }
    }
    
    
    
    public boolean existeEmail(UsuarioDTO objusuariodto) throws Exception {
        
        String sql = "SELECT *FROM tb_usuarios WHERE email_usuario = ?";
        conn = new ConexaoDAO().conectaBD();
                
        try ( PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, objusuariodto.getEmail_usuario());
            try ( ResultSet rs = pstm.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            return false;
        }
    }
    
    
    public UsuarioDTO[] obterUsuario() throws Exception {
        String sql = "SELECT * FROM tb_usuarios";
        conn = new ConexaoDAO().conectaBD();
        try (
                PreparedStatement ps
                = conn.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);  
            ResultSet rs = ps.executeQuery()) {
            int totalDeUsuarios = rs.last() ? rs.getRow() : 0;
            UsuarioDTO[] usuarios = new UsuarioDTO[totalDeUsuarios];
            rs.beforeFirst();
            int contador = 0;
            while (rs.next()) {
                int id = rs.getInt("cod_usuario");
                String nome = rs.getString("nome_usuario");
                String email = rs.getString("email_usuario");
                String telefone = rs.getString("telefone_usuario");
                usuarios[contador++] = new UsuarioDTO(id, nome, email, telefone);
            }
            return usuarios;
        }
    }
    
    public UsuarioDTO consultarUsuario(UsuarioDTO usuario, String codigo) throws Exception{
        String sql = "SELECT * FROM tb_usuarios WHERE cod_usuario = ?";
        try {
            conn = new ConexaoDAO().conectaBD();
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setString(1, codigo);
            ResultSet rs  = ps.executeQuery();
            if (rs.next()){
                int id = rs.getInt("cod_usuario");
                String nome = rs.getString("nome_usuario");
                String email = rs.getString("email_usuario");
                String telefone = rs.getString("telefone_usuario");
                usuario = new UsuarioDTO(id, nome, email, telefone);
                return usuario;
            } else {
                JOptionPane.showMessageDialog(null, "Usuario nao encontrado!");
                return null;
            }
            
        }
        catch (Exception e) {         
            JOptionPane.showMessageDialog(null, "usuarioDAO" + e);
            return null;
        }    
    }
    
    public void adicionarUsuario(String nome, String email, String senha, String telefone) {
        Connection conn;
        PreparedStatement pstm;
        String sql = "INSERT INTO tb_usuarios (nome_usuario, email_usuario, senha_usuario, telefone_usuario)" +
                "VALUES (?, ?, ?, ?)";
        conn = new ConexaoDAO().conectaBD();
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, nome);
            pstm.setString(2, email);
            pstm.setString(3, senha);
            pstm.setString(4, telefone);
            
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "usuarioDAO" + e);
        }
    }
        
    public void removerUsuario(String codigo) {
        Connection conn;
        PreparedStatement pstm;
        String sql = "DELETE FROM tb_usuarios WHERE cod_usuario = ?";
        conn = new ConexaoDAO().conectaBD();
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, Integer.parseInt(codigo));
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "usuarioDAO" + e);
        }
    }
    
    public void atualizarUsuario(String codigo, String nome, String email, String telefone) {
        Connection conn;
        PreparedStatement pstm;
        String sqlNome = "UPDATE tb_usuarios SET nome_usuario = ? WHERE cod_usuario = ?";
        String sqlEmail = "UPDATE tb_usuarios SET email_usuario = ? WHERE cod_usuario = ?";
        String sqlTelefone = "UPDATE tb_usuarios SET telefone_usuario = ? WHERE cod_usuario = ?";
        conn = new ConexaoDAO().conectaBD();
        if (!"".equals(nome)) {
            try {
                pstm = conn.prepareStatement(sqlNome);
                pstm.setString(1, nome);
                pstm.setInt(2, Integer.parseInt(codigo));
                pstm.execute();
                pstm.close();
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "usuarioAO" + e);
            }
        }
        if (!"".equals(email)) {
            try {   
                pstm = conn.prepareStatement(sqlEmail);
                pstm.setString(1, email);
                pstm.setInt(2, Integer.parseInt(codigo));
                pstm.execute();
                pstm.close();
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "usuarioDAO" + e);
            }
        }
        if (!"".equals(telefone)) {
            try {
                pstm = conn.prepareStatement(sqlTelefone);
                pstm.setString(1, telefone);
                pstm.setInt(2, Integer.parseInt(codigo));
                pstm.execute();
                pstm.close();
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "usuarioDAO" + e);
            }
        } 
    }
    
}
