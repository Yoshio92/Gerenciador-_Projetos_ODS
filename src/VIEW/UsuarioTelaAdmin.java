/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.ConexaoDAO;
import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JOptionPane;
/**
 *
 * @author danil
 */
public class UsuarioTelaAdmin extends javax.swing.JFrame {

    /**
     * Creates new form UsuarioTela
     */
    public UsuarioTelaAdmin() {
        super ("Usuarios");
        initComponents();
        buscarUsuarios();
        setLocationRelativeTo(null);
    }

    private void buscarUsuarios() {
        try {
            UsuarioDAO dao = new UsuarioDAO();
            UsuarioDTO[] usuarios = dao.obterUsuario();
            usuariosComboBox.setModel(new DefaultComboBoxModel<>(usuarios));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Usuario não encontrado, tente novamente mais tarde.");
            e.printStackTrace();
        }
    }
    
    
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        usuariosComboBox = new javax.swing.JComboBox<>();
        idUsuarioTextField = new javax.swing.JTextField();
        nomeUsuarioTextField = new javax.swing.JTextField();
        emailUsuarioTextField = new javax.swing.JTextField();
        telefoneUsuarioTextField = new javax.swing.JTextField();
        atualizarUsuarioButton = new javax.swing.JButton();
        removerUsuarioButton = new javax.swing.JButton();
        cancelarUsuarioButton = new javax.swing.JButton();
        voltarUsuarioButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerenciar Usuarios"));

        usuariosComboBox.setMaximumRowCount(50);

        idUsuarioTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Id"));
        idUsuarioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idUsuarioTextFieldActionPerformed(evt);
            }
        });

        nomeUsuarioTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));
        nomeUsuarioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeUsuarioTextFieldActionPerformed(evt);
            }
        });

        emailUsuarioTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Email"));
        emailUsuarioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailUsuarioTextFieldActionPerformed(evt);
            }
        });

        telefoneUsuarioTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefone"));
        telefoneUsuarioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneUsuarioTextFieldActionPerformed(evt);
            }
        });

        atualizarUsuarioButton.setText("Atualizar");
        atualizarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarUsuarioButtonActionPerformed(evt);
            }
        });

        removerUsuarioButton.setText("Remover");
        removerUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerUsuarioButtonActionPerformed(evt);
            }
        });

        cancelarUsuarioButton.setText("Cancelar");
        cancelarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarUsuarioButtonActionPerformed(evt);
            }
        });

        voltarUsuarioButton.setText("Voltar");
        voltarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarUsuarioButtonActionPerformed(evt);
            }
        });

        consultarButton.setText("Consultar");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(emailUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(telefoneUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuariosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(idUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomeUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(consultarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(atualizarUsuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(voltarUsuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(removerUsuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cancelarUsuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(usuariosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailUsuarioTextField))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(atualizarUsuarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(consultarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarUsuarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(removerUsuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(voltarUsuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeUsuarioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeUsuarioTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeUsuarioTextFieldActionPerformed

    private void emailUsuarioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailUsuarioTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailUsuarioTextFieldActionPerformed

    private void voltarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarUsuarioButtonActionPerformed
                    DashboardAdminTela vs = new DashboardAdminTela();
                    vs.setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_voltarUsuarioButtonActionPerformed

    private void idUsuarioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idUsuarioTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idUsuarioTextFieldActionPerformed

    private void removerUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerUsuarioButtonActionPerformed
        UsuarioDAO dao = new UsuarioDAO();
        dao.removerUsuario(idUsuarioTextField.getText());  
        buscarUsuarios();
        idUsuarioTextField.setText("");
    }//GEN-LAST:event_removerUsuarioButtonActionPerformed

    private void atualizarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarUsuarioButtonActionPerformed
        UsuarioDAO dao = new UsuarioDAO();
        dao.atualizarUsuario(idUsuarioTextField.getText(), nomeUsuarioTextField.getText(), emailUsuarioTextField.getText(), telefoneUsuarioTextField.getText());
        buscarUsuarios();
        nomeUsuarioTextField.setText("");
        emailUsuarioTextField.setText("");
        telefoneUsuarioTextField.setText("");
        idUsuarioTextField.setText("");
    }//GEN-LAST:event_atualizarUsuarioButtonActionPerformed

    private void cancelarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarUsuarioButtonActionPerformed
        nomeUsuarioTextField.setText("");
        emailUsuarioTextField.setText("");
        telefoneUsuarioTextField.setText("");
        idUsuarioTextField.setText("");
    }//GEN-LAST:event_cancelarUsuarioButtonActionPerformed

    private void telefoneUsuarioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneUsuarioTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneUsuarioTextFieldActionPerformed

    private void consultarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarButtonActionPerformed
        UsuarioDAO dao = new UsuarioDAO();
        UsuarioDTO usuario = new UsuarioDTO();
        try {
            usuario = dao.consultarUsuario(usuario, idUsuarioTextField.getText());
        } catch (Exception ex) {
            Logger.getLogger(UsuarioTelaAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        nomeUsuarioTextField.setText(usuario.getNome_usuario());
        emailUsuarioTextField.setText(usuario.getEmail_usuario());
        telefoneUsuarioTextField.setText(usuario.getTelefone_usuario());
        idUsuarioTextField.setText(String.valueOf(usuario.getCod_usuario()));
    }//GEN-LAST:event_consultarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UsuarioTelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioTelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioTelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioTelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioTelaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarUsuarioButton;
    private javax.swing.JButton cancelarUsuarioButton;
    private javax.swing.JButton consultarButton;
    private javax.swing.JTextField emailUsuarioTextField;
    private javax.swing.JTextField idUsuarioTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeUsuarioTextField;
    private javax.swing.JButton removerUsuarioButton;
    private javax.swing.JTextField telefoneUsuarioTextField;
    private javax.swing.JComboBox<UsuarioDTO> usuariosComboBox;
    private javax.swing.JButton voltarUsuarioButton;
    // End of variables declaration//GEN-END:variables
}
