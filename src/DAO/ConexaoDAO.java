/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 822166164
 */
public class ConexaoDAO {
    
    private static String host = "localhost";
    private static String port = "3306";
    private static String db = "GerenciadorDeProjetos";
    private static String user = "root";
    private static String pass = "anima123";
    
    public Connection conectaBD(){
         Connection conn = null;
         
        try {
            String url = String.format(
                "jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=UTC",
                host,
                port,
                db
            );
            
            conn = DriverManager.getConnection(url, user,pass);
            
        
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null,"Error ConexaoDAO" + e.getMessage());
        }
         return conn;
         
    }
}
