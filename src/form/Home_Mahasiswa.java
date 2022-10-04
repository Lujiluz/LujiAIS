package form;

import AppPackage.AnimationClass;
import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import login.FrmLoginMhs;

public class Home_Mahasiswa extends javax.swing.JFrame {
    AnimationClass ac = new AnimationClass();
    
    public Home_Mahasiswa() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        lblNamaMhs.setText(FrmLoginMhs.getNamaMhs());
        lblNim.setText(FrmLoginMhs.getNim());
        lblProdiSem.setText(FrmLoginMhs.getProdiSem());
        sliderShow();
    }

    public void sliderShow(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                int nb = 0;
                try{
                    while(true){
                        switch (nb) {
                            case 0:
                                Thread.sleep(2500);
                                ac.jLabelXLeft(0, -700, 12, 10, img1);
                                ac.jLabelXLeft(700, 0, 12, 10, img2);
                                ac.jLabelXLeft(1400, 700, 12, 10, img3);
                                nb++;
                                break;
                            case 1:
                                Thread.sleep(2500);
                                ac.jLabelXLeft(-700, -1400, 12, 10, img1);
                                ac.jLabelXLeft(0, -700, 12, 10, img2);
                                ac.jLabelXLeft(700, 0, 12, 10, img3);
                                nb++;
                                break;
                            case 2:
                                Thread.sleep(2500);
                                ac.jLabelXRight(-1400, -700, 12, 10, img1);
                                ac.jLabelXRight(-700, 0, 12, 10, img2);
                                ac.jLabelXRight(0, 700, 12, 10, img3);
                                nb++;
                                break;
                            case 3:
                                Thread.sleep(2500);
                                ac.jLabelXRight(-700, 0, 12, 10, img1);
                                ac.jLabelXRight(0, 700, 12, 10, img2);
                                ac.jLabelXRight(700, 1400, 12, 10, img3);
                                nb = 0;
                                break;
                        }
                    }
                }catch(Exception e){
                    
                }
            }
        }).start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new components.PanelRound();
        pnlTop = new components.PanelRound();
        lblNamaMhs = new javax.swing.JLabel();
        lblNim = new javax.swing.JLabel();
        lblProdiSem = new javax.swing.JLabel();
        panelRound1 = new components.PanelRound();
        lblTitle = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(757, 461));
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.CardLayout());

        container.setBackground(new java.awt.Color(229, 238, 210));
        container.setRoundBottomLeft(8);
        container.setRoundBottomRight(8);
        container.setRoundTopLeft(8);
        container.setRoundTopRight(8);
        container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTop.setBackground(new java.awt.Color(28, 49, 68));
        pnlTop.setRoundBottomLeft(8);
        pnlTop.setRoundBottomRight(8);
        pnlTop.setRoundTopLeft(8);
        pnlTop.setRoundTopRight(8);
        pnlTop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNamaMhs.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lblNamaMhs.setForeground(new java.awt.Color(255, 255, 255));
        lblNamaMhs.setText("-");
        pnlTop.add(lblNamaMhs, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 23, 570, -1));

        lblNim.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblNim.setForeground(new java.awt.Color(255, 255, 255));
        lblNim.setText("-");
        pnlTop.add(lblNim, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 580, -1));

        lblProdiSem.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblProdiSem.setForeground(new java.awt.Color(237, 91, 91));
        lblProdiSem.setText("Ilmu Filsafat, Semester 2");
        pnlTop.add(lblProdiSem, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 237, 20));

        container.add(pnlTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 700, 190));

        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Pusat Informasi Mahasiswa");
        lblTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTitleMouseClicked(evt);
            }
        });
        panelRound1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 690, 170));

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/slide1.png"))); // NOI18N
        panelRound1.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/slide2.png"))); // NOI18N
        panelRound1.add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, -1));

        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/slide3.png"))); // NOI18N
        panelRound1.add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 0, -1, -1));

        container.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 700, 180));

        getContentPane().add(container, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTitleMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.ui.ac.id/"));
        }catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_lblTitleMouseClicked

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
            java.util.logging.Logger.getLogger(Home_Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.PanelRound container;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    public javax.swing.JLabel lblNamaMhs;
    public javax.swing.JLabel lblNim;
    public javax.swing.JLabel lblProdiSem;
    private javax.swing.JLabel lblTitle;
    private components.PanelRound panelRound1;
    private components.PanelRound pnlTop;
    // End of variables declaration//GEN-END:variables
}
