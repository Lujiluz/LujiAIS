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

public class FrmTambahProdi extends javax.swing.JFrame {

    String sql,nip;
    public FrmTambahProdi() {
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
        txtKodeProdi.setText("");
        txtNmProdi.setText("");
        cmbKaProdi.setSelectedIndex((-1));
    }
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new components.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtKodeProdi = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtNmProdi = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cmbKaProdi = new components.Combobox();
        btnSimpan = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        lblBack = new javax.swing.JLabel();

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
        jLabel2.setText("Kode Prodi");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 100, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(13, 13, 13));
        jLabel3.setText("Nama Prodi");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 110, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(13, 13, 13));
        jLabel9.setText("Ketua Prodi");
        panelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(13, 13, 13));
        jLabel11.setText(":");
        panelRound1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(13, 13, 13));
        jLabel12.setText(":");
        panelRound1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        txtKodeProdi.setBackground(new java.awt.Color(229, 238, 210));
        txtKodeProdi.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtKodeProdi.setForeground(new java.awt.Color(13, 13, 13));
        txtKodeProdi.setBorder(null);
        panelRound1.add(txtKodeProdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 217, -1));

        jSeparator1.setBackground(new java.awt.Color(13, 13, 13));
        jSeparator1.setForeground(new java.awt.Color(13, 13, 13));
        panelRound1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 217, -1));

        txtNmProdi.setBackground(new java.awt.Color(229, 238, 210));
        txtNmProdi.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNmProdi.setForeground(new java.awt.Color(13, 13, 13));
        txtNmProdi.setBorder(null);
        panelRound1.add(txtNmProdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 217, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(13, 13, 13));
        jLabel17.setText(":");
        panelRound1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        cmbKaProdi.setBackground(new java.awt.Color(229, 238, 210));
        cmbKaProdi.setForeground(new java.awt.Color(0, 0, 0));
        cmbKaProdi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "S1", "S2" }));
        cmbKaProdi.setSelectedIndex(-1);
        cmbKaProdi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbKaProdi.setLabeText("Ketua Prodi");
        cmbKaProdi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbKaProdiFocusLost(evt);
            }
        });
        panelRound1.add(cmbKaProdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 223, 40));

        btnSimpan.setBackground(new java.awt.Color(28, 49, 68));
        btnSimpan.setForeground(new java.awt.Color(229, 238, 210));
        btnSimpan.setText("Simpan Data");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        panelRound1.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 150, 50));

        jSeparator4.setBackground(new java.awt.Color(13, 13, 13));
        jSeparator4.setForeground(new java.awt.Color(13, 13, 13));
        panelRound1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 217, 10));

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

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        String kodeMatkul = txtKodeProdi.getText();
        String nmMatkul = txtNmProdi.getText();

        try {
            sql = "INSERT INTO prodi VALUE ('"+kodeMatkul+"','"+nmMatkul+"','"+nip+"')";
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
        try {
            Dashboard_Admin.openFrame(Dashboard_Admin.dataProdi);
        } catch (Exception ex) {
            Logger.getLogger(FrmTambahMhs.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseEntered
        handCursor("entered");
    }//GEN-LAST:event_lblBackMouseEntered

    private void lblBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseExited
        handCursor("exited");
    }//GEN-LAST:event_lblBackMouseExited

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            sql = "SELECT nmDosen FROM dosen";
            Connection conn = Koneksi.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rslt = stmt.executeQuery(sql);
            cmbKaProdi.removeAllItems();
            while(rslt.next()){
                cmbKaProdi.addItem(rslt.getString("nmDosen"));
            }
            cmbKaProdi.setSelectedIndex(-1);
        } catch (Exception ex) {
            Logger.getLogger(FrmTambahProdi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

    private void cmbKaProdiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbKaProdiFocusLost
        try {
            sql = "SELECT nip FROM dosen WHERE nmDosen = '"+cmbKaProdi.getSelectedItem().toString()+"';";
            Connection conn = Koneksi.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rslt = stmt.executeQuery(sql);
            if(rslt.next()){
                nip = rslt.getString("nip");
            }
            System.out.println(nip);
        } catch (Exception ex) {
            Logger.getLogger(FrmEditProdi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbKaProdiFocusLost

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
            java.util.logging.Logger.getLogger(FrmTambahProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTambahProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTambahProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTambahProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTambahProdi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpan;
    public components.Combobox cmbKaProdi;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblBack;
    private components.PanelRound panelRound1;
    public javax.swing.JTextField txtKodeProdi;
    public javax.swing.JTextField txtNmProdi;
    // End of variables declaration//GEN-END:variables
}
