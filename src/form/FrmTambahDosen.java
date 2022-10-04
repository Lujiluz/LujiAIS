package form;

import config.Koneksi;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FrmTambahDosen extends javax.swing.JFrame {

    public FrmTambahDosen() {
        initComponents();
        setBackground(new Color(0,0,0,0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new components.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNip = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtNmDosen = new javax.swing.JTextField();
        txtNoHp = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        lblBack = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtAlmt = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelRound1.setBackground(new java.awt.Color(229, 238, 210));
        panelRound1.setRoundBottomLeft(12);
        panelRound1.setRoundBottomRight(12);
        panelRound1.setRoundTopLeft(12);
        panelRound1.setRoundTopRight(12);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(13, 13, 13));
        jLabel2.setText("NIP");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(13, 13, 13));
        jLabel3.setText("Nama");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(13, 13, 13));
        jLabel4.setText("No. Hp");
        panelRound1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(13, 13, 13));
        jLabel11.setText(":");
        panelRound1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(13, 13, 13));
        jLabel12.setText(":");
        panelRound1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(13, 13, 13));
        jLabel13.setText(":");
        panelRound1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        txtNip.setBackground(new java.awt.Color(229, 238, 210));
        txtNip.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNip.setForeground(new java.awt.Color(13, 13, 13));
        txtNip.setBorder(null);
        panelRound1.add(txtNip, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 217, -1));

        jSeparator1.setBackground(new java.awt.Color(13, 13, 13));
        jSeparator1.setForeground(new java.awt.Color(13, 13, 13));
        panelRound1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 217, -1));

        jSeparator2.setBackground(new java.awt.Color(13, 13, 13));
        jSeparator2.setForeground(new java.awt.Color(13, 13, 13));
        panelRound1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 217, 10));

        txtNmDosen.setBackground(new java.awt.Color(229, 238, 210));
        txtNmDosen.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNmDosen.setForeground(new java.awt.Color(13, 13, 13));
        txtNmDosen.setBorder(null);
        panelRound1.add(txtNmDosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 217, -1));

        txtNoHp.setBackground(new java.awt.Color(229, 238, 210));
        txtNoHp.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNoHp.setForeground(new java.awt.Color(13, 13, 13));
        txtNoHp.setBorder(null);
        panelRound1.add(txtNoHp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 217, -1));

        btnSimpan.setBackground(new java.awt.Color(28, 49, 68));
        btnSimpan.setForeground(new java.awt.Color(229, 238, 210));
        btnSimpan.setText("Simpan Data");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        panelRound1.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 150, 50));

        jSeparator4.setBackground(new java.awt.Color(13, 13, 13));
        jSeparator4.setForeground(new java.awt.Color(13, 13, 13));
        panelRound1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 217, 10));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/backBtn.png"))); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBackMouseExited(evt);
            }
        });
        panelRound1.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(13, 13, 13));
        jLabel6.setText("Alamat");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(13, 13, 13));
        jLabel18.setText(":");
        panelRound1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, -1));

        txtAlmt.setBackground(new java.awt.Color(229, 238, 210));
        txtAlmt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtAlmt.setForeground(new java.awt.Color(13, 13, 13));
        txtAlmt.setBorder(null);
        panelRound1.add(txtAlmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 217, -1));

        jSeparator8.setBackground(new java.awt.Color(13, 13, 13));
        jSeparator8.setForeground(new java.awt.Color(13, 13, 13));
        panelRound1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 217, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     private void handCursor(String event){
        Cursor cursor = Cursor.getDefaultCursor();
        if(event.toLowerCase().equals("entered")){
            cursor = cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
            setCursor(cursor);
        }else if(event.toLowerCase().equals("exited")){
            cursor = cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR);
            setCursor(cursor);
        }
        
    }
    
    private void clearAllField(){
        txtNip.setText("");
        txtNmDosen.setText("");
        txtNoHp.setText("");
        txtAlmt.setText("");
    }
    
    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            String sql = "INSERT INTO dosen (nip,nmDosen,noHp, almt) VALUES ('"
                          +txtNip.getText()+"', "
                          +"'"+txtNmDosen.getText()+"', "
                          +"'"+txtNoHp.getText()+"', "
                          +"'"+txtAlmt.getText()+"');";
            Connection conn = Koneksi.getConnection();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil tersimpan");
            clearAllField();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        this.dispose();
        try {
            JFrame frmDataDosen = new FrmDataDosen();
            frmDataDosen.setLocation(415,140);
            frmDataDosen.show();
        } catch (Exception ex) {
            Logger.getLogger(FrmTambahMhs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseEntered
        handCursor("entered");
    }//GEN-LAST:event_lblBackMouseEntered

    private void lblBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseExited
        handCursor("exited");
    }//GEN-LAST:event_lblBackMouseExited

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
            java.util.logging.Logger.getLogger(FrmTambahDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTambahDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTambahDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTambahDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTambahDosen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblBack;
    private components.PanelRound panelRound1;
    private javax.swing.JTextField txtAlmt;
    private javax.swing.JTextField txtNip;
    private javax.swing.JTextField txtNmDosen;
    private javax.swing.JTextField txtNoHp;
    // End of variables declaration//GEN-END:variables
}
