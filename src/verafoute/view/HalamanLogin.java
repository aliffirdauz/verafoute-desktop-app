/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verafoute.view;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import verafoute.entity.pembeli;

/**
 *
 * @author hp
 */
public class HalamanLogin extends javax.swing.JFrame {
    
    /**
     * Creates new form HalamanLogin
     */
    public HalamanLogin() {
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

        pnlUtama = new javax.swing.JPanel();
        pnlLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtusr_pl = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        btn_register = new javax.swing.JButton();
        btn_ext = new javax.swing.JButton();
        fpass_p = new javax.swing.JPasswordField();
        ckb_spass = new javax.swing.JCheckBox();
        pnlRegister = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtnama_p = new javax.swing.JTextField();
        txtnotelp_p = new javax.swing.JTextField();
        txtusr_p = new javax.swing.JTextField();
        txtpass_p = new javax.swing.JTextField();
        txtalamat_p = new javax.swing.JTextField();
        btn_submit = new javax.swing.JButton();
        btn_bck = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlUtama.setBackground(new java.awt.Color(102, 204, 255));
        pnlUtama.setLayout(new java.awt.CardLayout());

        pnlLogin.setBackground(new java.awt.Color(102, 204, 255));
        pnlLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlLoginMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        jLabel1.setText("verafoute");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Username :");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Password :");

        btn_login.setText("Login");
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });

        btn_register.setText("Register");
        btn_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registerMouseClicked(evt);
            }
        });
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        btn_ext.setText("Exit");
        btn_ext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_extActionPerformed(evt);
            }
        });

        ckb_spass.setText("Show Password");
        ckb_spass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ckb_spassMouseClicked(evt);
            }
        });
        ckb_spass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_spassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addComponent(jLabel1))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jLabel2)
                        .addGap(53, 53, 53)
                        .addComponent(txtusr_pl, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ckb_spass)
                            .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlLoginLayout.createSequentialGroup()
                                    .addComponent(btn_ext)
                                    .addGap(130, 130, 130)
                                    .addComponent(btn_register)
                                    .addGap(44, 44, 44)
                                    .addComponent(btn_login))
                                .addGroup(pnlLoginLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(56, 56, 56)
                                    .addComponent(fpass_p, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(378, 378, 378))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtusr_pl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(fpass_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckb_spass)
                .addGap(29, 29, 29)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ext)
                    .addComponent(btn_register)
                    .addComponent(btn_login))
                .addGap(187, 187, 187))
        );

        pnlUtama.add(pnlLogin, "cardLogin");

        pnlRegister.setBackground(new java.awt.Color(102, 204, 255));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        jLabel4.setText("Register");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setText("Password : ");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setText("Nama : ");

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel7.setText("Alamat : ");

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel8.setText("No Telepon : ");

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel9.setText("Username :");

        txtpass_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpass_pActionPerformed(evt);
            }
        });

        btn_submit.setText("Submit");
        btn_submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_submitMouseClicked(evt);
            }
        });

        btn_bck.setText("Back");
        btn_bck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_bckMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlRegisterLayout = new javax.swing.GroupLayout(pnlRegister);
        pnlRegister.setLayout(pnlRegisterLayout);
        pnlRegisterLayout.setHorizontalGroup(
            pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterLayout.createSequentialGroup()
                .addGroup(pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(jLabel4))
                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel6)
                        .addGap(68, 68, 68)
                        .addComponent(txtnama_p, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel7)
                        .addGap(61, 61, 61)
                        .addComponent(txtalamat_p, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel8)
                        .addGap(21, 21, 21)
                        .addComponent(txtnotelp_p, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel9)
                        .addGap(38, 38, 38)
                        .addComponent(txtusr_p, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addGroup(pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlRegisterLayout.createSequentialGroup()
                                .addComponent(btn_bck)
                                .addGap(32, 32, 32)
                                .addComponent(btn_submit))
                            .addGroup(pnlRegisterLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(36, 36, 36)
                                .addComponent(txtpass_p, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(395, Short.MAX_VALUE))
        );
        pnlRegisterLayout.setVerticalGroup(
            pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(48, 48, 48)
                .addGroup(pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtnama_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtalamat_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtnotelp_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtusr_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtpass_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_submit)
                    .addComponent(btn_bck))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pnlUtama.add(pnlRegister, "cardRegister");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpass_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpass_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpass_pActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btn_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registerMouseClicked
        cl = (CardLayout) pnlUtama.getLayout();
        cl.show(pnlUtama, "cardRegister");
    }//GEN-LAST:event_btn_registerMouseClicked

    private void btn_submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_submitMouseClicked
        String nama_p = txtnama_p.getText();
        String alamat_p = txtalamat_p.getText();
        String notelp_p = txtnotelp_p.getText();
        String username_p = txtusr_p.getText();
        String password_p = txtpass_p.getText();
        pembeli p = new pembeli(nama_p, alamat_p, notelp_p, username_p, password_p);
        verafoute.controller.pembeliController pc = new verafoute.controller.pembeliController();
        int hasil = pc.insertP(p);
        if(hasil >0){
            JOptionPane.showMessageDialog(null, "Register Successful!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Register Failed!");
        }
        txtnama_p.setText("");
        txtalamat_p.setText("");
        txtnotelp_p.setText("");
        txtusr_p.setText("");
        txtpass_p.setText("");
        
        cl = (CardLayout) pnlUtama.getLayout();
        cl.show(pnlUtama, "cardLogin");
    }//GEN-LAST:event_btn_submitMouseClicked

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
        String username_p = txtusr_pl.getText();
        char[] password_char = fpass_p.getPassword();
        String password_p = String.valueOf(password_char);
        String usr_adm = "admin";
        String pas_adm = "admin";
        
        if(username_p.equals(usr_adm) && password_p.equals(pas_adm)){
            JOptionPane.showMessageDialog(null, "Berhasil Masuk sebagai Admin");
            new HalamanAdmin().setVisible(true);
            dispose();
            txtusr_p.setText("");
            txtpass_p.setText("");
        }
        else {
            verafoute.controller.loginController lc = new verafoute.controller.loginController();
            lc.logging(username_p, password_p);
            txtusr_p.setText("");
            txtpass_p.setText("");
        }
    }//GEN-LAST:event_btn_loginMouseClicked

    private void btn_bckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bckMouseClicked
        cl = (CardLayout) pnlUtama.getLayout();
        cl.show(pnlUtama, "cardLogin");
    }//GEN-LAST:event_btn_bckMouseClicked

    private void btn_extActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_extActionPerformed
        int quest = JOptionPane.showConfirmDialog(this, "Anda ingin keluar aplikasi?", "Peringatan!", JOptionPane.YES_NO_OPTION);
        
        if (quest == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_extActionPerformed

    private void pnlLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLoginMouseClicked

    }//GEN-LAST:event_pnlLoginMouseClicked

    private void ckb_spassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckb_spassMouseClicked
        
    }//GEN-LAST:event_ckb_spassMouseClicked

    private void ckb_spassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_spassActionPerformed
        if (ckb_spass.isSelected()) {
            fpass_p.setEchoChar((char)0);
        }
        else{
            fpass_p.setEchoChar('*');
        }
    }//GEN-LAST:event_ckb_spassActionPerformed
    
    
    
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
            java.util.logging.Logger.getLogger(HalamanLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanLogin().setVisible(true);
            }
        });
    }

    private CardLayout cl;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bck;
    private javax.swing.JButton btn_ext;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_register;
    private javax.swing.JButton btn_submit;
    private javax.swing.JCheckBox ckb_spass;
    private javax.swing.JPasswordField fpass_p;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlRegister;
    private javax.swing.JPanel pnlUtama;
    private javax.swing.JTextField txtalamat_p;
    private javax.swing.JTextField txtnama_p;
    private javax.swing.JTextField txtnotelp_p;
    private javax.swing.JTextField txtpass_p;
    private javax.swing.JTextField txtusr_p;
    private javax.swing.JTextField txtusr_pl;
    // End of variables declaration//GEN-END:variables
}
