/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.AdminDAO;
import DAO.UsuarioDAO;
import DTO.AdminDTO;
import DTO.UsuarioDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author 823157005
 */
public class LoginTela extends javax.swing.JFrame {
    public boolean Preenchido(){
        if(textEmail.getText().isEmpty()||textSenha.getText().isEmpty()){
            return false;
        }
        return true;
    }
    /**
     * Creates new form telaLogin
     */
    public LoginTela() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textEmail = new javax.swing.JTextField();
        textSenha = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textEmail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textEmail.setBorder(null);
        textEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });
        getContentPane().add(textEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 440, 60));

        textSenha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textSenha.setBorder(null);
        textSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(textSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 440, 60));

        loginButton.setBorder(null);
        loginButton.setContentAreaFilled(false);
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 409, 310, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/Image/6.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String login = textEmail.getText();
        String senha = new String(textSenha.getPassword());
        try {
            if("admin".equals(login)){
                AdminDTO admin = new AdminDTO(login, senha);
                AdminDAO dao = new AdminDAO();
                if (dao.existeAdmin(admin)) {
                //JOptionPane.showMessageDialog(null, "Bem-vindo, " + usuario.getNome());
                DashboardAdminTela dt = new DashboardAdminTela();
                dt.setVisible(true);
                this.dispose();
                }
                 else {
                JOptionPane.showMessageDialog(null, "Oh-Oh");
                }
            } else {
                UsuarioDTO usuario = new UsuarioDTO(login, senha);
                UsuarioDAO dao = new UsuarioDAO();
                if (dao.existeUsuario(usuario)) {
                //JOptionPane.showMessageDialog(null, "Bem-vindo, " + usuario.getNome());
                DashboardTela dt = new DashboardTela();
                dt.setVisible(true);
                this.dispose();
                }
                 else {
                JOptionPane.showMessageDialog(null, "Oh-Oh");
                }
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Sistema fora do ar, tente mais tarde!");
            e.printStackTrace();
        }
        /*
        if(this.Preenchido()){
        DashboardTela ds = new DashboardTela();
        ds.setVisible(true);
        this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Para efetuar o seu login, todos os campos são obrigatórios");
        }
        */
    }//GEN-LAST:event_loginButtonActionPerformed

    private void textSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSenhaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField textEmail;
    private javax.swing.JPasswordField textSenha;
    // End of variables declaration//GEN-END:variables
}
