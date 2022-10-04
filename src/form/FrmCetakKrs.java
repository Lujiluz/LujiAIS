package form;

import config.Koneksi;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.io.File;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import login.FrmLoginMhs;
import main.Dashboard_Mahasiswa;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;

public class FrmCetakKrs extends javax.swing.JFrame {

    public FrmCetakKrs() throws Exception {
        initComponents();
        setBackground(new Color(229,238,210));
        loadReport();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new components.PanelRound();
        pnlReports = new components.PanelRound();
        lblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(229, 238, 210));
        setUndecorated(true);

        pnlContainer.setBackground(new java.awt.Color(229, 238, 210));
        pnlContainer.setRoundBottomLeft(8);
        pnlContainer.setRoundBottomRight(8);
        pnlContainer.setRoundTopLeft(8);
        pnlContainer.setRoundTopRight(8);
        pnlContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlReports.setBackground(new java.awt.Color(229, 238, 210));
        pnlReports.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlReports.setRoundBottomLeft(13);
        pnlReports.setRoundBottomRight(13);
        pnlReports.setRoundTopLeft(13);
        pnlReports.setRoundTopRight(13);

        javax.swing.GroupLayout pnlReportsLayout = new javax.swing.GroupLayout(pnlReports);
        pnlReports.setLayout(pnlReportsLayout);
        pnlReportsLayout.setHorizontalGroup(
            pnlReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 754, Short.MAX_VALUE)
        );
        pnlReportsLayout.setVerticalGroup(
            pnlReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        pnlContainer.add(pnlReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 760, 400));

        lblBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back-btn.png"))); // NOI18N
        lblBack.setToolTipText("");
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
        pnlContainer.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 48, 46));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
       this.dispose();
//       Home_Mahasiswa homeMhs = new Home_Mahasiswa();
//       homeMhs.lblNamaMhs.setText(FrmLoginMhs.getNamaMhs());
//       homeMhs.lblNim.setText(FrmLoginMhs.getNim());
//       homeMhs.lblProdiSem.setText(FrmLoginMhs.getProdiSem());
//       homeMhs.setLocation(450, 140);
       Dashboard_Mahasiswa.closeFrame(new Home_Mahasiswa());
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseEntered
        Cursor cursor = Cursor.getDefaultCursor();
        cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
        setCursor(cursor);
    }//GEN-LAST:event_lblBackMouseEntered

    private void lblBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseExited
        setCursor(0);
    }//GEN-LAST:event_lblBackMouseExited

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
            java.util.logging.Logger.getLogger(FrmCetakKrs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCetakKrs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCetakKrs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCetakKrs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmCetakKrs().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(FrmCetakKrs.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    
     private void loadReport() throws Exception{
        try {
            Connection conn = Koneksi.getConnection();
            HashMap a = new HashMap();
            a.put("key",FrmLoginMhs.getNim());
//            Path pathToFile = Paths.get("src/reports", "KrsReport.jrxml");
            
            pnlReports.removeAll();
            pnlReports.repaint();
            pnlReports.revalidate();
            
            JasperDesign jDesign = JRXmlLoader.load("E:\\Me\\KULIAH\\BOOTCAMP CSR CODING\\PROJECT AKHIR\\app\\LujiAIS\\src\\reports\\KrsReport.jrxml");
            JasperReport jReport = JasperCompileManager.compileReport(jDesign);
            JasperPrint jPrint = JasperFillManager.fillReport(jReport, a,conn);
            
            JRViewer v = new JRViewer(jPrint);
            pnlReports.setLayout(new BorderLayout());
            pnlReports.add(v);
        } catch (JRException ex) {
            Logger.getLogger(FrmCetakKrs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBack;
    private components.PanelRound pnlContainer;
    private components.PanelRound pnlReports;
    // End of variables declaration//GEN-END:variables
}
