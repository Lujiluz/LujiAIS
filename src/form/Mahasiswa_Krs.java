package form;

import config.Koneksi;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import main.Dashboard_Mahasiswa;

public class Mahasiswa_Krs extends javax.swing.JFrame {
    private DefaultTableModel model = new DefaultTableModel();
    private String sql;
    private ResultSet rs = null;
    
    public Mahasiswa_Krs() throws Exception {
        initComponents();
        setBackground(new Color(0,0,0,0));
        showData();
        totalData();
    }

    private void totalData(){
        int total = 0;
        for(int i = 0; i < model.getRowCount();i++){
            String temp = model.getValueAt(i, 2).toString();
            total += Integer.parseInt(temp);
        }
        lblTotal.setText(String.valueOf(total));
    }
    
    private void showData() throws Exception{
        Home_Mahasiswa homeMhs = new Home_Mahasiswa();
        String prodiSem = homeMhs.lblProdiSem.getText();
        String split1[] = prodiSem.split(", ",2);
        String prodi = split1[0];
        String potongLagi[] = split1[1].split(" ",2);
        String semester = potongLagi[1];
        
        for(int i = 0; i < tblDataMatkul.getColumnCount();i++){
            model.addColumn(tblDataMatkul.getColumnName(i));
        }
        tblDataMatkul.setModel(model);
        
        Connection conn = Koneksi.getConnection();
        Statement stmt = conn.createStatement();
        sql = "SELECT kodeMatkul, nmMatkul, sks,semester, status FROM matkul JOIN prodi USING (kodeProdi)" 
                +"WHERE prodi.nama = '"+prodi+"' AND semester = '"+semester+"'";
        rs = stmt.executeQuery(sql);
        while(rs.next()){
            model.addRow(new Object[]{
                rs.getString("kodeMatkul"),
                rs.getString("nmMatkul"),
                rs.getString("sks"),
                rs.getString("semester"),
                rs.getString("status"),
            });
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new components.PanelRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDataMatkul = new components.Table();
        jLabel1 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        pnlAmbilMatkul = new components.PanelRound();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlContainer.setBackground(new java.awt.Color(229, 238, 210));
        pnlContainer.setRoundBottomLeft(8);
        pnlContainer.setRoundBottomRight(8);
        pnlContainer.setRoundTopLeft(8);
        pnlContainer.setRoundTopRight(8);

        tblDataMatkul.setBackground(new java.awt.Color(129, 157, 182));
        tblDataMatkul.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Matkul", "Nama Matkul", "SKS", "Semester", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDataMatkul);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Total Sks :");

        lblTotal.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(0, 0, 0));

        pnlAmbilMatkul.setBackground(new java.awt.Color(177, 205, 122));
        pnlAmbilMatkul.setRoundBottomLeft(3);
        pnlAmbilMatkul.setRoundBottomRight(3);
        pnlAmbilMatkul.setRoundTopLeft(3);
        pnlAmbilMatkul.setRoundTopRight(3);
        pnlAmbilMatkul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAmbilMatkulMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlAmbilMatkulMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlAmbilMatkulMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ambil Matkul");

        javax.swing.GroupLayout pnlAmbilMatkulLayout = new javax.swing.GroupLayout(pnlAmbilMatkul);
        pnlAmbilMatkul.setLayout(pnlAmbilMatkulLayout);
        pnlAmbilMatkulLayout.setHorizontalGroup(
            pnlAmbilMatkulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAmbilMatkulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlAmbilMatkulLayout.setVerticalGroup(
            pnlAmbilMatkulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAmbilMatkulLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addComponent(pnlAmbilMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(25, Short.MAX_VALUE))))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlAmbilMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );

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

    private void pnlAmbilMatkulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAmbilMatkulMouseClicked
        try {
            Dashboard_Mahasiswa.closeFrame(new Mahasiswa_Krs());
            FrmCetakKrs cetakKrs = new FrmCetakKrs();
            cetakKrs.setLocation(450,140);
            cetakKrs.setVisible(true);
            this.dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_pnlAmbilMatkulMouseClicked

    private void pnlAmbilMatkulMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAmbilMatkulMouseEntered
        Dashboard_Mahasiswa.hover(pnlAmbilMatkul, 170, 195, 121);
    }//GEN-LAST:event_pnlAmbilMatkulMouseEntered

    private void pnlAmbilMatkulMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAmbilMatkulMouseExited
        Dashboard_Mahasiswa.hover(pnlAmbilMatkul, 177,205,122);
    }//GEN-LAST:event_pnlAmbilMatkulMouseExited

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
            java.util.logging.Logger.getLogger(Mahasiswa_Krs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa_Krs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa_Krs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa_Krs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Mahasiswa_Krs().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Mahasiswa_Krs.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTotal;
    private components.PanelRound pnlAmbilMatkul;
    private components.PanelRound pnlContainer;
    private components.Table tblDataMatkul;
    // End of variables declaration//GEN-END:variables
}
