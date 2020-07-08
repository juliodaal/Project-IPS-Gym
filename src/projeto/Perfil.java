/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import clases.UdpClient;
import javafx.application.Platform;
import javafx.stage.Stage;
import static projeto.PrincipalPage.deleteWord;

/**
 *
 * @author julio
 */
public class Perfil extends javax.swing.JFrame {

    private String emailT;    
    
    public Perfil(String email) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        this.emailT = email;
        this.setParameters(email);
    }
    
    public Perfil() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JLabel();
        nameUser = new javax.swing.JLabel();
        NumeroCartaoTag = new javax.swing.JLabel();
        NumeroCartao = new javax.swing.JLabel();
        CreditoTag = new javax.swing.JLabel();
        creditoVar = new javax.swing.JLabel();
        nameTag = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        emailTag = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        buttonVoltar = new javax.swing.JButton();
        wallpaperBig = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dumbbell.PNG"))); // NOI18N
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        nameUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameUser.setForeground(new java.awt.Color(112, 112, 112));
        nameUser.setText("Julio Cesar Daal De Sousa");
        getContentPane().add(nameUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        NumeroCartaoTag.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumeroCartaoTag.setForeground(new java.awt.Color(112, 112, 112));
        NumeroCartaoTag.setText("Nº Cartão:");
        getContentPane().add(NumeroCartaoTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        NumeroCartao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NumeroCartao.setForeground(new java.awt.Color(112, 112, 112));
        NumeroCartao.setText("190208014");
        getContentPane().add(NumeroCartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        CreditoTag.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CreditoTag.setForeground(new java.awt.Color(112, 112, 112));
        CreditoTag.setText("Credito (€):");
        getContentPane().add(CreditoTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        creditoVar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        creditoVar.setForeground(new java.awt.Color(112, 112, 112));
        creditoVar.setText("50");
        getContentPane().add(creditoVar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        nameTag.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameTag.setForeground(new java.awt.Color(112, 112, 112));
        nameTag.setText("Nome:");
        getContentPane().add(nameTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(112, 112, 112));
        name.setText("Julio Cesar Daal De Sousa");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        emailTag.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emailTag.setForeground(new java.awt.Color(112, 112, 112));
        emailTag.setText("E-mail:");
        getContentPane().add(emailTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        email.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(112, 112, 112));
        email.setText("juliocesar.daal@gmail.com");
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        buttonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buttonVoltar.PNG"))); // NOI18N
        buttonVoltar.setBorder(null);
        buttonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonVoltar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        wallpaperBig.setBackground(new java.awt.Color(79, 79, 79));
        wallpaperBig.setForeground(new java.awt.Color(255, 255, 255));
        wallpaperBig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wallpaperBig.png"))); // NOI18N
        wallpaperBig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 79, 79)));
        getContentPane().add(wallpaperBig, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void setParameters(String emailS){
        UdpClient client = new UdpClient("Principal Page", emailS);
        String msg = client.initClient();
        System.out.println("Este es el msg : " + msg);
        
        String accum = "",accum2 = "", word = "", nameTable = "";
        String nome = "", cartao = "", credito = "";
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
                                nome = word;
                                break;
                            case 2:
                                cartao = word;
                                break;
                            case 3:
                                credito = word;
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
            //System.out.println("email : " + nome);
            //System.out.println("emailS : " + emailS);
            //System.out.println("cartao : " + cartao);
            //System.out.println("credito : " + credito);
            
            nameUser.setText(nome);
            name.setText(nome);
            email.setText(emailS);
            
        UdpClient client3 = new UdpClient("Catch idUtilizador",emailS);
        String msg3 = client3.initClient();
        System.out.println("Este es el msg : " + msg3);
        
        String accum3 = "",accum23 = "", word3 = "", nameTable3 = "";
        String id = "";
        int cont3 = 1;
            for(int i3 = 0; i3 < msg3.length(); i3++){
                char c3 = msg3.charAt(i3); 
                    if(c3 == '#' || c3 == '%'){
                        accum23 += c3;
                        accum3 += c3;
                        if("#%#".equals(accum23)){
                            word3 = deleteWord(accum3,accum23);
                            System.out.println("Ver accum:------");
                            System.out.println(word3);
                            switch(cont3){
                            case 1:
                                id = word3;
                                break;
                            }
                            accum23 = "";
                            accum3 = "";
                            cont3++;
                        }
                    } else {
                        accum3 += c3;
                    }
            }
            
            NumeroCartao.setText(id);
            
            
            creditoVar.setText(credito);
    }
    
    
    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        PrincipalPage page = new PrincipalPage(emailT);
        page.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CreditoTag;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel NumeroCartao;
    private javax.swing.JLabel NumeroCartaoTag;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JLabel creditoVar;
    private javax.swing.JLabel email;
    private javax.swing.JLabel emailTag;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nameTag;
    private javax.swing.JLabel nameUser;
    private javax.swing.JLabel wallpaperBig;
    // End of variables declaration//GEN-END:variables
}
