package javaEncryption;

import javax.swing.JOptionPane;

public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        initComponents();
    }

    Encrypt encryptClass = new Encrypt();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtText = new javax.swing.JTextField();
        btnEncrypted = new javax.swing.JButton();
        btnDecrypted = new javax.swing.JButton();
        lblTexted = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text Encryption App");
        setName("frmMain"); // NOI18N
        setResizable(false);

        txtText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTextActionPerformed(evt);
            }
        });

        btnEncrypted.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnEncrypted.setText("Şifrele");
        btnEncrypted.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncrypted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptedActionPerformed(evt);
            }
        });

        btnDecrypted.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDecrypted.setText("Şifre Çöz");
        btnDecrypted.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDecrypted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptedActionPerformed(evt);
            }
        });

        lblTexted.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTexted.setText("Şifre :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTexted)
                    .addComponent(txtText, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEncrypted)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecrypted)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTexted)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDecrypted, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEncrypted))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncryptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncryptedActionPerformed
        encryptClass.setWordCharacterArray(txtText.getText());
        
        if(encryptClass.chackWordCharcter()){
            txtText.setText(encryptClass.getEncryptedWord());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Hatalı karakter var şifrenizde","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEncryptedActionPerformed

    private void txtTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTextActionPerformed

    private void btnDecryptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptedActionPerformed
        encryptClass.setWordCharacterArray(txtText.getText());
        //txtText.setText(encryptClass.decryptedWord(txtText.getText(),0)); //Test
        
        if(encryptClass.chackDecrypted()){
            txtText.setText(encryptClass.getDecryptedWord(txtText.getText()));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Hatalı karakter var şifrenizde","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDecryptedActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDecrypted;
    private javax.swing.JButton btnEncrypted;
    private javax.swing.JLabel lblTexted;
    private javax.swing.JTextField txtText;
    // End of variables declaration//GEN-END:variables
}
