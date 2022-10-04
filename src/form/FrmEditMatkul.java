
package form;

import config.Koneksi;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main.Dashboard_Admin;

public class FrmEditMatkul extends javax.swing.JFrame {
    
    String nip,kodeProdi,sql;
    public FrmEditMatkul() {
        initComponents();

        setBackground(new Color(0,0,0,0));
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
        txtKodeMatkul.setText("");
        txtNmMatkul.setText("");
        txtStatus.setText("");
        txtPrasyarat.setText("");
        txtSem.setText("");
        txtPrasyarat.setText("");
        txtSks.setText("");
        cmbKodeProdi.setSelectedIndex(-1);
        cmbNip.setSelectedIndex(-1);
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtKodeMatkul = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtNmMatkul = new javax.swing.JTextField();
        txtSks = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        txtPrasyarat = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        cmbNip = new components.Combobox();
        cmbKodeProdi = new components.Combobox();
        jSeparator4 = new javax.swing.JSeparator();
        lblBack = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtSem = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        panelRound1.setBackground(new java.awt.Color(229, 238, 210));
        panelRound1.setRoundBottomLeft(12);
        panelRound1.setRoundBottomRight(12);
        panelRound1.setRoundTopLeft(12);
        panelRound1.setRoundTopRight(12);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(13, 13, 13));
        jLabel2.setText("Kode Matkul");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 100, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(13, 13, 13));
        jLabel3.setText("Nama Matkul");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 110, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(13, 13, 13));
        jLabel4.setText("SKS");
        panelRound1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(13, 13, 13));
        jLabel5.setText("Semester");
        panelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(13, 13, 13));
        jLabel6.setText("Status");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(13, 13, 13));
        jLabel7.setText("Prasyarat");
        panelRound1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(13, 13, 13));
        jLabel9.setText("Dosen Pengampu");
        panelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(13, 13, 13));
        jLabel10.setText("Program Studi");
        panelRound1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

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

        txtKodeMatkul.setBackground(new java.awt.Color(229, 238, 210));
        txtKodeMatkul.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtKodeMatkul.setForeground(new java.awt.Color(13, 13, 13));
        txtKodeMatkul.setBorder(null);
        panelRound1.add(txtKodeMatkul, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 217, -1));

        jSeparator1.setBackground(new java.awt.Color(13, 13, 13));
        jSeparator1.setForeground(new java.awt.Color(13, 13, 13));
        panelRound1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 217, -1));

        jSeparator2.setBackground(new java.awt.Color(13, 13, 13));
        jSeparator2.setForeground(new java.awt.Color(13, 13, 13));
        panelRound1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 217, 10));

        txtNmMatkul.setBackground(new java.awt.Color(229, 238, 210));
        txtNmMatkul.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNmMatkul.setForeground(new java.awt.Color(13, 13, 13));
        txtNmMatkul.setBorder(null);
        panelRound1.add(txtNmMatkul, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 217, -1));

        txtSks.setBackground(new java.awt.Color(229, 238, 210));
        txtSks.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtSks.setForeground(new java.awt.Color(13, 13, 13));
        txtSks.setBorder(null);
        panelRound1.add(txtSks, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 217, -1));

        txtStatus.setBackground(new java.awt.Color(229, 238, 210));
        txtStatus.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtStatus.setForeground(new java.awt.Color(13, 13, 13));
        txtStatus.setBorder(null);
        panelRound1.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 217, -1));

        txtPrasyarat.setBackground(new java.awt.Color(229, 238, 210));
        txtPrasyarat.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPrasyarat.setForeground(new java.awt.Color(13, 13, 13));
        txtPrasyarat.setBorder(null);
        panelRound1.add(txtPrasyarat, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 217, -1));

        jSeparator7.setBackground(new java.awt.Color(13, 13, 13));
        jSeparator7.setForeground(new java.awt.Color(13, 13, 13));
        panelRound1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 217, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(13, 13, 13));
        jLabel15.setText(":");
        panelRound1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(13, 13, 13));
        jLabel16.setText(":");
        panelRound1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(13, 13, 13));
        jLabel17.setText(":");
        panelRound1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        jSeparator8.setBackground(new java.awt.Color(13, 13, 13));
        jSeparator8.setForeground(new java.awt.Color(13, 13, 13));
        panelRound1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 217, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(13, 13, 13));
        jLabel18.setText(":");
        panelRound1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        cmbNip.setBackground(new java.awt.Color(229, 238, 210));
        cmbNip.setForeground(new java.awt.Color(0, 0, 0));
        cmbNip.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbNip.setLabeText("Dosen Pengampu");
        cmbNip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbNipFocusLost(evt);
            }
        });
        panelRound1.add(cmbNip, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 223, 40));

        cmbKodeProdi.setBackground(new java.awt.Color(229, 238, 210));
        cmbKodeProdi.setForeground(new java.awt.Color(0, 0, 0));
        cmbKodeProdi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbKodeProdi.setLabeText("Program Studi");
        cmbKodeProdi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbKodeProdiFocusLost(evt);
            }
        });
        panelRound1.add(cmbKodeProdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 223, 40));

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

        jSeparator3.setBackground(new java.awt.Color(13, 13, 13));
        jSeparator3.setForeground(new java.awt.Color(13, 13, 13));
        panelRound1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 217, 10));

        txtSem.setBackground(new java.awt.Color(229, 238, 210));
        txtSem.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtSem.setForeground(new java.awt.Color(13, 13, 13));
        txtSem.setBorder(null);
        panelRound1.add(txtSem, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 217, -1));

        btnEdit.setBackground(new java.awt.Color(28, 49, 68));
        btnEdit.setForeground(new java.awt.Color(229, 238, 210));
        btnEdit.setText("Edit ");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        panelRound1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 150, 50));

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
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        this.dispose();
        try {
           Dashboard_Admin.openFrame(Dashboard_Admin.matkulProdi);
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
        String kodeMatkul = txtKodeMatkul.getText();
        String nmMatkul = txtNmMatkul.getText();
        String status = txtStatus.getText();
        String prasyarat = txtPrasyarat.getText();
        String semester = txtSem.getText();
        String sks = txtSks.getText();
        try {
            sql = "UPDATE matkul SET nmMatkul ='"+nmMatkul+"', "
            + "sks ='"+sks+"', "
            + "semester ='"+semester+"', "
            + " kodeProdi='"+kodeProdi+"', "
            + "status='"+status+"', "
            + "prasyarat='"+prasyarat+"', "
            + "nip='"+nip+"' "
            + "WHERE kodeMatkul = '"+kodeMatkul+"';";

            Connection conn = Koneksi.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil diedit!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

        try {
            this.dispose();
            FrmDataMatkulProdi dataMatkul = new FrmDataMatkulProdi();
            dataMatkul.setLocation(415,140);
            dataMatkul.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            if (txtKodeMatkul.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Anda belum memilih data", "Pesan", JOptionPane.ERROR_MESSAGE);
            }else{
                int confirm;
                confirm = JOptionPane.showConfirmDialog(null,"Apakah anda yakin ingin menghapus data?", "Konfirmasi",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(confirm == 0){
                    try{
                        sql = "DELETE FROM matkul WHERE kodeMatkul = '" + txtKodeMatkul.getText() + "'";
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
            FrmDataMatkulProdi matkulProdi = new FrmDataMatkulProdi();
            matkulProdi.setLocation(415,140);
            matkulProdi.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(FrmEditMhs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        nip = FrmDataMatkulProdi.cmbNip;
        kodeProdi = FrmDataMatkulProdi.cmbKodeProdi;
        try {
            String sql1,sql2; 
            sql1 = "SELECT kodeProdi,nama FROM prodi";
            sql2 = "SELECT nip,nmDosen FROM dosen";
            Connection conn = Koneksi.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql1);
            while(rs.next()){
                cmbKodeProdi.addItem(rs.getString("nama"));
            }
            Connection kon = Koneksi.getConnection();
            Statement stm = kon.createStatement();
            ResultSet rslt = stm.executeQuery(sql2);
            while(rslt.next()){
                cmbNip.addItem(rslt.getString("nmDosen"));
            }
            
            String sql3 = "SELECT nama FROM prodi WHERE kodeProdi = '" + kodeProdi+ "';";
            Connection koneksi = Koneksi.getConnection();
            Statement statement = koneksi.createStatement();
            ResultSet result = statement.executeQuery(sql3);
            if(result.next()){
                cmbKodeProdi.setSelectedItem(result.getString("nama"));
            }
            System.out.println(kodeProdi);
            String sql4 = "SELECT nmDosen FROM dosen WHERE nip = '" + nip+ "';";
            Connection koneksi2 = Koneksi.getConnection();
            Statement statement2 = koneksi2.createStatement();
            ResultSet result2 = statement2.executeQuery(sql4);
            if(result2.next()){
                cmbNip.setSelectedItem(result2.getString("nmDosen"));
            }
            System.out.println(nip);
        } catch (Exception ex) {
            Logger.getLogger(FrmTambahMatkul.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

    private void cmbKodeProdiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbKodeProdiFocusLost
        try {
            String sql1 = "SELECT kodeProdi FROM prodi WHERE nama = '" +cmbKodeProdi.getSelectedItem().toString() + "';";
            Connection conn = Koneksi.getConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql1);
            if(rs.next()){
                kodeProdi = rs.getString("kodeProdi");
            }
            System.out.println(kodeProdi);
        } catch (Exception ex) {
            Logger.getLogger(FrmEditMatkul.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbKodeProdiFocusLost

    private void cmbNipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbNipFocusLost
        try {
            sql = "SELECT nip FROM dosen WHERE nmDosen = '"+cmbNip.getSelectedItem().toString()+"';";
            Connection conn = Koneksi.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                nip = rs.getString("nip");
            }
            System.out.println(nip);
        } catch (Exception ex) {
            Logger.getLogger(FrmEditMatkul.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbNipFocusLost

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
            java.util.logging.Logger.getLogger(FrmEditMatkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEditMatkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEditMatkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEditMatkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEditMatkul().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    public components.Combobox cmbKodeProdi;
    public components.Combobox cmbNip;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblBack;
    private components.PanelRound panelRound1;
    public javax.swing.JTextField txtKodeMatkul;
    public javax.swing.JTextField txtNmMatkul;
    public javax.swing.JTextField txtPrasyarat;
    public javax.swing.JTextField txtSem;
    public javax.swing.JTextField txtSks;
    public javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
