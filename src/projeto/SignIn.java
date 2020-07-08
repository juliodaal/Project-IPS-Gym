/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import clases.UdpClient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author julio
 */
public class SignIn extends javax.swing.JFrame {

    
    public SignIn() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /*private void listar(){
        int resultado = insertSelectTable.getDataIdUtilizador();
    }*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        buttonSignUp = new javax.swing.JButton();
        EmailTag = new javax.swing.JLabel();
        PasswordTag = new javax.swing.JLabel();
        TextFieldEmail = new javax.swing.JTextField();
        TextFieldUserName1 = new javax.swing.JTextField();
        UserNameTag1 = new javax.swing.JLabel();
        TextFieldNumeroCartao = new javax.swing.JTextField();
        PasswordFieldPassword = new javax.swing.JPasswordField();
        buttonRegisterChangeSite = new javax.swing.JButton();
        PasswordTag1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        EmailTag1 = new javax.swing.JLabel();
        EmailTag2 = new javax.swing.JLabel();
        UserNameTag2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dumbbell.PNG"))); // NOI18N
        jLabel2.setToolTipText("");
        jLabel2.setName("Dumbbell"); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));
        jLabel2.getAccessibleContext().setAccessibleName("Dumbbell");
        jLabel2.getAccessibleContext().setAccessibleDescription("Dumbbell");

        buttonSignUp.setBackground(new java.awt.Color(79, 79, 79));
        buttonSignUp.setForeground(new java.awt.Color(255, 255, 255));
        buttonSignUp.setText("SIGN UP");
        buttonSignUp.setToolTipText("");
        buttonSignUp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonSignUp.setBorderPainted(false);
        buttonSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSignUp.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttonSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignUpActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, 480, 40));

        EmailTag.setText("Email");
        getContentPane().add(EmailTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        PasswordTag.setText("Numero Cartao");
        getContentPane().add(PasswordTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, -1, -1));

        TextFieldEmail.setBackground(new java.awt.Color(234, 234, 234));
        getContentPane().add(TextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 480, 40));

        TextFieldUserName1.setBackground(new java.awt.Color(234, 234, 234));
        getContentPane().add(TextFieldUserName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 480, 40));

        UserNameTag1.setText("Username");
        getContentPane().add(UserNameTag1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        TextFieldNumeroCartao.setBackground(new java.awt.Color(234, 234, 234));
        getContentPane().add(TextFieldNumeroCartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 480, 40));

        PasswordFieldPassword.setBackground(new java.awt.Color(234, 234, 234));
        getContentPane().add(PasswordFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 480, 40));

        buttonRegisterChangeSite.setBackground(new java.awt.Color(255, 255, 255));
        buttonRegisterChangeSite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/registerNegrita.PNG"))); // NOI18N
        buttonRegisterChangeSite.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(buttonRegisterChangeSite, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 110, 30));

        PasswordTag1.setText("Password");
        getContentPane().add(PasswordTag1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White Wallpaper.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 79, 79)));
        jLabel1.setDoubleBuffered(true);
        jLabel1.setFocusTraversalPolicyProvider(true);
        jLabel1.setName(""); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 760));
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        EmailTag1.setText("Email");
        getContentPane().add(EmailTag1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        EmailTag2.setText("Email");
        getContentPane().add(EmailTag2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        UserNameTag2.setText("Username");
        getContentPane().add(UserNameTag2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignUpActionPerformed
     
        String nome = TextFieldUserName1.getText();
        String pwd = String.valueOf(PasswordFieldPassword.getPassword());
        String email = TextFieldEmail.getText();
        String numeroCartao = TextFieldNumeroCartao.getText();
        
        UdpClient client = new UdpClient("singin",nome,pwd,email,numeroCartao);
        String msg = client.initClient();
        
        if(msg.contains("Registro guardado")){
            JOptionPane.showMessageDialog(null, "Registro guardado..");
            clean(); 
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao gravar o registo");
            clean(); 
        }
    }//GEN-LAST:event_buttonSignUpActionPerformed

    
    private void clean(){
        TextFieldUserName1.setText(null);
        PasswordFieldPassword.setText(null);
        TextFieldEmail.setText(null);
    }
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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmailTag;
    private javax.swing.JLabel EmailTag1;
    private javax.swing.JLabel EmailTag2;
    private javax.swing.JPasswordField PasswordFieldPassword;
    private javax.swing.JLabel PasswordTag;
    private javax.swing.JLabel PasswordTag1;
    private javax.swing.JTextField TextFieldEmail;
    private javax.swing.JTextField TextFieldNumeroCartao;
    private javax.swing.JTextField TextFieldUserName1;
    private javax.swing.JLabel UserNameTag1;
    private javax.swing.JLabel UserNameTag2;
    private javax.swing.JButton buttonRegisterChangeSite;
    private javax.swing.JButton buttonSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
