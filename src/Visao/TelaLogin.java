/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Sistemaloja.CadFuncionario;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author dryan
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
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

        jFrame1 = new javax.swing.JFrame();
        Fundo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        campoLogin = new javax.swing.JTextField();
        jPasswordFieldcampoSenha = new javax.swing.JPasswordField();
        jButtonEntra = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setTitle("Login");
        jFrame1.setLocationByPlatform(true);
        jFrame1.setResizable(false);

        Fundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/439430.jpg"))); // NOI18N

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addComponent(Fundo1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addComponent(Fundo1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setText("Login");

        jLabel2.setText("Senha");

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(null);

        campoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLoginActionPerformed(evt);
            }
        });
        getContentPane().add(campoLogin);
        campoLogin.setBounds(340, 60, 140, 30);

        jPasswordFieldcampoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldcampoSenhaActionPerformed(evt);
            }
        });
        jPasswordFieldcampoSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldcampoSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordFieldcampoSenha);
        jPasswordFieldcampoSenha.setBounds(340, 100, 140, 30);

        jButtonEntra.setText("Entrar");
        jButtonEntra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntraActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntra);
        jButtonEntra.setBounds(300, 150, 80, 30);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(400, 150, 80, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Software");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 220, 160, 30);

        jLabel4.setText("Senha:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 100, 40, 30);

        jLabel3.setText("Login:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 60, 40, 30);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/login.png"))); // NOI18N
        Fundo.setToolTipText("");
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 540, 340);

        setSize(new java.awt.Dimension(560, 375));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoLoginActionPerformed

    private void jPasswordFieldcampoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldcampoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldcampoSenhaActionPerformed

    private void jButtonEntraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntraActionPerformed

        /*if(campoLogin.getText().equals("admin")&& jPasswordFieldcampoSenha.getText().equals("123")){
        CadFuncionario card = new CadFuncionario();
                    card.setVisible(true);
        dispose();
    }else{
            JOptionPane.showMessageDialog(rootPane,"Acesso Negado!");
            
            }*/
    }//GEN-LAST:event_jButtonEntraActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jPasswordFieldcampoSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldcampoSenhaKeyPressed
        /*if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            if(campoLogin.getText().equals("admin")&& jPasswordFieldcampoSenha.getText().equals("123")){
        CadFuncionario card = new CadFuncionario();
        card.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }else{
            JOptionPane.showMessageDialog(rootPane,"Acesso Negado!");
            
            }*/
    }//GEN-LAST:event_jPasswordFieldcampoSenhaKeyPressed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Fundo1;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JButton jButtonEntra;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordFieldcampoSenha;
    // End of variables declaration//GEN-END:variables
}
