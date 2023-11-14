/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author 822166164
 */
import DTO.ProjetoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProjetoDAO {
    Connection conn;
    
    public boolean existeProjeto(ProjetoDTO objprojetodto) throws Exception {
        
        String sql = "SELECT *FROM tb_projetos WHERE cod_projeto = ?";
        conn = new ConexaoDAO().conectaBD();
                
        try ( PreparedStatement pstm = conn.prepareStatement(sql)) {
            String codigo_projeto = String.valueOf(objprojetodto.getCod_projeto());
            pstm.setString(1, codigo_projeto);
    
            try ( ResultSet rs = pstm.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,"ProjetoDAO: " + e);
            return false;
        }
    }
        
    public ProjetoDTO[] obterProjeto() throws Exception {
        String sql = "SELECT * FROM tb_projetos";
        conn = new ConexaoDAO().conectaBD();
        try (
                PreparedStatement ps
                = conn.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);  
            ResultSet rs = ps.executeQuery()) {
            int totalDeProjetos = rs.last() ? rs.getRow() : 0;
            ProjetoDTO[] projetos = new ProjetoDTO[totalDeProjetos];
            rs.beforeFirst();
            int contador = 0;
            while (rs.next()) {
                int id = rs.getInt("cod_projeto");
                String nome = rs.getString("nome_projeto");
                String descricao = rs.getString("descricao_projeto");
                String tipoODS = rs.getString("tipoODS_projeto");
                String responsavel = rs.getString("responsavel_projeto");
                String telefone = rs.getString("telefone_projeto");
                String data_criacao = rs.getString("data_criacao");
                String status = rs.getString("status_projeto");
                projetos[contador++] = new ProjetoDTO(id, nome, descricao, tipoODS, responsavel, 
                        telefone, data_criacao, status);
            }
            return projetos;
        }
    }
    
    public ProjetoDTO consultarProjeto(ProjetoDTO projeto, String codigo) throws Exception{
        String sql = "SELECT * FROM tb_projetos WHERE cod_projeto = ?";
        
        try {
                conn = new ConexaoDAO().conectaBD();
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, codigo);
                ResultSet rs = ps.executeQuery();
                if (rs.next()){
                    int id = rs.getInt("cod_projeto");
                    String nome = rs.getString("nome_projeto");
                    String descricao = rs.getString("descricao_projeto");
                    String tipoODS = rs.getString("tipoODS_projeto");
                    String responsavel = rs.getString("responsavel_projeto");
                    String telefone = rs.getString("telefone_projeto");
                    String data_criacao = rs.getString("data_criacao");
                    String status = rs.getString("status_projeto");
                    projeto = new ProjetoDTO(id, nome, descricao, tipoODS, responsavel, 
                        telefone, data_criacao, status);
                    return projeto;
                } else {
                    JOptionPane.showMessageDialog(null, "Projeto nao encontrado!");
                    return null;
                }
        }
        catch (Exception e) {         
            JOptionPane.showMessageDialog(null, "projetoDAO" + e);
            return null;
        }
            
    }
    
    
    public void adicionarProjeto(String nome, String descricao, String tipoODS, String responsavel, String telefone,
                            String data_criacao, String status) {
        Connection conn;
        PreparedStatement pstm;
        String sql = "INSERT INTO tb_projetos (nome_projeto, descricao_projeto, tipoODS_projeto, responsavel_projeto, " +
                "telefone_projeto, data_criacao, status_projeto)" + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        conn = new ConexaoDAO().conectaBD();
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, nome);
            pstm.setString(2, descricao);
            pstm.setString(3, tipoODS);
            pstm.setString(4, responsavel);
            pstm.setString(5, telefone);
            pstm.setString(6, data_criacao);
            pstm.setString(7, status);
            
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "projetoDAO" + e);
        }
    }
        
    public void removerProjeto(String codigo) {
        Connection conn;
        PreparedStatement pstm;
        String sql = "DELETE FROM tb_projetos WHERE cod_projeto = ?";
        conn = new ConexaoDAO().conectaBD();
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, Integer.parseInt(codigo));
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "projetoDAO" + e);
        }
    }
    
    public void atualizarProjeto(String codigo, String nome, String descricao, String tipoODS, String responsavel,
            String telefone, String data_criacao, String status) {
        Connection conn;
        PreparedStatement pstm;
        String sqlNome = "UPDATE tb_projetos SET nome_projeto = ? WHERE cod_projeto = ?";
        String sqlDescricao = "UPDATE tb_projetos SET descricao_projeto = ? WHERE cod_projeto = ?";
        String sqlTipoODS = "UPDATE tb_projetos SET tipoODS_projeto = ? WHERE cod_projeto = ?";
        String sqlResponsavel = "UPDATE tb_projetos SET responsavel_projeto = ? WHERE cod_projeto = ?";
        String sqlTelefone = "UPDATE tb_projetos SET telefone_projeto = ? WHERE cod_projeto = ?";
        String sqlData = "UPDATE tb_projetos SET data_criacao = ? WHERE cod_projeto = ?";
        String sqlStatus = "UPDATE tb_projetos SET status_projeto = ? WHERE cod_projeto = ?";
        
        conn = new ConexaoDAO().conectaBD();
        if (!"".equals(nome)) {
            try {
                pstm = conn.prepareStatement(sqlNome);
                pstm.setString(1, nome);
                pstm.setInt(2, Integer.parseInt(codigo));
                pstm.execute();
                pstm.close();
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "projetoAO" + e);
            }
        }
        if (!"".equals(descricao)) {
            try {   
                pstm = conn.prepareStatement(sqlDescricao);
                pstm.setString(1, descricao);
                pstm.setInt(2, Integer.parseInt(codigo));
                pstm.execute();
                pstm.close();
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "projetoDAO" + e);
            }
        }
        if (!"".equals(tipoODS)) {
            try {
                pstm = conn.prepareStatement(sqlTipoODS);
                pstm.setString(1, nome);
                pstm.setInt(2, Integer.parseInt(codigo));
                pstm.execute();
                pstm.close();
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "projetoAO" + e);
            }
        }
        if (!"".equals(responsavel)) {
            try {
                pstm = conn.prepareStatement(sqlResponsavel);
                pstm.setString(1, nome);
                pstm.setInt(2, Integer.parseInt(codigo));
                pstm.execute();
                pstm.close();
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "projetoAO" + e);
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
            JOptionPane.showMessageDialog(null, "projetoDAO" + e);
            }
        }
        if (!"".equals(data_criacao)) {
            try {
                pstm = conn.prepareStatement(sqlData);
                pstm.setString(1, nome);
                pstm.setInt(2, Integer.parseInt(codigo));
                pstm.execute();
                pstm.close();
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "projetoAO" + e);
            }
        }
        if (!"".equals(status)) {
            try {
                pstm = conn.prepareStatement(sqlStatus);
                pstm.setString(1, nome);
                pstm.setInt(2, Integer.parseInt(codigo));
                pstm.execute();
                pstm.close();
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "projetoAO" + e);
            }
        }
    }
}
