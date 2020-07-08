/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import clases.UdpClient;
import static java.lang.Double.parseDouble;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author julio
 */
public class RecarregarCartao extends javax.swing.JFrame {

    private String email;
    private int cartao;
    
    public RecarregarCartao(String email, int cartao) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        this.email = email;
        this.cartao = cartao;
    }
    
    public RecarregarCartao() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonLogin = new javax.swing.JButton();
        quantityTag = new javax.swing.JLabel();
        quantidade = new javax.swing.JTextField();
        RecarragarCartaoTag = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        EmailTag1 = new javax.swing.JLabel();
        EmailTag2 = new javax.swing.JLabel();
        UserNameTag2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonLogin.setBackground(new java.awt.Color(79, 79, 79));
        buttonLogin.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogin.setText("RECARREGAR");
        buttonLogin.setToolTipText("");
        buttonLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonLogin.setBorderPainted(false);
        buttonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLogin.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(buttonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 480, 40));

        quantityTag.setText("quantity");
        getContentPane().add(quantityTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        quantidade.setBackground(new java.awt.Color(234, 234, 234));
        getContentPane().add(quantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 480, 40));

        RecarragarCartaoTag.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RecarragarCartaoTag.setForeground(new java.awt.Color(112, 112, 112));
        RecarragarCartaoTag.setText("Recarregar Credito");
        getContentPane().add(RecarragarCartaoTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

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

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        System.out.println("Este es el carton : " + this.cartao);
        System.out.println("Este es el credito : " + parseDouble(quantidade.getText()));
        UdpClient client = new UdpClient(this.cartao, parseDouble(quantidade.getText()), this.email);
        String msg = client.initClient();
        System.out.println("Este es el mensaje en Rcarregar Cartao : " + msg);
        if(msg.contains("true")){
            System.out.println("Este es el email en Rcarregar Cartao : " + this.email);
            PrincipalPage page = new PrincipalPage(this.email); 
            page.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível validar os dados");
            this.clean();
        }
    }//GEN-LAST:event_buttonLoginActionPerformed

    public void clean(){
        quantidade.setText(null);
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
            java.util.logging.Logger.getLogger(RecarregarCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecarregarCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecarregarCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecarregarCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecarregarCartao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmailTag1;
    private javax.swing.JLabel EmailTag2;
    private javax.swing.JLabel RecarragarCartaoTag;
    private javax.swing.JLabel UserNameTag2;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField quantidade;
    private javax.swing.JLabel quantityTag;
    // End of variables declaration//GEN-END:variables
}