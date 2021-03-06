/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import clases.UdpClient;
import javax.swing.JFrame;
import static projeto.PrincipalPage.deleteWord;

/**
 *
 * @author julio
 */
public class ProcurarCliente extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public ProcurarCliente() {
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

        buttonProcurarCliente = new javax.swing.JButton();
        ClientNumberTag = new javax.swing.JLabel();
        idCliente = new javax.swing.JTextField();
        procurarClienteTag = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        EmailTag1 = new javax.swing.JLabel();
        EmailTag2 = new javax.swing.JLabel();
        UserNameTag2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonProcurarCliente.setBackground(new java.awt.Color(79, 79, 79));
        buttonProcurarCliente.setForeground(new java.awt.Color(255, 255, 255));
        buttonProcurarCliente.setText("PROCURAR");
        buttonProcurarCliente.setToolTipText("");
        buttonProcurarCliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonProcurarCliente.setBorderPainted(false);
        buttonProcurarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonProcurarCliente.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttonProcurarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProcurarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(buttonProcurarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 480, 40));

        ClientNumberTag.setText("Id Cliente");
        getContentPane().add(ClientNumberTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        idCliente.setBackground(new java.awt.Color(234, 234, 234));
        getContentPane().add(idCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 480, 40));

        procurarClienteTag.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        procurarClienteTag.setForeground(new java.awt.Color(112, 112, 112));
        procurarClienteTag.setText("Procurar Cliente");
        getContentPane().add(procurarClienteTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

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

    private void buttonProcurarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProcurarClienteActionPerformed
        
        UdpClient client = new UdpClient("Procurar Cliente",idCliente.getText());
        String msg = client.initClient();
        System.out.println("Este es el msg : " + msg);
        
        String accum = "",accum2 = "", word = "", nameTable = "";
        String email = "";
        int cont = 1;
            for(int i = 0; i < msg.length(); i++){
                char c = msg.charAt(i); 
                    if(c == '#' || c == '%'){
                        accum2 += c;
                        accum += c;
                        if("#%#".equals(accum2)){
                            word = deleteWord(accum,accum2);
                            System.out.println("Ver accum:------");
                            System.out.println(word);
                            switch(cont){
                            case 1:
                                email = word;
                                break;
                            }
                            accum2 = "";
                            accum = "";
                            cont++;
                        }
                    } else {
                        accum += c;
                    }
            }
            
            PrincipalPage page = new PrincipalPage(email);
            page.setVisible(true);
            
    }//GEN-LAST:event_buttonProcurarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(ProcurarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcurarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcurarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcurarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcurarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ClientNumberTag;
    private javax.swing.JLabel EmailTag1;
    private javax.swing.JLabel EmailTag2;
    private javax.swing.JLabel UserNameTag2;
    private javax.swing.JButton buttonProcurarCliente;
    private javax.swing.JTextField idCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel procurarClienteTag;
    // End of variables declaration//GEN-END:variables
}
