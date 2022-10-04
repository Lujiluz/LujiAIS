package form;

import java.awt.Color;
import config.Koneksi;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main.Dashboard_Admin;

public class FrmEditDosen extends javax.swing.JFrame {

    public FrmEditDosen() {
        initComponents();
    }

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
        txtAlmt = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblBack = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
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

        txtAlmt.setBackground(new java.awt.Color(229, 238, 210));
        txtAlmt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtAlmt.setForeground(new java.awt.Color(13, 13, 13));
        txtAlmt.setBorder(null);
        panelRound1.add(txtAlmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 217, -1));

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

        btnEdit.setBackground(new java.awt.Color(28, 49, 68));
        btnEdit.setForeground(new java.awt.Color(229, 238, 210));
        btnEdit.setText("Edit ");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        panelRound1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 150, 50));

        btnHapus.setBackground(new java.awt.Color(28, 49, 68));
        btnHapus.setForeground(new java.awt.Color(229, 238, 210));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        panelRound1.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 150, 50));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(13, 13, 13));
        jLabel6.setText("Alamat");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(13, 13, 13));
        jLabel18.setText(":");
        panelRound1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, -1));

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

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        this.dispose();
        try {
            Dashboard_Admin.openFrame(Dashboard_Admin.dataDosen);
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

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            String sql = "UPDATE dosen SET nmDosen = '"
                    +txtNmDosen.getText()+"', "
                    +"noHp = '"+txtNoHp.getText()+"', "
                    +"almt = '"+txtAlmt.getText()+"' WHERE nip = '" + txtNip.getText() +"';";

            Connection conn = Koneksi.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil diedit!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

        try {
            this.dispose();
            JFrame frmDataDosen = new FrmDataDosen();
            frmDataDosen.setLocation(415,140);
            frmDataDosen.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            if (txtNip.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Anda belum memilih data", "Pesan", JOptionPane.ERROR_MESSAGE);
            }else{
                int confirm;
                confirm = JOptionPane.showConfirmDialog(null,"Apakah anda yakin ingin menghapus data?", "Konfirmasi",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(confirm == 0){
                    try{
                        String sql = "DELETE FROM dosen WHERE nip = '" + txtNip.getText() + "'";
                        Connection conn = Koneksi.getConnection();
                        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                        pst.execute();
                        JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");

                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                }
            }
            this.dispose();
            JFrame frmDataDosen = new FrmDataDosen();
            frmDataDosen.setLocation(415,140);
            frmDataDosen.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(FrmEditMhs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHapusActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEditDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEditDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEditDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEditDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEditDosen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
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
    public javax.swing.JTextField txtAlmt;
    public javax.swing.JTextField txtNip;
    public javax.swing.JTextField txtNmDosen;
    public javax.swing.JTextField txtNoHp;
    // End of variables declaration//GEN-END:variables
}
