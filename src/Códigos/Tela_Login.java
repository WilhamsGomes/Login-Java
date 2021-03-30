package Códigos;


public class Tela_Login extends javax.swing.JFrame {

    
    public Tela_Login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_verde = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txt_senha = new javax.swing.JPasswordField();
        lbl_senha = new javax.swing.JLabel();
        lbl_email2 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        lbl_membro = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl_entrar1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_verde.setBackground(new java.awt.Color(0, 51, 51));
        pnl_verde.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_title.setBackground(new java.awt.Color(255, 255, 255));
        lbl_title.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title.setText("INFORME SUAS CREDENCIAIS");
        pnl_verde.add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 210, 33));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        pnl_verde.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 140, 14));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        pnl_verde.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 291, 14));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        pnl_verde.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 291, 10));

        txt_senha.setBackground(new java.awt.Color(0, 51, 51));
        txt_senha.setForeground(new java.awt.Color(255, 255, 255));
        txt_senha.setText("jPasswordField1");
        txt_senha.setBorder(null);
        pnl_verde.add(txt_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 291, 31));

        lbl_senha.setBackground(new java.awt.Color(255, 255, 255));
        lbl_senha.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbl_senha.setForeground(new java.awt.Color(255, 255, 255));
        lbl_senha.setText("PASSWORD");
        pnl_verde.add(lbl_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 180, 27));

        lbl_email2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_email2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbl_email2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_email2.setText("EMAIL");
        pnl_verde.add(lbl_email2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 180, 27));

        txt_email.setBackground(new java.awt.Color(0, 51, 51));
        txt_email.setForeground(new java.awt.Color(255, 255, 255));
        txt_email.setText("Digite seu email");
        txt_email.setBorder(null);
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        pnl_verde.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 290, 30));

        lbl_membro.setBackground(new java.awt.Color(255, 255, 255));
        lbl_membro.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbl_membro.setForeground(new java.awt.Color(255, 255, 255));
        lbl_membro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_membro.setText("VOLTAR");
        lbl_membro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_membro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_membroMouseClicked(evt);
            }
        });
        pnl_verde.add(lbl_membro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 140, 27));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        lbl_entrar1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_entrar1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbl_entrar1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_entrar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_entrar1.setText("LOGIN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbl_entrar1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_entrar1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        pnl_verde.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        getContentPane().add(pnl_verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 510, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        txt_email.setText("");
    }//GEN-LAST:event_txt_emailActionPerformed

    private void lbl_membroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_membroMouseClicked
      
        Tela_Principal obj = new Tela_Principal();
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_lbl_membroMouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
      
        if (txt_email.getText().equals("@gmail") && (txt_senha.getText().equals("1234"))) {
        
          
            System.out.println ("LOGIN CORRETO");
           
        } 
    }//GEN-LAST:event_jPanel3MouseClicked

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
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbl_email2;
    private javax.swing.JLabel lbl_entrar1;
    private javax.swing.JLabel lbl_membro;
    private javax.swing.JLabel lbl_senha;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JPanel pnl_verde;
    private javax.swing.JTextField txt_email;
    private javax.swing.JPasswordField txt_senha;
    // End of variables declaration//GEN-END:variables
}
