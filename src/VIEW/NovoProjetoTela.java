/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;
import DAO.ProjetoDAO;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
/**
 *
 * @author 823157005
 */
public class NovoProjetoTela extends javax.swing.JFrame {
    MaskFormatter mfData;
    MaskFormatter mfTelefone;
    /**
     * Creates new form telaNovoProjeto
     */
    public NovoProjetoTela() {
        try {
            mfTelefone = new MaskFormatter("(##)#####-####");
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Telefone Inválido: " +ex);
        }
        
        try {
            mfData = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Data Inválida: " +ex);
        }
        initComponents();
    }
    
    private boolean Preenchido(){
       
        if(nomeTextField.getText().isEmpty()||odsTextField.getText().isEmpty()||descricaoTextArea.getText().isEmpty()||
                nomeResponsavelTextField.getText().isEmpty()||textTelefone.getText().isEmpty()||
                textData.getText().isEmpty()||statusTextField.getText().isEmpty()){
            return false;
        } else {
            return true;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        descricaoTextArea = new javax.swing.JTextArea();
        nomeResponsavelTextField = new javax.swing.JTextField();
        odsTextField = new javax.swing.JTextField();
        nomeTextField = new javax.swing.JTextField();
        voltarButton = new javax.swing.JButton();
        textData = new javax.swing.JFormattedTextField(mfData);
        textTelefone = new javax.swing.JFormattedTextField(mfTelefone);
        criarButton = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();
        statusTextField = new javax.swing.JTextField();
        perfilUsuarioButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        descricaoTextArea.setColumns(20);
        descricaoTextArea.setRows(5);
        jScrollPane1.setViewportView(descricaoTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 340, 140));

        nomeResponsavelTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeResponsavelTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nomeResponsavelTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 290, 40));

        odsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odsTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(odsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 250, 40));

        nomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nomeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 230, 40));

        voltarButton.setBorder(null);
        voltarButton.setContentAreaFilled(false);
        voltarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 20, 30));

        textData.setBackground(new java.awt.Color(217, 217, 217));
        textData.setBorder(null);
        textData.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDataActionPerformed(evt);
            }
        });
        getContentPane().add(textData, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 370, 40));

        textTelefone.setBackground(new java.awt.Color(217, 217, 217));
        textTelefone.setBorder(null);
        textTelefone.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(textTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 340, 40));

        criarButton.setBorder(null);
        criarButton.setBorderPainted(false);
        criarButton.setContentAreaFilled(false);
        criarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(criarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 200, 50));
        criarButton.getAccessibleContext().setAccessibleDescription("");

        statusLabel.setBackground(new java.awt.Color(217, 217, 217));
        statusLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        statusLabel.setText("Status");
        statusLabel.setOpaque(true);
        getContentPane().add(statusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 70, 40));

        statusTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 217, 217), 3));
        getContentPane().add(statusTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 350, 40));

        perfilUsuarioButton.setBorder(null);
        perfilUsuarioButton.setContentAreaFilled(false);
        perfilUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilUsuarioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(perfilUsuarioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 70, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Nome");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 70, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/Image/Imagem3.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1048, 591));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void odsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_odsTextFieldActionPerformed

    private void nomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextFieldActionPerformed

    private void nomeResponsavelTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeResponsavelTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeResponsavelTextFieldActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        DashboardTela ds = new DashboardTela();
        ds.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void textDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDataActionPerformed

    private void criarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarButtonActionPerformed
         if(this.Preenchido()){
            String nomeProjeto = nomeTextField.getText();
            String ods = odsTextField.getText();
            String descricao = descricaoTextArea.getText();
            String nomeResponsavel = nomeResponsavelTextField.getText();
            String telefone = textTelefone.getText();
            String dataCriacao = textData.getText();
            String status = statusTextField.getText();
            ProjetoDAO dao = new ProjetoDAO();
            dao.adicionarProjeto(nomeProjeto, descricao, ods, nomeResponsavel, telefone, dataCriacao, status);
            JOptionPane.showMessageDialog(null, "Projeto cadastrado com sucesso");
        } else {
        JOptionPane.showMessageDialog(null, "Para efetuar o cadastro do projeto, todos os campos são obrigatórios");
        }
    }//GEN-LAST:event_criarButtonActionPerformed

    private void perfilUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilUsuarioButtonActionPerformed
        PerfilUsuarioTela vs = new PerfilUsuarioTela();
        vs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_perfilUsuarioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NovoProjetoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoProjetoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoProjetoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoProjetoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoProjetoTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton criarButton;
    private javax.swing.JTextArea descricaoTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeResponsavelTextField;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JTextField odsTextField;
    private javax.swing.JButton perfilUsuarioButton;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTextField statusTextField;
    private javax.swing.JFormattedTextField textData;
    private javax.swing.JFormattedTextField textTelefone;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
