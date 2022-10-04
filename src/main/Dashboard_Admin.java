package main;

import form.FrmAdmin;
import form.FrmDataDosen;
import form.FrmDataMatkulProdi;
import form.FrmDataMhs;
import form.FrmDataProdi;
import form.FrmEditMhs;
import form.FrmTambahMhs;
import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dashboard_Admin extends javax.swing.JFrame {

    public static FrmDataMhs dataMhs;
    public static FrmAdmin admin;
    public static FrmDataDosen dataDosen;
    public static FrmDataMatkulProdi matkulProdi;
    public static FrmDataProdi dataProdi;
    public Dashboard_Admin() throws Exception{
        initComponents();
        admin = new FrmAdmin();
        dataMhs = new FrmDataMhs();
        dataDosen = new FrmDataDosen();
        matkulProdi = new FrmDataMatkulProdi();
        dataProdi = new FrmDataProdi();
        setBackground(new Color(0,0,0,0));
    }

    
    public static void hover(JPanel panel,int r, int g, int b ){
        panel.setBackground(new Color(r,g,b));
    }
    
    public static void changeForeground(JLabel lbl,int r, int g, int b){
        lbl.setForeground(new Color(r,g,b));
    }
    
    public static void closeFrame(JFrame frame){
        frame.setVisible(false);  
    }
    public static void openFrame(JFrame frame){
        frame.setLocation(415,140);
        frame.setVisible(true);  
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new components.PanelRound();
        panelRound2 = new components.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlHome = new components.PanelRound();
        lblHome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pnlMahasiswa = new components.PanelRound();
        lblMahasiswa = new javax.swing.JLabel();
        pnlDosen = new components.PanelRound();
        lblDosen = new javax.swing.JLabel();
        pnlMatkulProdi = new components.PanelRound();
        lblMatkulProdi = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelRound1.setBackground(new java.awt.Color(212, 227, 181));
        panelRound1.setRoundBottomLeft(8);
        panelRound1.setRoundBottomRight(8);
        panelRound1.setRoundTopLeft(8);
        panelRound1.setRoundTopRight(8);

        panelRound2.setBackground(new java.awt.Color(28, 49, 68));
        panelRound2.setRoundBottomLeft(8);
        panelRound2.setRoundBottomRight(8);
        panelRound2.setRoundTopLeft(8);
        panelRound2.setRoundTopRight(8);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Slice 4.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator1.setBackground(new java.awt.Color(212, 227, 181));
        jSeparator1.setForeground(new java.awt.Color(212, 227, 181));

        pnlHome.setBackground(new java.awt.Color(28, 49, 68));
        pnlHome.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(212, 227, 181)));
        pnlHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlHomeMouseExited(evt);
            }
        });

        lblHome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblHome.setForeground(new java.awt.Color(212, 227, 181));
        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Home.png"))); // NOI18N
        lblHome.setText("           HOME");
        lblHome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHome, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Made with");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/hea.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("by");

        jLabel10.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(212, 227, 181));
        jLabel10.setText("Luji");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        pnlMahasiswa.setBackground(new java.awt.Color(28, 49, 68));
        pnlMahasiswa.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(212, 227, 181)));
        pnlMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlMahasiswaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlMahasiswaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlMahasiswaMouseExited(evt);
            }
        });

        lblMahasiswa.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblMahasiswa.setForeground(new java.awt.Color(212, 227, 181));
        lblMahasiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/student-admin.png"))); // NOI18N
        lblMahasiswa.setText("    Data Mahasiswa");
        lblMahasiswa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout pnlMahasiswaLayout = new javax.swing.GroupLayout(pnlMahasiswa);
        pnlMahasiswa.setLayout(pnlMahasiswaLayout);
        pnlMahasiswaLayout.setHorizontalGroup(
            pnlMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMahasiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMahasiswa, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        pnlMahasiswaLayout.setVerticalGroup(
            pnlMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMahasiswa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );

        pnlDosen.setBackground(new java.awt.Color(28, 49, 68));
        pnlDosen.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(212, 227, 181)));
        pnlDosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDosenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlDosenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlDosenMouseExited(evt);
            }
        });

        lblDosen.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDosen.setForeground(new java.awt.Color(212, 227, 181));
        lblDosen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dosen2.png"))); // NOI18N
        lblDosen.setText("       Data Dosen");
        lblDosen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout pnlDosenLayout = new javax.swing.GroupLayout(pnlDosen);
        pnlDosen.setLayout(pnlDosenLayout);
        pnlDosenLayout.setHorizontalGroup(
            pnlDosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDosenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDosen, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        pnlDosenLayout.setVerticalGroup(
            pnlDosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDosen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );

        pnlMatkulProdi.setBackground(new java.awt.Color(28, 49, 68));
        pnlMatkulProdi.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(212, 227, 181)));
        pnlMatkulProdi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlMatkulProdiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlMatkulProdiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlMatkulProdiMouseExited(evt);
            }
        });

        lblMatkulProdi.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblMatkulProdi.setForeground(new java.awt.Color(212, 227, 181));
        lblMatkulProdi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/matkul-prodi.png"))); // NOI18N
        lblMatkulProdi.setText("   Data Matkul/Prodi");
        lblMatkulProdi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout pnlMatkulProdiLayout = new javax.swing.GroupLayout(pnlMatkulProdi);
        pnlMatkulProdi.setLayout(pnlMatkulProdiLayout);
        pnlMatkulProdiLayout.setHorizontalGroup(
            pnlMatkulProdiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMatkulProdiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMatkulProdi, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        pnlMatkulProdiLayout.setVerticalGroup(
            pnlMatkulProdiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMatkulProdi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMatkulProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlDosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlMatkulProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel10)))
                .addContainerGap())
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/AIS-ShadowedB.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/exit 1.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 404, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(344, 344, 344))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 331, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(304, 304, 304))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnlHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHomeMouseClicked
        try {
            closeFrame(dataMhs);
            closeFrame(dataDosen);
            closeFrame(matkulProdi);
            closeFrame(dataProdi);
            openFrame(admin);

        } catch (Exception ex) {
            Logger.getLogger(Dashboard_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pnlHomeMouseClicked

    private void pnlHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHomeMouseEntered
        hover(pnlHome, 212,227,181);
        changeForeground(lblHome, 28, 49, 68);
    }//GEN-LAST:event_pnlHomeMouseEntered

    private void pnlHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHomeMouseExited
        hover(pnlHome, 28,49,68);
        changeForeground(lblHome, 212,227,181);
    }//GEN-LAST:event_pnlHomeMouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.instagram.com/lujiluz_/"));
        }catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void pnlMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMahasiswaMouseClicked
        closeFrame(admin);
        closeFrame(dataDosen);
        closeFrame(matkulProdi);
        closeFrame(dataProdi);
        openFrame(dataMhs);
    }//GEN-LAST:event_pnlMahasiswaMouseClicked

    private void pnlMahasiswaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMahasiswaMouseEntered
        hover(pnlMahasiswa, 212,227,181);
        changeForeground(lblMahasiswa, 28, 49, 68);
    }//GEN-LAST:event_pnlMahasiswaMouseEntered

    private void pnlMahasiswaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMahasiswaMouseExited
        hover(pnlMahasiswa, 28,49,68);
        changeForeground(lblMahasiswa, 212,227,181);
    }//GEN-LAST:event_pnlMahasiswaMouseExited

    private void pnlDosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDosenMouseClicked
        closeFrame(admin);
        openFrame(dataDosen);
        closeFrame(matkulProdi);
        closeFrame(dataProdi);
        closeFrame(dataMhs);
    }//GEN-LAST:event_pnlDosenMouseClicked

    private void pnlDosenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDosenMouseEntered
        hover(pnlDosen, 212,227,181);
        changeForeground(lblDosen, 28, 49, 68);
    }//GEN-LAST:event_pnlDosenMouseEntered

    private void pnlDosenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDosenMouseExited
        hover(pnlDosen, 28,49,68);
        changeForeground(lblDosen, 212,227,181);
    }//GEN-LAST:event_pnlDosenMouseExited

    private void pnlMatkulProdiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMatkulProdiMouseClicked
        closeFrame(admin);
        closeFrame(dataDosen);
        closeFrame(dataProdi);
        closeFrame(dataMhs);
        openFrame(matkulProdi);
    }//GEN-LAST:event_pnlMatkulProdiMouseClicked

    private void pnlMatkulProdiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMatkulProdiMouseEntered
        hover(pnlMatkulProdi, 212,227,181);
        changeForeground(lblMatkulProdi, 28, 49, 68);
    }//GEN-LAST:event_pnlMatkulProdiMouseEntered

    private void pnlMatkulProdiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMatkulProdiMouseExited
        hover(pnlMatkulProdi, 28,49,68);
        changeForeground(lblMatkulProdi, 212,227,181);
    }//GEN-LAST:event_pnlMatkulProdiMouseExited

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
            java.util.logging.Logger.getLogger(Dashboard_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Dashboard_Admin().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Dashboard_Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDosen;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblMahasiswa;
    private javax.swing.JLabel lblMatkulProdi;
    private components.PanelRound panelRound1;
    private components.PanelRound panelRound2;
    private components.PanelRound pnlDosen;
    private components.PanelRound pnlHome;
    private components.PanelRound pnlMahasiswa;
    private components.PanelRound pnlMatkulProdi;
    // End of variables declaration//GEN-END:variables
}
