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

public class FrmEditMhs extends javax.swing.JFrame {

    public FrmEditMhs() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNim = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtNmMhs = new javax.swing.JTextField();
        txtTmptTgl = new javax.swing.JTextField();
        txtAlmt = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txtNoHp = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        txtThnAkd = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        cmbJenjang = new components.Combobox();
        btnEdit = new javax.swing.JButton();
        txtSemester = new javax.swing.JTextField();
        cmbJnsKelamin = new components.Combobox();
        jSeparator4 = new javax.swing.JSeparator();
        lblBack = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();

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
        jLabel2.setText("NIM");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(13, 13, 13));
        jLabel3.setText("Nama");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(13, 13, 13));
        jLabel4.setText("Tempat/Tgl Lahir");
        panelRound1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(13, 13, 13));
        jLabel5.setText("Jenis Kelamin");
        panelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(13, 13, 13));
        jLabel6.setText("Alamat");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(13, 13, 13));
        jLabel7.setText("No. Hp");
        panelRound1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(13, 13, 13));
        jLabel8.setText("Thn. Akademik");
        panelRound1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(13, 13, 13));
        jLabel9.setText("Jenjang");
        panelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(13, 13, 13));
        jLabel10.setText("Semester");
        panelRound1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(13, 13, 13));
        jLabel11.setText(":");
        panelRound1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(13, 13, 13));
        jLabel12.setText(":");
        panelRound1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(13, 13, 13));
        jLabel13.setText(":");
        panelRound1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(13, 13, 13));
        jLabel14.setText(":");
        panelRound1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        txtNim.setBackground(new java.awt.Color(229, 238, 210));
        txtNim.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNim.setForeground(new java.awt.Color(13, 13, 13));
        txtNim.setBorder(null);
        panelRound1.add(txtNim, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 217, -1));

        jSeparator1.setBackground(new java.awt.Color(13, 13, 13));
        jSeparator1.setForeground(new java.awt.Color(13, 13, 13));
        panelRound1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 217, -1));

        jSeparator2.setBackground(new java.awt.Color(13, 13, 13));
        jSeparator2.setForeground(new java.awt.Color(13, 13, 13));
        panelRound1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 217, 10));

        txtNmMhs.setBackground(new java.awt.Color(229, 238, 210));
        txtNmMhs.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNmMhs.setForeground(new java.awt.Color(13, 13, 13));
        txtNmMhs.setBorder(null);
        panelRound1.add(txtNmMhs, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 217, -1));

        txtTmptTgl.setBackground(new java.awt.Color(229, 238, 210));
        txtTmptTgl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtTmptTgl.setForeground(new java.awt.Color(13, 13, 13));
        txtTmptTgl.setBorder(null);
        panelRound1.add(txtTmptTgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 217, -1));

        txtAlmt.setBackground(new java.awt.Color(229, 238, 210));
        txtAlmt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtAlmt.setForeground(new java.awt.Color(13, 13, 13));
        txtAlmt.setBorder(null);
        panelRound1.add(txtAlmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 217, -1));

        jSeparator6.setBackground(new java.awt.Color(13, 13, 13));
        jSeparator6.setForeground(new java.awt.Color(13, 13, 13));
        panelRound1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 217, 10));

        txtNoHp.setBackground(new java.awt.Color(229, 238, 210));
        txtNoHp.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNoHp.setForeground(new java.awt.Color(13, 13, 13));
        txtNoHp.setBorder(null);
        panelRound1.add(txtNoHp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 217, -1));

        jSeparator7.setBackground(new java.awt.Color(13, 13, 13));
        jSeparator7.setForeground(new java.awt.Color(13, 13, 13));
        panelRound1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 217, -1));

        txtThnAkd.setBackground(new java.awt.Color(229, 238, 210));
        txtThnAkd.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtThnAkd.setForeground(new java.awt.Color(13, 13, 13));
        txtThnAkd.setBorder(null);
        panelRound1.add(txtThnAkd, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 217, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(13, 13, 13));
        jLabel15.setText(":");
        panelRound1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(13, 13, 13));
        jLabel16.setText(":");
        panelRound1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(13, 13, 13));
        jLabel17.setText(":");
        panelRound1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, -1));

        jSeparator8.setBackground(new java.awt.Color(13, 13, 13));
        jSeparator8.setForeground(new java.awt.Color(13, 13, 13));
        panelRound1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 217, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(13, 13, 13));
        jLabel18.setText(":");
        panelRound1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(13, 13, 13));
        jLabel19.setText(":");
        panelRound1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));

        jSeparator9.setBackground(new java.awt.Color(13, 13, 13));
        jSeparator9.setForeground(new java.awt.Color(13, 13, 13));
        panelRound1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 217, -1));

        cmbJenjang.setBackground(new java.awt.Color(229, 238, 210));
        cmbJenjang.setForeground(new java.awt.Color(0, 0, 0));
        cmbJenjang.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "S1", "S2" }));
        cmbJenjang.setSelectedIndex(-1);
        cmbJenjang.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbJenjang.setLabeText("Pilih Jenjang");
        cmbJenjang.setLineColor(new java.awt.Color(28, 49, 68));
        panelRound1.add(cmbJenjang, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 223, 40));

        btnEdit.setBackground(new java.awt.Color(28, 49, 68));
        btnEdit.setForeground(new java.awt.Color(229, 238, 210));
        btnEdit.setText("Edit ");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        panelRound1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 150, 50));

        txtSemester.setBackground(new java.awt.Color(229, 238, 210));
        txtSemester.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtSemester.setForeground(new java.awt.Color(13, 13, 13));
        txtSemester.setBorder(null);
        panelRound1.add(txtSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 217, -1));

        cmbJnsKelamin.setBackground(new java.awt.Color(229, 238, 210));
        cmbJnsKelamin.setForeground(new java.awt.Color(0, 0, 0));
        cmbJnsKelamin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Laki-laki", "Perempuan" }));
        cmbJnsKelamin.setSelectedIndex(-1);
        cmbJnsKelamin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbJnsKelamin.setLineColor(new java.awt.Color(28, 49, 68));
        cmbJnsKelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJnsKelaminActionPerformed(evt);
            }
        });
        panelRound1.add(cmbJnsKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 223, 40));

        jSeparator4.setBackground(new java.awt.Color(13, 13, 13));
        jSeparator4.setForeground(new java.awt.Color(13, 13, 13));
        panelRound1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 217, 10));

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

        btnHapus.setBackground(new java.awt.Color(28, 49, 68));
        btnHapus.setForeground(new java.awt.Color(229, 238, 210));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        panelRound1.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, 150, 50));

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

      private void clearAllField(){
        txtNim.setText("");
        txtNmMhs.setText("");
        txtAlmt.setText("");
        txtNoHp.setText("");
        txtSemester.setText("");
        txtThnAkd.setText("");
        txtTmptTgl.setText("");
        cmbJnsKelamin.setSelectedIndex(-1);
        cmbJenjang.setSelectedIndex(-1);
    }
      
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String tmptTgl = txtTmptTgl.getText();
        String[] splitter = tmptTgl.split(", ",2);
        String tmptLahir = splitter[0];
        String tglLahir = splitter[1];
        try {
            String sql = "UPDATE mahasiswa SET nmMhs ='"
            +txtNmMhs.getText()+"', "
            + "tmptLahir ='"+tmptLahir+"', "
            + "tglLahir ='"+tglLahir+"', "
            + "jnsKelamin ='"+cmbJnsKelamin.getSelectedItem().toString()+"', "
            + "almt ='"+txtAlmt.getText()+"', "
            + "noHp ='"+txtNoHp.getText()+"', "
            + "semester ='"+txtSemester.getText()+"', "
            + "jenjang ='"+cmbJenjang.getSelectedItem().toString()+"' "
            + "WHERE nim = '"+txtNim.getText()+"';";
            
            Connection conn = Koneksi.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil diedit!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        
        try {
            this.dispose();
            JFrame frmDataMhs = new FrmDataMhs();
            frmDataMhs.setLocation(415,140);
            frmDataMhs.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void cmbJnsKelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJnsKelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbJnsKelaminActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        this.dispose();
        try {
            Dashboard_Admin.openFrame(Dashboard_Admin.dataMhs);
        } catch (Exception ex) {
            Logger.getLogger(FrmTambahMhs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            if (txtNim.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Anda belum memilih data", "Pesan", JOptionPane.ERROR_MESSAGE);
            }else{
                int confirm;
                confirm = JOptionPane.showConfirmDialog(null,"Apakah anda yakin ingin menghapus data?", "Konfirmasi",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(confirm == 0){
                    try{
                        String sql = "DELETE FROM mahasiswa WHERE nim = '" + txtNim.getText() + "'";
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
            JFrame frmDataMhs = new FrmDataMhs();
            frmDataMhs.setLocation(415,140);
            frmDataMhs.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(FrmEditMhs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void lblBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseEntered
        Cursor cursor = Cursor.getDefaultCursor();
        cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
        setCursor(cursor);
    }//GEN-LAST:event_lblBackMouseEntered

    private void lblBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseExited
        setCursor(0);
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
            java.util.logging.Logger.getLogger(FrmEditMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEditMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEditMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEditMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEditMhs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    public components.Combobox cmbJenjang;
    public components.Combobox cmbJnsKelamin;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblBack;
    private components.PanelRound panelRound1;
    public javax.swing.JTextField txtAlmt;
    public javax.swing.JTextField txtNim;
    public javax.swing.JTextField txtNmMhs;
    public javax.swing.JTextField txtNoHp;
    public javax.swing.JTextField txtSemester;
    public javax.swing.JTextField txtThnAkd;
    public javax.swing.JTextField txtTmptTgl;
    // End of variables declaration//GEN-END:variables
}
